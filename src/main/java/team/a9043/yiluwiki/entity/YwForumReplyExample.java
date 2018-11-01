package team.a9043.yiluwiki.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class YwForumReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YwForumReplyExample() {
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

        public Criteria andYfrIdIsNull() {
            addCriterion("yfr_id is null");
            return (Criteria) this;
        }

        public Criteria andYfrIdIsNotNull() {
            addCriterion("yfr_id is not null");
            return (Criteria) this;
        }

        public Criteria andYfrIdEqualTo(Integer value) {
            addCriterion("yfr_id =", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdNotEqualTo(Integer value) {
            addCriterion("yfr_id <>", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdGreaterThan(Integer value) {
            addCriterion("yfr_id >", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yfr_id >=", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdLessThan(Integer value) {
            addCriterion("yfr_id <", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdLessThanOrEqualTo(Integer value) {
            addCriterion("yfr_id <=", value, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdIn(List<Integer> values) {
            addCriterion("yfr_id in", values, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdNotIn(List<Integer> values) {
            addCriterion("yfr_id not in", values, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdBetween(Integer value1, Integer value2) {
            addCriterion("yfr_id between", value1, value2, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yfr_id not between", value1, value2, "yfrId");
            return (Criteria) this;
        }

        public Criteria andYfrFloorIsNull() {
            addCriterion("yfr_floor is null");
            return (Criteria) this;
        }

        public Criteria andYfrFloorIsNotNull() {
            addCriterion("yfr_floor is not null");
            return (Criteria) this;
        }

        public Criteria andYfrFloorEqualTo(Integer value) {
            addCriterion("yfr_floor =", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorNotEqualTo(Integer value) {
            addCriterion("yfr_floor <>", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorGreaterThan(Integer value) {
            addCriterion("yfr_floor >", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("yfr_floor >=", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorLessThan(Integer value) {
            addCriterion("yfr_floor <", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorLessThanOrEqualTo(Integer value) {
            addCriterion("yfr_floor <=", value, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorIn(List<Integer> values) {
            addCriterion("yfr_floor in", values, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorNotIn(List<Integer> values) {
            addCriterion("yfr_floor not in", values, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorBetween(Integer value1, Integer value2) {
            addCriterion("yfr_floor between", value1, value2, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("yfr_floor not between", value1, value2, "yfrFloor");
            return (Criteria) this;
        }

        public Criteria andYfrContentIsNull() {
            addCriterion("yfr_content is null");
            return (Criteria) this;
        }

        public Criteria andYfrContentIsNotNull() {
            addCriterion("yfr_content is not null");
            return (Criteria) this;
        }

        public Criteria andYfrContentEqualTo(String value) {
            addCriterion("yfr_content =", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentNotEqualTo(String value) {
            addCriterion("yfr_content <>", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentGreaterThan(String value) {
            addCriterion("yfr_content >", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentGreaterThanOrEqualTo(String value) {
            addCriterion("yfr_content >=", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentLessThan(String value) {
            addCriterion("yfr_content <", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentLessThanOrEqualTo(String value) {
            addCriterion("yfr_content <=", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentLike(String value) {
            addCriterion("yfr_content like", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentNotLike(String value) {
            addCriterion("yfr_content not like", value, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentIn(List<String> values) {
            addCriterion("yfr_content in", values, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentNotIn(List<String> values) {
            addCriterion("yfr_content not in", values, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentBetween(String value1, String value2) {
            addCriterion("yfr_content between", value1, value2, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrContentNotBetween(String value1, String value2) {
            addCriterion("yfr_content not between", value1, value2, "yfrContent");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToIsNull() {
            addCriterion("yfr_reply_to is null");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToIsNotNull() {
            addCriterion("yfr_reply_to is not null");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToEqualTo(Integer value) {
            addCriterion("yfr_reply_to =", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToNotEqualTo(Integer value) {
            addCriterion("yfr_reply_to <>", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToGreaterThan(Integer value) {
            addCriterion("yfr_reply_to >", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToGreaterThanOrEqualTo(Integer value) {
            addCriterion("yfr_reply_to >=", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToLessThan(Integer value) {
            addCriterion("yfr_reply_to <", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToLessThanOrEqualTo(Integer value) {
            addCriterion("yfr_reply_to <=", value, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToIn(List<Integer> values) {
            addCriterion("yfr_reply_to in", values, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToNotIn(List<Integer> values) {
            addCriterion("yfr_reply_to not in", values, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToBetween(Integer value1, Integer value2) {
            addCriterion("yfr_reply_to between", value1, value2, "yfrReplyTo");
            return (Criteria) this;
        }

        public Criteria andYfrReplyToNotBetween(Integer value1, Integer value2) {
            addCriterion("yfr_reply_to not between", value1, value2, "yfrReplyTo");
            return (Criteria) this;
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

        public Criteria andYfrCreateTimeIsNull() {
            addCriterion("yfr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeIsNotNull() {
            addCriterion("yfr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("yfr_create_time =", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("yfr_create_time <>", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("yfr_create_time >", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfr_create_time >=", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeLessThan(LocalDateTime value) {
            addCriterion("yfr_create_time <", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfr_create_time <=", value, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("yfr_create_time in", values, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("yfr_create_time not in", values, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfr_create_time between", value1, value2, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfr_create_time not between", value1, value2, "yfrCreateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeIsNull() {
            addCriterion("yfr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeIsNotNull() {
            addCriterion("yfr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("yfr_update_time =", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("yfr_update_time <>", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("yfr_update_time >", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfr_update_time >=", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("yfr_update_time <", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("yfr_update_time <=", value, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("yfr_update_time in", values, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("yfr_update_time not in", values, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfr_update_time between", value1, value2, "yfrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andYfrUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("yfr_update_time not between", value1, value2, "yfrUpdateTime");
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