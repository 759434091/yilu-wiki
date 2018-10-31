package team.a9043.yiluwiki.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumReply;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumReply;

import java.time.LocalDateTime;

@ApiModel(description = "帖子回复实体")
public class YwForumReply {
    @ApiModelProperty("插入修改时为空")
    private Integer yfrId;

    @Length(min = 5, max = 1000, groups = {InsertYwForumReply.class, ModifyYwForumReply.class})
    @ApiModelProperty("notnull & length[5, 1000]")
    private String yfrContent;

    @ApiModelProperty("插入为空时不回复某一楼层,不为空时回复某一楼层; 修改时为空")
    private Integer yfrReplyTo;

    @ApiModelProperty("插入修改时为空")
    private Integer yfpId;

    @ApiModelProperty("插入修改时为空")
    private Integer yuId;

    @ApiModelProperty("插入修改时为空")
    private LocalDateTime yfrCreateTime;

    @ApiModelProperty("插入修改时为空")
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private YwUser ywUser;

    public YwUser getYwUser() {
        return ywUser;
    }

    public void setYwUser(YwUser ywUser) {
        this.ywUser = ywUser;
    }
}