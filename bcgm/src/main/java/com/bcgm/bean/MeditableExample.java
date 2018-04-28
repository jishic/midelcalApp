package com.bcgm.bean;

import java.util.ArrayList;
import java.util.List;

public class MeditableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeditableExample() {
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

        public Criteria andMedicineIsNull() {
            addCriterion("medicine is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIsNotNull() {
            addCriterion("medicine is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineEqualTo(String value) {
            addCriterion("medicine =", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotEqualTo(String value) {
            addCriterion("medicine <>", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThan(String value) {
            addCriterion("medicine >", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThanOrEqualTo(String value) {
            addCriterion("medicine >=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThan(String value) {
            addCriterion("medicine <", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThanOrEqualTo(String value) {
            addCriterion("medicine <=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLike(String value) {
            addCriterion("medicine like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotLike(String value) {
            addCriterion("medicine not like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineIn(List<String> values) {
            addCriterion("medicine in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotIn(List<String> values) {
            addCriterion("medicine not in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineBetween(String value1, String value2) {
            addCriterion("medicine between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotBetween(String value1, String value2) {
            addCriterion("medicine not between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andAdaptationIsNull() {
            addCriterion("adaptation is null");
            return (Criteria) this;
        }

        public Criteria andAdaptationIsNotNull() {
            addCriterion("adaptation is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptationEqualTo(String value) {
            addCriterion("adaptation =", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationNotEqualTo(String value) {
            addCriterion("adaptation <>", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationGreaterThan(String value) {
            addCriterion("adaptation >", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationGreaterThanOrEqualTo(String value) {
            addCriterion("adaptation >=", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationLessThan(String value) {
            addCriterion("adaptation <", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationLessThanOrEqualTo(String value) {
            addCriterion("adaptation <=", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationLike(String value) {
            addCriterion("adaptation like", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationNotLike(String value) {
            addCriterion("adaptation not like", value, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationIn(List<String> values) {
            addCriterion("adaptation in", values, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationNotIn(List<String> values) {
            addCriterion("adaptation not in", values, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationBetween(String value1, String value2) {
            addCriterion("adaptation between", value1, value2, "adaptation");
            return (Criteria) this;
        }

        public Criteria andAdaptationNotBetween(String value1, String value2) {
            addCriterion("adaptation not between", value1, value2, "adaptation");
            return (Criteria) this;
        }

        public Criteria andIngrementIsNull() {
            addCriterion("ingrement is null");
            return (Criteria) this;
        }

        public Criteria andIngrementIsNotNull() {
            addCriterion("ingrement is not null");
            return (Criteria) this;
        }

        public Criteria andIngrementEqualTo(String value) {
            addCriterion("ingrement =", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementNotEqualTo(String value) {
            addCriterion("ingrement <>", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementGreaterThan(String value) {
            addCriterion("ingrement >", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementGreaterThanOrEqualTo(String value) {
            addCriterion("ingrement >=", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementLessThan(String value) {
            addCriterion("ingrement <", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementLessThanOrEqualTo(String value) {
            addCriterion("ingrement <=", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementLike(String value) {
            addCriterion("ingrement like", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementNotLike(String value) {
            addCriterion("ingrement not like", value, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementIn(List<String> values) {
            addCriterion("ingrement in", values, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementNotIn(List<String> values) {
            addCriterion("ingrement not in", values, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementBetween(String value1, String value2) {
            addCriterion("ingrement between", value1, value2, "ingrement");
            return (Criteria) this;
        }

        public Criteria andIngrementNotBetween(String value1, String value2) {
            addCriterion("ingrement not between", value1, value2, "ingrement");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(String value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(String value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(String value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(String value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(String value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(String value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLike(String value) {
            addCriterion("dosage like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotLike(String value) {
            addCriterion("dosage not like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<String> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<String> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(String value1, String value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(String value1, String value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andSideeffectIsNull() {
            addCriterion("sideeffect is null");
            return (Criteria) this;
        }

        public Criteria andSideeffectIsNotNull() {
            addCriterion("sideeffect is not null");
            return (Criteria) this;
        }

        public Criteria andSideeffectEqualTo(String value) {
            addCriterion("sideeffect =", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectNotEqualTo(String value) {
            addCriterion("sideeffect <>", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectGreaterThan(String value) {
            addCriterion("sideeffect >", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectGreaterThanOrEqualTo(String value) {
            addCriterion("sideeffect >=", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectLessThan(String value) {
            addCriterion("sideeffect <", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectLessThanOrEqualTo(String value) {
            addCriterion("sideeffect <=", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectLike(String value) {
            addCriterion("sideeffect like", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectNotLike(String value) {
            addCriterion("sideeffect not like", value, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectIn(List<String> values) {
            addCriterion("sideeffect in", values, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectNotIn(List<String> values) {
            addCriterion("sideeffect not in", values, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectBetween(String value1, String value2) {
            addCriterion("sideeffect between", value1, value2, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andSideeffectNotBetween(String value1, String value2) {
            addCriterion("sideeffect not between", value1, value2, "sideeffect");
            return (Criteria) this;
        }

        public Criteria andTabooIsNull() {
            addCriterion("taboo is null");
            return (Criteria) this;
        }

        public Criteria andTabooIsNotNull() {
            addCriterion("taboo is not null");
            return (Criteria) this;
        }

        public Criteria andTabooEqualTo(String value) {
            addCriterion("taboo =", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotEqualTo(String value) {
            addCriterion("taboo <>", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThan(String value) {
            addCriterion("taboo >", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThanOrEqualTo(String value) {
            addCriterion("taboo >=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThan(String value) {
            addCriterion("taboo <", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThanOrEqualTo(String value) {
            addCriterion("taboo <=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLike(String value) {
            addCriterion("taboo like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotLike(String value) {
            addCriterion("taboo not like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooIn(List<String> values) {
            addCriterion("taboo in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotIn(List<String> values) {
            addCriterion("taboo not in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooBetween(String value1, String value2) {
            addCriterion("taboo between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotBetween(String value1, String value2) {
            addCriterion("taboo not between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
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