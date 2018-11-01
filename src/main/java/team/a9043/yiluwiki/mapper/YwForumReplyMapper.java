package team.a9043.yiluwiki.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.a9043.yiluwiki.entity.YwForumReply;
import team.a9043.yiluwiki.entity.YwForumReplyExample;

public interface YwForumReplyMapper {
    long countByExample(YwForumReplyExample example);

    int deleteByExample(YwForumReplyExample example);

    int deleteByPrimaryKey(Integer yfrId);

    int insert(YwForumReply record);

    int insertSelective(YwForumReply record);

    List<YwForumReply> selectByExample(YwForumReplyExample example);

    YwForumReply selectByPrimaryKey(Integer yfrId);

    int updateByExampleSelective(@Param("record") YwForumReply record, @Param("example") YwForumReplyExample example);

    int updateByExample(@Param("record") YwForumReply record, @Param("example") YwForumReplyExample example);

    int updateByPrimaryKeySelective(YwForumReply record);

    int updateByPrimaryKey(YwForumReply record);

    Integer selectMaxFloor(@Param("yfpId") Integer yfpId);
}