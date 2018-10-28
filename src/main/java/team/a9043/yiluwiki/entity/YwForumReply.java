package team.a9043.yiluwiki.entity;

import org.hibernate.validator.constraints.Length;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumReply;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumReply;

import java.time.LocalDateTime;

public class YwForumReply {
    private Integer yfrId;

    @Length(min = 5, max = 1000, groups = {InsertYwForumReply.class, ModifyYwForumReply.class})
    private String yfrContent;

    private Integer yfrReplyTo;

    private Integer yfpId;

    private Integer yuId;

    private LocalDateTime yfrCreateTime;

    private LocalDateTime yfrUpdateTime;

    public Integer getYfrId() {
        return yfrId;
    }

    public void setYfrId(Integer yfrId) {
        this.yfrId = yfrId;
    }

    public String getYfrContent() {
        return yfrContent;
    }

    public void setYfrContent(String yfrContent) {
        this.yfrContent = yfrContent == null ? null : yfrContent.trim();
    }

    public Integer getYfrReplyTo() {
        return yfrReplyTo;
    }

    public void setYfrReplyTo(Integer yfrReplyTo) {
        this.yfrReplyTo = yfrReplyTo;
    }

    public Integer getYfpId() {
        return yfpId;
    }

    public void setYfpId(Integer yfpId) {
        this.yfpId = yfpId;
    }

    public Integer getYuId() {
        return yuId;
    }

    public void setYuId(Integer yuId) {
        this.yuId = yuId;
    }

    public LocalDateTime getYfrCreateTime() {
        return yfrCreateTime;
    }

    public void setYfrCreateTime(LocalDateTime yfrCreateTime) {
        this.yfrCreateTime = yfrCreateTime;
    }

    public LocalDateTime getYfrUpdateTime() {
        return yfrUpdateTime;
    }

    public void setYfrUpdateTime(LocalDateTime yfrUpdateTime) {
        this.yfrUpdateTime = yfrUpdateTime;
    }
}