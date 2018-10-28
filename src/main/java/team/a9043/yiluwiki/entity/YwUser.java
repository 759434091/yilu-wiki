package team.a9043.yiluwiki.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户实体")
public class YwUser {
    @ApiModelProperty("wiki用户ID")
    private Integer yuId;

    @ApiModelProperty("github登录名")
    private String yuLogin;

    @ApiModelProperty("github.NodeId")
    private String yuNodeId;

    @ApiModelProperty("github头像")
    private String yuAvatarUrl;

    @ApiModelProperty("github主页")
    private String yuHtmlUrl;

    @ApiModelProperty("github昵称")
    private String yuName;

    @ApiModelProperty("github介绍")
    private String yuBio;

    @ApiModelProperty("系统密码, 暂无用处")
    private String yuPassword;

    @ApiModelProperty("github用户ID")
    private Integer yuGithubId;

    public Integer getYuId() {
        return yuId;
    }

    public void setYuId(Integer yuId) {
        this.yuId = yuId;
    }

    public String getYuLogin() {
        return yuLogin;
    }

    public void setYuLogin(String yuLogin) {
        this.yuLogin = yuLogin == null ? null : yuLogin.trim();
    }

    public String getYuNodeId() {
        return yuNodeId;
    }

    public void setYuNodeId(String yuNodeId) {
        this.yuNodeId = yuNodeId == null ? null : yuNodeId.trim();
    }

    public String getYuAvatarUrl() {
        return yuAvatarUrl;
    }

    public void setYuAvatarUrl(String yuAvatarUrl) {
        this.yuAvatarUrl = yuAvatarUrl == null ? null : yuAvatarUrl.trim();
    }

    public String getYuHtmlUrl() {
        return yuHtmlUrl;
    }

    public void setYuHtmlUrl(String yuHtmlUrl) {
        this.yuHtmlUrl = yuHtmlUrl == null ? null : yuHtmlUrl.trim();
    }

    public String getYuName() {
        return yuName;
    }

    public void setYuName(String yuName) {
        this.yuName = yuName == null ? null : yuName.trim();
    }

    public String getYuBio() {
        return yuBio;
    }

    public void setYuBio(String yuBio) {
        this.yuBio = yuBio == null ? null : yuBio.trim();
    }

    public String getYuPassword() {
        return yuPassword;
    }

    public void setYuPassword(String yuPassword) {
        this.yuPassword = yuPassword == null ? null : yuPassword.trim();
    }

    public Integer getYuGithubId() {
        return yuGithubId;
    }

    public void setYuGithubId(Integer yuGithubId) {
        this.yuGithubId = yuGithubId;
    }
}