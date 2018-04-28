package com.bcgm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeartrateTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeartrateTestExample() {
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

        public Criteria andHcdateIsNull() {
            addCriterion("hcdate is null");
            return (Criteria) this;
        }

        public Criteria andHcdateIsNotNull() {
            addCriterion("hcdate is not null");
            return (Criteria) this;
        }

        public Criteria andHcdateEqualTo(Date value) {
            addCriterion("hcdate =", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateNotEqualTo(Date value) {
            addCriterion("hcdate <>", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateGreaterThan(Date value) {
            addCriterion("hcdate >", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hcdate >=", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateLessThan(Date value) {
            addCriterion("hcdate <", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateLessThanOrEqualTo(Date value) {
            addCriterion("hcdate <=", value, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateIn(List<Date> values) {
            addCriterion("hcdate in", values, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateNotIn(List<Date> values) {
            addCriterion("hcdate not in", values, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateBetween(Date value1, Date value2) {
            addCriterion("hcdate between", value1, value2, "hcdate");
            return (Criteria) this;
        }

        public Criteria andHcdateNotBetween(Date value1, Date value2) {
            addCriterion("hcdate not between", value1, value2, "hcdate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andHeartResultIsNull() {
            addCriterion("heart_result is null");
            return (Criteria) this;
        }

        public Criteria andHeartResultIsNotNull() {
            addCriterion("heart_result is not null");
            return (Criteria) this;
        }

        public Criteria andHeartResultEqualTo(String value) {
            addCriterion("heart_result =", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultNotEqualTo(String value) {
            addCriterion("heart_result <>", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultGreaterThan(String value) {
            addCriterion("heart_result >", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultGreaterThanOrEqualTo(String value) {
            addCriterion("heart_result >=", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultLessThan(String value) {
            addCriterion("heart_result <", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultLessThanOrEqualTo(String value) {
            addCriterion("heart_result <=", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultLike(String value) {
            addCriterion("heart_result like", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultNotLike(String value) {
            addCriterion("heart_result not like", value, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultIn(List<String> values) {
            addCriterion("heart_result in", values, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultNotIn(List<String> values) {
            addCriterion("heart_result not in", values, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultBetween(String value1, String value2) {
            addCriterion("heart_result between", value1, value2, "heartResult");
            return (Criteria) this;
        }

        public Criteria andHeartResultNotBetween(String value1, String value2) {
            addCriterion("heart_result not between", value1, value2, "heartResult");
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