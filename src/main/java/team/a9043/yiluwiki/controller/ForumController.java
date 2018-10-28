package team.a9043.yiluwiki.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumPost;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumReply;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumPost;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumReply;
import team.a9043.yiluwiki.entity.YwForumPost;
import team.a9043.yiluwiki.entity.YwForumReply;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.exception.InvalidPermissionException;
import team.a9043.yiluwiki.security.tokenuser.TokenUser;
import team.a9043.yiluwiki.service.ForumService;
import team.a9043.yiluwiki.service_pojo.VoidOperationResponse;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ForumController {
    @Resource
    private ForumService forumService;

    @GetMapping("/posts")
    public List<YwForumPost> getPosts(@RequestParam Integer page,
                                      @RequestParam Integer pageSize) throws InvalidParameterException {
        if (page < 1)
            throw new InvalidParameterException("page must bigger than 0");
        if (pageSize < 1 || pageSize > 500)
            throw new InvalidParameterException("pageSize must between 1 and 500");
        return forumService.getPosts(page, pageSize);
    }

    @GetMapping("/posts/{yfpId}")
    public YwForumPost getPost(@PathVariable Integer yfpId) throws InvalidParameterException {
        return forumService.getPost(yfpId);
    }

    @PostMapping("/posts")
    public YwForumPost insertPost(@TokenUser YwUser ywUser,
                                  @RequestBody @Validated(InsertYwForumPost.class) YwForumPost ywForumPost,
                                  BindingResult bindingResult) throws InvalidParameterException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return forumService.insertPost(ywUser, ywForumPost);
    }

    @DeleteMapping("/posts/{yfpId}")
    public VoidOperationResponse deletePost(@TokenUser YwUser ywUser, @PathVariable Integer yfpId) throws InvalidParameterException, InvalidPermissionException {
        return forumService.deletePost(ywUser, yfpId);
    }

    @PutMapping("/posts/{yfpId}")
    public YwForumPost modifyPost(@TokenUser YwUser ywUser,
                                  @PathVariable Integer yfpId,
                                  @RequestBody @Validated(ModifyYwForumPost.class) YwForumPost ywForumPost,
                                  BindingResult bindingResult) throws InvalidParameterException, InvalidPermissionException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return forumService.modifyPost(ywUser, yfpId, ywForumPost);
    }

    @GetMapping("/posts/{yfpId}/replies")
    public List<YwForumReply> getReplies(@PathVariable Integer yfpId,
                                         @RequestParam Integer page,
                                         @RequestParam Integer pageSize) throws InvalidParameterException {
        if (page < 1)
            throw new InvalidParameterException("page must bigger than 0");
        if (pageSize < 1 || pageSize > 500)
            throw new InvalidParameterException("pageSize must between 1 and 500");
        return forumService.getReplies(yfpId, page, pageSize);
    }

    @PostMapping("/posts/{yfpId}/replies")
    public YwForumReply insertReply(@TokenUser YwUser ywUser,
                                    @PathVariable Integer yfpId,
                                    @RequestBody @Validated(InsertYwForumReply.class) YwForumReply ywForumReply,
                                    BindingResult bindingResult) throws InvalidParameterException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return forumService.insertReply(ywUser, yfpId, ywForumReply);
    }

    @DeleteMapping("/posts/{yfpId}/replies/{yfrId}")
    public VoidOperationResponse deleteReply(@TokenUser YwUser ywUser,
                                             @PathVariable Integer yfpId,
                                             @PathVariable Integer yfrId) throws InvalidParameterException, InvalidPermissionException {
        return forumService.deleteReply(ywUser, yfpId, yfrId);
    }

    @PutMapping("/posts/{yfpId}/replies/{yfrId}")
    public YwForumReply modifyReply(@TokenUser YwUser ywUser,
                                    @PathVariable Integer yfpId,
                                    @PathVariable Integer yfrId,
                                    @RequestBody @Validated(ModifyYwForumReply.class) YwForumReply ywForumReply,
                                    BindingResult bindingResult) throws InvalidParameterException {
        if (bindingResult.hasErrors())
            throw new InvalidParameterException(bindingResult.toString());
        return forumService.modifyReply(ywUser, yfpId, yfrId, ywForumReply);

    }
}
