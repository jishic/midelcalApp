package com.bcgm.bean;

import java.util.ArrayList;
import java.util.List;

public class HealthcareArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthcareArticleExample() {
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

        public Criteria andHAidIsNull() {
            addCriterion("H_aid is null");
            return (Criteria) this;
        }

        public Criteria andHAidIsNotNull() {
            addCriterion("H_aid is not null");
            return (Criteria) this;
        }

        public Criteria andHAidEqualTo(Integer value) {
            addCriterion("H_aid =", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidNotEqualTo(Integer value) {
            addCriterion("H_aid <>", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidGreaterThan(Integer value) {
            addCriterion("H_aid >", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("H_aid >=", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidLessThan(Integer value) {
            addCriterion("H_aid <", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidLessThanOrEqualTo(Integer value) {
            addCriterion("H_aid <=", value, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidIn(List<Integer> values) {
            addCriterion("H_aid in", values, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidNotIn(List<Integer> values) {
            addCriterion("H_aid not in", values, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidBetween(Integer value1, Integer value2) {
            addCriterion("H_aid between", value1, value2, "hAid");
            return (Criteria) this;
        }

        public Criteria andHAidNotBetween(Integer value1, Integer value2) {
            addCriterion("H_aid not between", value1, value2, "hAid");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNull() {
            addCriterion("H_title is null");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNotNull() {
            addCriterion("H_title is not null");
            return (Criteria) this;
        }

        public Criteria andHTitleEqualTo(String value) {
            addCriterion("H_title =", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotEqualTo(String value) {
            addCriterion("H_title <>", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThan(String value) {
            addCriterion("H_title >", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThanOrEqualTo(String value) {
            addCriterion("H_title >=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThan(String value) {
            addCriterion("H_title <", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThanOrEqualTo(String value) {
            addCriterion("H_title <=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLike(String value) {
            addCriterion("H_title like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotLike(String value) {
            addCriterion("H_title not like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleIn(List<String> values) {
            addCriterion("H_title in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotIn(List<String> values) {
            addCriterion("H_title not in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleBetween(String value1, String value2) {
            addCriterion("H_title between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotBetween(String value1, String value2) {
            addCriterion("H_title not between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHLabelIsNull() {
            addCriterion("H_label is null");
            return (Criteria) this;
        }

        public Criteria andHLabelIsNotNull() {
            addCriterion("H_label is not null");
            return (Criteria) this;
        }

        public Criteria andHLabelEqualTo(String value) {
            addCriterion("H_label =", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelNotEqualTo(String value) {
            addCriterion("H_label <>", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelGreaterThan(String value) {
            addCriterion("H_label >", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelGreaterThanOrEqualTo(String value) {
            addCriterion("H_label >=", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelLessThan(String value) {
            addCriterion("H_label <", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelLessThanOrEqualTo(String value) {
            addCriterion("H_label <=", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelLike(String value) {
            addCriterion("H_label like", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelNotLike(String value) {
            addCriterion("H_label not like", value, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelIn(List<String> values) {
            addCriterion("H_label in", values, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelNotIn(List<String> values) {
            addCriterion("H_label not in", values, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelBetween(String value1, String value2) {
            addCriterion("H_label between", value1, value2, "hLabel");
            return (Criteria) this;
        }

        public Criteria andHLabelNotBetween(String value1, String value2) {
            addCriterion("H_label not between", value1, value2, "hLabel");
            return (Criteria) this;
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

        public Criteria andHImageIsNull() {
            addCriterion("H_image is null");
            return (Criteria) this;
        }

        public Criteria andHImageIsNotNull() {
            addCriterion("H_image is not null");
            return (Criteria) this;
        }

        public Criteria andHImageEqualTo(String value) {
            addCriterion("H_image =", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageNotEqualTo(String value) {
            addCriterion("H_image <>", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageGreaterThan(String value) {
            addCriterion("H_image >", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageGreaterThanOrEqualTo(String value) {
            addCriterion("H_image >=", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageLessThan(String value) {
            addCriterion("H_image <", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageLessThanOrEqualTo(String value) {
            addCriterion("H_image <=", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageLike(String value) {
            addCriterion("H_image like", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageNotLike(String value) {
            addCriterion("H_image not like", value, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageIn(List<String> values) {
            addCriterion("H_image in", values, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageNotIn(List<String> values) {
            addCriterion("H_image not in", values, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageBetween(String value1, String value2) {
            addCriterion("H_image between", value1, value2, "hImage");
            return (Criteria) this;
        }

        public Criteria andHImageNotBetween(String value1, String value2) {
            addCriterion("H_image not between", value1, value2, "hImage");
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