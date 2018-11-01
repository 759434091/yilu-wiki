package team.a9043.yiluwiki.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import team.a9043.yiluwiki.entity.*;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.exception.InvalidPermissionException;
import team.a9043.yiluwiki.mapper.YwForumPostMapper;
import team.a9043.yiluwiki.mapper.YwForumReplyMapper;
import team.a9043.yiluwiki.mapper.YwUserMapper;
import team.a9043.yiluwiki.service_pojo.VoidOperationResponse;
import team.a9043.yiluwiki.service_pojo.VoidSuccessOperationResponse;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ForumService {
    @Resource
    private YwForumPostMapper ywForumPostMapper;
    @Resource
    private YwForumReplyMapper ywForumReplyMapper;
    @Resource
    private YwUserMapper ywUserMapper;

    public List<YwForumPost> getPosts(Integer page, Integer pageSize) {
        YwForumPostExample ywForumPostExample = new YwForumPostExample();
        ywForumPostExample.setOrderByClause("yfp_update_time desc");
        PageHelper.startPage(page, pageSize);
        List<YwForumPost> ywForumPostList = ywForumPostMapper.selectByExample(ywForumPostExample);

        List<Integer> yuIdList = ywForumPostList
                .stream()
                .map(YwForumPost::getYuId)
                .collect(Collectors.toList());
        if (yuIdList.isEmpty())
            return ywForumPostList;

        YwUserExample ywUserExample = new YwUserExample();
        ywUserExample.createCriteria().andYuIdIn(yuIdList);
        List<YwUser> ywUserList = ywUserMapper.selectByExample(ywUserExample);
        ywForumPostList.forEach(p -> p.setYwUser(ywUserList
                .stream()
                .filter(u -> u.getYuId().equals(p.getYuId()))
                .peek(u -> u.setYuPassword(null))
                .findAny()
                .orElse(null)));
        return ywForumPostList;
    }

    public YwForumPost getPost(Integer yfpId) throws InvalidParameterException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        YwUser ywUser = ywUserMapper.selectByPrimaryKey(ywForumPost.getYuId());
        if (ywUser != null) {
            ywUser.setYuPassword(null);
            ywForumPost.setYwUser(ywUser);
        }
        return ywForumPost;
    }

    public YwForumPost insertPost(YwUser ywUser, YwForumPost ywForumPost) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ywForumPost.setYfpCreateTime(localDateTime);
        ywForumPost.setYfpUpdateTime(localDateTime);
        ywForumPost.setYuId(ywUser.getYuId());

        ywForumPostMapper.insert(ywForumPost);
        return ywForumPost;
    }

    public VoidOperationResponse deletePost(YwUser ywUser, Integer yfpId) throws InvalidParameterException, InvalidPermissionException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        if (!ywForumPost.getYuId().equals(ywUser.getYuId()))
            throw new InvalidPermissionException("Invalid permission in ForumPost " + yfpId);
        ywForumPostMapper.deleteByPrimaryKey(yfpId);
        return VoidSuccessOperationResponse.SUCCESS;
    }

    public YwForumPost modifyPost(YwUser ywUser, Integer yfpId, YwForumPost ywForumPost) throws InvalidParameterException, InvalidPermissionException {
        YwForumPost stdForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == stdForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        if (!stdForumPost.getYuId().equals(ywUser.getYuId()))
            throw new InvalidPermissionException("Invalid permission in ForumPost " + yfpId);
        LocalDateTime localDateTime = LocalDateTime.now();
        stdForumPost.setYfpContent(ywForumPost.getYfpContent());
        stdForumPost.setYfpAbstract(ywForumPost.getYfpAbstract());
        stdForumPost.setYfpTitle(ywForumPost.getYfpTitle());
        stdForumPost.setYfpUpdateTime(localDateTime);

        ywForumPostMapper.updateByPrimaryKeyWithBLOBs(stdForumPost);
        return stdForumPost;
    }

    public List<YwForumReply> getReplies(Integer yfpId, Integer page, Integer pageSize) throws InvalidParameterException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);

        YwForumReplyExample ywForumReplyExample = new YwForumReplyExample();
        ywForumReplyExample.createCriteria().andYfpIdEqualTo(yfpId);
        ywForumReplyExample.setOrderByClause("yfr_create_time asc");

        PageHelper.startPage(page, pageSize);
        List<YwForumReply> ywForumReplyList = ywForumReplyMapper.selectByExample(ywForumReplyExample);
        List<Integer> yuIdList = ywForumReplyList
                .stream()
                .map(YwForumReply::getYuId)
                .collect(Collectors.toList());
        if (yuIdList.isEmpty())
            return ywForumReplyList;

        YwUserExample ywUserExample = new YwUserExample();
        ywUserExample.createCriteria().andYuIdIn(yuIdList);
        List<YwUser> ywUserList = ywUserMapper.selectByExample(ywUserExample);
        ywForumReplyList.forEach(p -> p.setYwUser(ywUserList
                .stream()
                .filter(u -> u.getYuId().equals(p.getYuId()))
                .peek(u -> u.setYuPassword(null))
                .findAny()
                .orElse(null)));
        return ywForumReplyList;
    }

    public YwForumReply insertReply(YwUser ywUser, Integer yfpId, YwForumReply ywForumReply) throws InvalidParameterException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        if (null != ywForumReply.getYfrReplyTo()) {
            YwForumReply toForumReply = ywForumReplyMapper.selectByPrimaryKey(ywForumReply.getYfrReplyTo());
            if (null == toForumReply)
                throw new InvalidParameterException("Invalid reply ForumReply " + ywForumReply.getYfrReplyTo());
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        ywForumReply.setYfrCreateTime(localDateTime);
        ywForumReply.setYfrUpdateTime(localDateTime);
        ywForumReply.setYfpId(yfpId);
        ywForumReply.setYuId(ywUser.getYuId());

        ywForumReplyMapper.insert(ywForumReply);
        return ywForumReply;
    }

    public VoidOperationResponse deleteReply(YwUser ywUser, Integer yfpId, Integer yfrId) throws InvalidParameterException, InvalidPermissionException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        YwForumReply ywForumReply = ywForumReplyMapper.selectByPrimaryKey(yfrId);
        if (null == ywForumReply)
            throw new InvalidParameterException("Invalid ForumReply " + yfrId);
        if (!ywForumReply.getYuId().equals(ywUser.getYuId()))
            throw new InvalidPermissionException("Invalid permission in ForumReply " + yfpId);

        ywForumReplyMapper.deleteByPrimaryKey(yfrId);
        return VoidSuccessOperationResponse.SUCCESS;
    }

    public YwForumReply modifyReply(YwUser ywUser, Integer yfpId, Integer yfrId, YwForumReply ywForumReply) throws InvalidParameterException {
        YwForumPost ywForumPost = ywForumPostMapper.selectByPrimaryKey(yfpId);
        if (null == ywForumPost)
            throw new InvalidParameterException("Invalid ForumPost " + yfpId);
        YwForumReply stdForumReply = ywForumReplyMapper.selectByPrimaryKey(yfrId);
        if (null == stdForumReply)
            throw new InvalidParameterException("Invalid ForumReply " + yfrId);

        LocalDateTime localDateTime = LocalDateTime.now();
        stdForumReply.setYfrUpdateTime(localDateTime);
        stdForumReply.setYfrContent(ywForumReply.getYfrContent());
        ywForumReplyMapper.updateByPrimaryKey(stdForumReply);
        return stdForumReply;
    }
}
