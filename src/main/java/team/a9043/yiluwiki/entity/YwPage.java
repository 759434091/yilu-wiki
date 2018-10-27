package team.a9043.yiluwiki.entity;

import org.hibernate.validator.constraints.Length;
import team.a9043.yiluwiki.controller.valid_group.InsertYwPage;
import team.a9043.yiluwiki.controller.valid_group.ModifyYwPage;

import javax.validation.constraints.Null;

public class YwPage {
    @Null(groups = {InsertYwPage.class, ModifyYwPage.class})
    private Integer ypId;

    @Length(groups = {InsertYwPage.class, ModifyYwPage.class}, min = 3, max = 30)
    private String ypType;

    @Length(groups = {InsertYwPage.class, ModifyYwPage.class}, min = 3, max = 30)
    private String ypName;

    @Length(groups = {InsertYwPage.class, ModifyYwPage.class}, min = 3, max = 300)
    private String ypAbstract;

    @Length(groups = {InsertYwPage.class, ModifyYwPage.class}, min = 10)
    private String ypContent;

    public Integer getYpId() {
        return ypId;
    }

    public void setYpId(Integer ypId) {
        this.ypId = ypId;
    }

    public String getYpType() {
        return ypType;
    }

    public void setYpType(String ypType) {
        this.ypType = ypType == null ? null : ypType.trim();
    }

    public String getYpName() {
        return ypName;
    }

    public void setYpName(String ypName) {
        this.ypName = ypName == null ? null : ypName.trim();
    }

    public String getYpAbstract() {
        return ypAbstract;
    }

    public void setYpAbstract(String ypAbstract) {
        this.ypAbstract = ypAbstract == null ? null : ypAbstract.trim();
    }

    public String getYpContent() {
        return ypContent;
    }

    public void setYpContent(String ypContent) {
        this.ypContent = ypContent == null ? null : ypContent.trim();
    }
}