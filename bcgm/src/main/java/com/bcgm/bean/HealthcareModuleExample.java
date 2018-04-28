package com.bcgm.bean;

import java.util.ArrayList;
import java.util.List;

public class HealthcareModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthcareModuleExample() {
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

        public Criteria andHModulenoIsNull() {
            addCriterion("H_moduleNo is null");
            return (Criteria) this;
        }

        public Criteria andHModulenoIsNotNull() {
            addCriterion("H_moduleNo is not null");
            return (Criteria) this;
        }

        public Criteria andHModulenoEqualTo(Integer value) {
            addCriterion("H_moduleNo =", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoNotEqualTo(Integer value) {
            addCriterion("H_moduleNo <>", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoGreaterThan(Integer value) {
            addCriterion("H_moduleNo >", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("H_moduleNo >=", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoLessThan(Integer value) {
            addCriterion("H_moduleNo <", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoLessThanOrEqualTo(Integer value) {
            addCriterion("H_moduleNo <=", value, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoIn(List<Integer> values) {
            addCriterion("H_moduleNo in", values, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoNotIn(List<Integer> values) {
            addCriterion("H_moduleNo not in", values, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoBetween(Integer value1, Integer value2) {
            addCriterion("H_moduleNo between", value1, value2, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenoNotBetween(Integer value1, Integer value2) {
            addCriterion("H_moduleNo not between", value1, value2, "hModuleno");
            return (Criteria) this;
        }

        public Criteria andHModulenameIsNull() {
            addCriterion("H_moduleName is null");
            return (Criteria) this;
        }

        public Criteria andHModulenameIsNotNull() {
            addCriterion("H_moduleName is not null");
            return (Criteria) this;
        }

        public Criteria andHModulenameEqualTo(String value) {
            addCriterion("H_moduleName =", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameNotEqualTo(String value) {
            addCriterion("H_moduleName <>", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameGreaterThan(String value) {
            addCriterion("H_moduleName >", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("H_moduleName >=", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameLessThan(String value) {
            addCriterion("H_moduleName <", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameLessThanOrEqualTo(String value) {
            addCriterion("H_moduleName <=", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameLike(String value) {
            addCriterion("H_moduleName like", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameNotLike(String value) {
            addCriterion("H_moduleName not like", value, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameIn(List<String> values) {
            addCriterion("H_moduleName in", values, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameNotIn(List<String> values) {
            addCriterion("H_moduleName not in", values, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameBetween(String value1, String value2) {
            addCriterion("H_moduleName between", value1, value2, "hModulename");
            return (Criteria) this;
        }

        public Criteria andHModulenameNotBetween(String value1, String value2) {
            addCriterion("H_moduleName not between", value1, value2, "hModulename");
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