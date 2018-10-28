package team.a9043.yiluwiki.entity;

public class YwUser {
    private Integer yuId;

    private String yuLogin;

    private String yuNodeId;

    private String yuAvatarUrl;

    private String yuHtmlUrl;

    private String yuName;

    private String yuBio;

    private String yuPassword;

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