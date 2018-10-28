package team.a9043.yiluwiki.entity;

import org.hibernate.validator.constraints.Length;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumPost;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumPost;

import java.time.LocalDateTime;

public class YwForumPost {
    private Integer yfpId;

    @Length(min = 5, max = 60, groups = {InsertYwForumPost.class, ModifyYwForumPost.class})
    private String yfpTitle;

    private LocalDateTime yfpCreateTime;

    private LocalDateTime yfpUpdateTime;

    private Integer yuId;

    @Length(min = 10, max = 65535, groups = {InsertYwForumPost.class, ModifyYwForumPost.class})
    private String yfpContent;

    public Integer getYfpId() {
        return yfpId;
    }

    public void setYfpId(Integer yfpId) {
        this.yfpId = yfpId;
    }

    public String getYfpTitle() {
        return yfpTitle;
    }

    public void setYfpTitle(String yfpTitle) {
        this.yfpTitle = yfpTitle == null ? null : yfpTitle.trim();
    }

    public LocalDateTime getYfpCreateTime() {
        return yfpCreateTime;
    }

    public void setYfpCreateTime(LocalDateTime yfpCreateTime) {
        this.yfpCreateTime = yfpCreateTime;
    }

    public LocalDateTime getYfpUpdateTime() {
        return yfpUpdateTime;
    }

    public void setYfpUpdateTime(LocalDateTime yfpUpdateTime) {
        this.yfpUpdateTime = yfpUpdateTime;
    }

    public Integer getYuId() {
        return yuId;
    }

    public void setYuId(Integer yuId) {
        this.yuId = yuId;
    }

    public String getYfpContent() {
        return yfpContent;
    }

    public void setYfpContent(String yfpContent) {
        this.yfpContent = yfpContent == null ? null : yfpContent.trim();
    }
}