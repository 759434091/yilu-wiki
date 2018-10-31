package team.a9043.yiluwiki.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class YwForumPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YwForumPostExample() {
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

        public Criteria andYfpIdIsNull() {
            addCriterion("yfp_id is null");
            return (Criteria) this;
        }

        public Criteria andYfpIdIsNotNull() {
            addCriterion("yfp_id is not null");
            return (Criteria) this;
        }

        public Criteria andYfpIdEqualTo(Integer value) {
            addCriterion("yfp_id =", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdNotEqualTo(Integer value) {
            addCriterion("yfp_id <>", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdGreaterThan(Integer value) {
            addCriterion("yfp_id >", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yfp_id >=", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdLessThan(Integer value) {
            addCriterion("yfp_id <", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdLessThanOrEqualTo(Integer value) {
            addCriterion("yfp_id <=", value, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdIn(List<Integer> values) {
            addCriterion("yfp_id in", values, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdNotIn(List<Integer> values) {
            addCriterion("yfp_id not in", values, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdBetween(Integer value1, Integer value2) {
            addCriterion("yfp_id between", value1, value2, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yfp_id not between", value1, value2, "yfpId");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractIsNull() {
            addCriterion("yfp_abstract is null");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractIsNotNull() {
            addCriterion("yfp_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractEqualTo(String value) {
            addCriterion("yfp_abstract =", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractNotEqualTo(String value) {
            addCriterion("yfp_abstract <>", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractGreaterThan(String value) {
            addCriterion("yfp_abstract >", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("yfp_abstract >=", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractLessThan(String value) {
            addCriterion("yfp_abstract <", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractLessThanOrEqualTo(String value) {
            addCriterion("yfp_abstract <=", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractLike(String value) {
            addCriterion("yfp_abstract like", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractNotLike(String value) {
            addCriterion("yfp_abstract not like", value, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractIn(List<String> values) {
            addCriterion("yfp_abstract in", values, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractNotIn(List<String> values) {
            addCriterion("yfp_abstract not in", values, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractBetween(String value1, String value2) {
            addCriterion("yfp_abstract between", value1, value2, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpAbstractNotBetween(String value1, String value2) {
            addCriterion("yfp_abstract not between", value1, value2, "yfpAbstract");
            return (Criteria) this;
        }

        public Criteria andYfpTitleIsNull() {
            addCriterion("yfp_title is null");
            return (Criteria) this;
        }

        public Criteria andYfpTitleIsNotNull() {
            addCriterion("yfp_title is not null");
            return (Criteria) this;
        }

        public Criteria andYfpTitleEqualTo(String value) {
            addCriterion("yfp_title =", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleNotEqualTo(String value) {
            addCriterion("yfp_title <>", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleGreaterThan(String value) {
            addCriterion("yfp_title >", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("yfp_title >=", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleLessThan(String value) {
            addCriterion("yfp_title <", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleLessThanOrEqualTo(String value) {
            addCriterion("yfp_title <=", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleLike(String value) {
            addCriterion("yfp_title like", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleNotLike(String value) {
            addCriterion("yfp_title not like", value, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleIn(List<String> values) {
            addCriterion("yfp_title in", values, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleNotIn(List<String> values) {
            addCriterion("yfp_title not in", values, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleBetween(String value1, String value2) {
            addCriterion("yfp_title between", value1, value2, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpTitleNotBetween(String value1, String value2) {
            addCriterion("yfp_title not between", value1, value2, "yfpTitle");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeIsNull() {
            addCriterion("yfp_create_time is null");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeIsNotNull() {
            addCriterion("yfp_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("yfp_create_time =", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("yfp_create_time <>", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("yfp_create_time >", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfp_create_time >=", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeLessThan(LocalDateTime value) {
            addCriterion("yfp_create_time <", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfp_create_time <=", value, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("yfp_create_time in", values, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("yfp_create_time not in", values, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfp_create_time between", value1, value2, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfp_create_time not between", value1, value2, "yfpCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeIsNull() {
            addCriterion("yfp_update_time is null");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeIsNotNull() {
            addCriterion("yfp_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("yfp_update_time =", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("yfp_update_time <>", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("yfp_update_time >", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfp_update_time >=", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("yfp_update_time <", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfp_update_time <=", value, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("yfp_update_time in", values, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("yfp_update_time not in", values, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfp_update_time between", value1, value2, "yfpUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfpUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfp_update_time not between", value1, value2, "yfpUpdateTime");
            return (Criteria) this;
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