package team.a9043.yiluwiki.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import team.a9043.yiluwiki.controller.valid_group.InsertYwForumPost;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwForumPost;

import java.time.LocalDateTime;

@ApiModel(description = "帖子实体")
public class YwForumPost {
    @ApiModelProperty("插入修改时为空")
    private Integer yfpId;

    @Length(min = 5, max = 60, groups = {InsertYwForumPost.class, ModifyYwForumPost.class})
    @ApiModelProperty("notnull & length[5, 60]")
    private String yfpTitle;

    @Length(min = 5, max = 50, groups = {InsertYwForumPost.class, ModifyYwForumPost.class})
    @ApiModelProperty("帖子摘要")
    private String yfpAbstract;

    @ApiModelProperty("插入修改时为空")
    private LocalDateTime yfpCreateTime;

    @ApiModelProperty("插入修改时为空")
    private LocalDateTime yfpUpdateTime;

    @ApiModelProperty("插入修改时为空")
    private Integer yuId;

    @Length(min = 10, max = 65535, groups = {InsertYwForumPost.class, ModifyYwForumPost.class})
    @ApiModelProperty("notnull & length[10, 65535]")
    private String yfpContent;

    public Integer getYfpId() {
        return yfpId;
    }

    public void setYfpId(Integer yfpId) {
        this.yfpId = yfpId;
    }

    public String getYfpAbstract() {
        return yfpAbstract;
    }

    public void setYfpAbstract(String yfpAbstract) {
        this.yfpAbstract = yfpAbstract == null ? null : yfpAbstract.trim();
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private YwUser ywUser;

    public YwUser getYwUser() {
        return ywUser;
    }

    public void setYwUser(YwUser ywUser) {
        this.ywUser = ywUser;
    }
}