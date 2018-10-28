package team.a9043.yiluwiki.entity;

import java.util.ArrayList;
import java.util.List;

public class YwUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YwUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andYuIdIsNull() {
            addCriterion("yu_id is null");
            return (Criteria) this;
        }

        public Criteria andYuIdIsNotNull() {
            addCriterion("yu_id is not null");
            return (Criteria) this;
        }

        public Criteria andYuIdEqualTo(Integer value) {
            addCriterion("yu_id =", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdNotEqualTo(Integer value) {
            addCriterion("yu_id <>", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdGreaterThan(Integer value) {
            addCriterion("yu_id >", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yu_id >=", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdLessThan(Integer value) {
            addCriterion("yu_id <", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdLessThanOrEqualTo(Integer value) {
            addCriterion("yu_id <=", value, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdIn(List<Integer> values) {
            addCriterion("yu_id in", values, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdNotIn(List<Integer> values) {
            addCriterion("yu_id not in", values, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdBetween(Integer value1, Integer value2) {
            addCriterion("yu_id between", value1, value2, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yu_id not between", value1, value2, "yuId");
            return (Criteria) this;
        }

        public Criteria andYuLoginIsNull() {
            addCriterion("yu_login is null");
            return (Criteria) this;
        }

        public Criteria andYuLoginIsNotNull() {
            addCriterion("yu_login is not null");
            return (Criteria) this;
        }

        public Criteria andYuLoginEqualTo(String value) {
            addCriterion("yu_login =", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginNotEqualTo(String value) {
            addCriterion("yu_login <>", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginGreaterThan(String value) {
            addCriterion("yu_login >", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginGreaterThanOrEqualTo(String value) {
            addCriterion("yu_login >=", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginLessThan(String value) {
            addCriterion("yu_login <", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginLessThanOrEqualTo(String value) {
            addCriterion("yu_login <=", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginLike(String value) {
            addCriterion("yu_login like", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginNotLike(String value) {
            addCriterion("yu_login not like", value, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginIn(List<String> values) {
            addCriterion("yu_login in", values, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginNotIn(List<String> values) {
            addCriterion("yu_login not in", values, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginBetween(String value1, String value2) {
            addCriterion("yu_login between", value1, value2, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuLoginNotBetween(String value1, String value2) {
            addCriterion("yu_login not between", value1, value2, "yuLogin");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdIsNull() {
            addCriterion("yu_node_id is null");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdIsNotNull() {
            addCriterion("yu_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdEqualTo(String value) {
            addCriterion("yu_node_id =", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdNotEqualTo(String value) {
            addCriterion("yu_node_id <>", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdGreaterThan(String value) {
            addCriterion("yu_node_id >", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("yu_node_id >=", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdLessThan(String value) {
            addCriterion("yu_node_id <", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdLessThanOrEqualTo(String value) {
            addCriterion("yu_node_id <=", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdLike(String value) {
            addCriterion("yu_node_id like", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdNotLike(String value) {
            addCriterion("yu_node_id not like", value, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdIn(List<String> values) {
            addCriterion("yu_node_id in", values, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdNotIn(List<String> values) {
            addCriterion("yu_node_id not in", values, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdBetween(String value1, String value2) {
            addCriterion("yu_node_id between", value1, value2, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuNodeIdNotBetween(String value1, String value2) {
            addCriterion("yu_node_id not between", value1, value2, "yuNodeId");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlIsNull() {
            addCriterion("yu_avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlIsNotNull() {
            addCriterion("yu_avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlEqualTo(String value) {
            addCriterion("yu_avatar_url =", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlNotEqualTo(String value) {
            addCriterion("yu_avatar_url <>", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlGreaterThan(String value) {
            addCriterion("yu_avatar_url >", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("yu_avatar_url >=", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlLessThan(String value) {
            addCriterion("yu_avatar_url <", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("yu_avatar_url <=", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlLike(String value) {
            addCriterion("yu_avatar_url like", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlNotLike(String value) {
            addCriterion("yu_avatar_url not like", value, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlIn(List<String> values) {
            addCriterion("yu_avatar_url in", values, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlNotIn(List<String> values) {
            addCriterion("yu_avatar_url not in", values, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlBetween(String value1, String value2) {
            addCriterion("yu_avatar_url between", value1, value2, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("yu_avatar_url not between", value1, value2, "yuAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlIsNull() {
            addCriterion("yu_html_url is null");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlIsNotNull() {
            addCriterion("yu_html_url is not null");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlEqualTo(String value) {
            addCriterion("yu_html_url =", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlNotEqualTo(String value) {
            addCriterion("yu_html_url <>", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlGreaterThan(String value) {
            addCriterion("yu_html_url >", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlGreaterThanOrEqualTo(String value) {
            addCriterion("yu_html_url >=", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlLessThan(String value) {
            addCriterion("yu_html_url <", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlLessThanOrEqualTo(String value) {
            addCriterion("yu_html_url <=", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlLike(String value) {
            addCriterion("yu_html_url like", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlNotLike(String value) {
            addCriterion("yu_html_url not like", value, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlIn(List<String> values) {
            addCriterion("yu_html_url in", values, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlNotIn(List<String> values) {
            addCriterion("yu_html_url not in", values, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlBetween(String value1, String value2) {
            addCriterion("yu_html_url between", value1, value2, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuHtmlUrlNotBetween(String value1, String value2) {
            addCriterion("yu_html_url not between", value1, value2, "yuHtmlUrl");
            return (Criteria) this;
        }

        public Criteria andYuNameIsNull() {
            addCriterion("yu_name is null");
            return (Criteria) this;
        }

        public Criteria andYuNameIsNotNull() {
            addCriterion("yu_name is not null");
            return (Criteria) this;
        }

        public Criteria andYuNameEqualTo(String value) {
            addCriterion("yu_name =", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameNotEqualTo(String value) {
            addCriterion("yu_name <>", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameGreaterThan(String value) {
            addCriterion("yu_name >", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameGreaterThanOrEqualTo(String value) {
            addCriterion("yu_name >=", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameLessThan(String value) {
            addCriterion("yu_name <", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameLessThanOrEqualTo(String value) {
            addCriterion("yu_name <=", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameLike(String value) {
            addCriterion("yu_name like", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameNotLike(String value) {
            addCriterion("yu_name not like", value, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameIn(List<String> values) {
            addCriterion("yu_name in", values, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameNotIn(List<String> values) {
            addCriterion("yu_name not in", values, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameBetween(String value1, String value2) {
            addCriterion("yu_name between", value1, value2, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuNameNotBetween(String value1, String value2) {
            addCriterion("yu_name not between", value1, value2, "yuName");
            return (Criteria) this;
        }

        public Criteria andYuBioIsNull() {
            addCriterion("yu_bio is null");
            return (Criteria) this;
        }

        public Criteria andYuBioIsNotNull() {
            addCriterion("yu_bio is not null");
            return (Criteria) this;
        }

        public Criteria andYuBioEqualTo(String value) {
            addCriterion("yu_bio =", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioNotEqualTo(String value) {
            addCriterion("yu_bio <>", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioGreaterThan(String value) {
            addCriterion("yu_bio >", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioGreaterThanOrEqualTo(String value) {
            addCriterion("yu_bio >=", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioLessThan(String value) {
            addCriterion("yu_bio <", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioLessThanOrEqualTo(String value) {
            addCriterion("yu_bio <=", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioLike(String value) {
            addCriterion("yu_bio like", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioNotLike(String value) {
            addCriterion("yu_bio not like", value, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioIn(List<String> values) {
            addCriterion("yu_bio in", values, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioNotIn(List<String> values) {
            addCriterion("yu_bio not in", values, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioBetween(String value1, String value2) {
            addCriterion("yu_bio between", value1, value2, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuBioNotBetween(String value1, String value2) {
            addCriterion("yu_bio not between", value1, value2, "yuBio");
            return (Criteria) this;
        }

        public Criteria andYuPasswordIsNull() {
            addCriterion("yu_password is null");
            return (Criteria) this;
        }

        public Criteria andYuPasswordIsNotNull() {
            addCriterion("yu_password is not null");
            return (Criteria) this;
        }

        public Criteria andYuPasswordEqualTo(String value) {
            addCriterion("yu_password =", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordNotEqualTo(String value) {
            addCriterion("yu_password <>", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordGreaterThan(String value) {
            addCriterion("yu_password >", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("yu_password >=", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordLessThan(String value) {
            addCriterion("yu_password <", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordLessThanOrEqualTo(String value) {
            addCriterion("yu_password <=", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordLike(String value) {
            addCriterion("yu_password like", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordNotLike(String value) {
            addCriterion("yu_password not like", value, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordIn(List<String> values) {
            addCriterion("yu_password in", values, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordNotIn(List<String> values) {
            addCriterion("yu_password not in", values, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordBetween(String value1, String value2) {
            addCriterion("yu_password between", value1, value2, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuPasswordNotBetween(String value1, String value2) {
            addCriterion("yu_password not between", value1, value2, "yuPassword");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdIsNull() {
            addCriterion("yu_github_id is null");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdIsNotNull() {
            addCriterion("yu_github_id is not null");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdEqualTo(Integer value) {
            addCriterion("yu_github_id =", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdNotEqualTo(Integer value) {
            addCriterion("yu_github_id <>", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdGreaterThan(Integer value) {
            addCriterion("yu_github_id >", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yu_github_id >=", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdLessThan(Integer value) {
            addCriterion("yu_github_id <", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdLessThanOrEqualTo(Integer value) {
            addCriterion("yu_github_id <=", value, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdIn(List<Integer> values) {
            addCriterion("yu_github_id in", values, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdNotIn(List<Integer> values) {
            addCriterion("yu_github_id not in", values, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdBetween(Integer value1, Integer value2) {
            addCriterion("yu_github_id between", value1, value2, "yuGithubId");
            return (Criteria) this;
        }

        public Criteria andYuGithubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yu_github_id not between", value1, value2, "yuGithubId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}