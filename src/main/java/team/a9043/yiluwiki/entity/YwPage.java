package team.a9043.yiluwiki.entity;

public class YwPage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_page.yp_id
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    private Integer ypId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_page.yp_type
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    private String ypType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_page.yp_name
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    private String ypName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_page.yp_abstract
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    private String ypAbstract;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yw_page.yp_content
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    private String ypContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_page.yp_id
     *
     * @return the value of yw_page.yp_id
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public Integer getYpId() {
        return ypId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_page.yp_id
     *
     * @param ypId the value for yw_page.yp_id
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public void setYpId(Integer ypId) {
        this.ypId = ypId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_page.yp_type
     *
     * @return the value of yw_page.yp_type
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public String getYpType() {
        return ypType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_page.yp_type
     *
     * @param ypType the value for yw_page.yp_type
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public void setYpType(String ypType) {
        this.ypType = ypType == null ? null : ypType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_page.yp_name
     *
     * @return the value of yw_page.yp_name
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public String getYpName() {
        return ypName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_page.yp_name
     *
     * @param ypName the value for yw_page.yp_name
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public void setYpName(String ypName) {
        this.ypName = ypName == null ? null : ypName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_page.yp_abstract
     *
     * @return the value of yw_page.yp_abstract
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public String getYpAbstract() {
        return ypAbstract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_page.yp_abstract
     *
     * @param ypAbstract the value for yw_page.yp_abstract
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public void setYpAbstract(String ypAbstract) {
        this.ypAbstract = ypAbstract == null ? null : ypAbstract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yw_page.yp_content
     *
     * @return the value of yw_page.yp_content
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public String getYpContent() {
        return ypContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yw_page.yp_content
     *
     * @param ypContent the value for yw_page.yp_content
     *
     * @mbg.generated Sat Oct 27 00:55:06 CST 2018
     */
    public void setYpContent(String ypContent) {
        this.ypContent = ypContent == null ? null : ypContent.trim();
    }
}