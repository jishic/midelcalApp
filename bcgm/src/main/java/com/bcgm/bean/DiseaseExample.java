package com.bcgm.bean;

import java.util.ArrayList;
import java.util.List;

public class DiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseExample() {
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

        public Criteria andDiseaseIdIsNull() {
            addCriterion("Disease_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("Disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("Disease_id =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("Disease_id <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("Disease_id >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_id >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("Disease_id <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_id <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("Disease_id in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("Disease_id not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("Disease_id between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_id not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNull() {
            addCriterion("Disease_name is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIsNotNull() {
            addCriterion("Disease_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameEqualTo(String value) {
            addCriterion("Disease_name =", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotEqualTo(String value) {
            addCriterion("Disease_name <>", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThan(String value) {
            addCriterion("Disease_name >", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_name >=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThan(String value) {
            addCriterion("Disease_name <", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLessThanOrEqualTo(String value) {
            addCriterion("Disease_name <=", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameLike(String value) {
            addCriterion("Disease_name like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotLike(String value) {
            addCriterion("Disease_name not like", value, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameIn(List<String> values) {
            addCriterion("Disease_name in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotIn(List<String> values) {
            addCriterion("Disease_name not in", values, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameBetween(String value1, String value2) {
            addCriterion("Disease_name between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseNameNotBetween(String value1, String value2) {
            addCriterion("Disease_name not between", value1, value2, "diseaseName");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionIsNull() {
            addCriterion("Disease_description is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionIsNotNull() {
            addCriterion("Disease_description is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionEqualTo(String value) {
            addCriterion("Disease_description =", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotEqualTo(String value) {
            addCriterion("Disease_description <>", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionGreaterThan(String value) {
            addCriterion("Disease_description >", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_description >=", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLessThan(String value) {
            addCriterion("Disease_description <", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Disease_description <=", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionLike(String value) {
            addCriterion("Disease_description like", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotLike(String value) {
            addCriterion("Disease_description not like", value, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionIn(List<String> values) {
            addCriterion("Disease_description in", values, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotIn(List<String> values) {
            addCriterion("Disease_description not in", values, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionBetween(String value1, String value2) {
            addCriterion("Disease_description between", value1, value2, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseDescriptionNotBetween(String value1, String value2) {
            addCriterion("Disease_description not between", value1, value2, "diseaseDescription");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexIsNull() {
            addCriterion("Disease_symptom_index is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexIsNotNull() {
            addCriterion("Disease_symptom_index is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexEqualTo(String value) {
            addCriterion("Disease_symptom_index =", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexNotEqualTo(String value) {
            addCriterion("Disease_symptom_index <>", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexGreaterThan(String value) {
            addCriterion("Disease_symptom_index >", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_symptom_index >=", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexLessThan(String value) {
            addCriterion("Disease_symptom_index <", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexLessThanOrEqualTo(String value) {
            addCriterion("Disease_symptom_index <=", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexLike(String value) {
            addCriterion("Disease_symptom_index like", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexNotLike(String value) {
            addCriterion("Disease_symptom_index not like", value, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexIn(List<String> values) {
            addCriterion("Disease_symptom_index in", values, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexNotIn(List<String> values) {
            addCriterion("Disease_symptom_index not in", values, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexBetween(String value1, String value2) {
            addCriterion("Disease_symptom_index between", value1, value2, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIndexNotBetween(String value1, String value2) {
            addCriterion("Disease_symptom_index not between", value1, value2, "diseaseSymptomIndex");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIsNull() {
            addCriterion("Disease_symptom is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIsNotNull() {
            addCriterion("Disease_symptom is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomEqualTo(String value) {
            addCriterion("Disease_symptom =", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomNotEqualTo(String value) {
            addCriterion("Disease_symptom <>", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomGreaterThan(String value) {
            addCriterion("Disease_symptom >", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_symptom >=", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomLessThan(String value) {
            addCriterion("Disease_symptom <", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomLessThanOrEqualTo(String value) {
            addCriterion("Disease_symptom <=", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomLike(String value) {
            addCriterion("Disease_symptom like", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomNotLike(String value) {
            addCriterion("Disease_symptom not like", value, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomIn(List<String> values) {
            addCriterion("Disease_symptom in", values, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomNotIn(List<String> values) {
            addCriterion("Disease_symptom not in", values, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomBetween(String value1, String value2) {
            addCriterion("Disease_symptom between", value1, value2, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseSymptomNotBetween(String value1, String value2) {
            addCriterion("Disease_symptom not between", value1, value2, "diseaseSymptom");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureIsNull() {
            addCriterion("Disease_cure is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureIsNotNull() {
            addCriterion("Disease_cure is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureEqualTo(String value) {
            addCriterion("Disease_cure =", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureNotEqualTo(String value) {
            addCriterion("Disease_cure <>", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureGreaterThan(String value) {
            addCriterion("Disease_cure >", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_cure >=", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureLessThan(String value) {
            addCriterion("Disease_cure <", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureLessThanOrEqualTo(String value) {
            addCriterion("Disease_cure <=", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureLike(String value) {
            addCriterion("Disease_cure like", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureNotLike(String value) {
            addCriterion("Disease_cure not like", value, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureIn(List<String> values) {
            addCriterion("Disease_cure in", values, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureNotIn(List<String> values) {
            addCriterion("Disease_cure not in", values, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureBetween(String value1, String value2) {
            addCriterion("Disease_cure between", value1, value2, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseCureNotBetween(String value1, String value2) {
            addCriterion("Disease_cure not between", value1, value2, "diseaseCure");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderIsNull() {
            addCriterion("Disease_gender is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderIsNotNull() {
            addCriterion("Disease_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderEqualTo(Integer value) {
            addCriterion("Disease_gender =", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderNotEqualTo(Integer value) {
            addCriterion("Disease_gender <>", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderGreaterThan(Integer value) {
            addCriterion("Disease_gender >", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disease_gender >=", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderLessThan(Integer value) {
            addCriterion("Disease_gender <", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Disease_gender <=", value, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderIn(List<Integer> values) {
            addCriterion("Disease_gender in", values, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderNotIn(List<Integer> values) {
            addCriterion("Disease_gender not in", values, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderBetween(Integer value1, Integer value2) {
            addCriterion("Disease_gender between", value1, value2, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseaseGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Disease_gender not between", value1, value2, "diseaseGender");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionIsNull() {
            addCriterion("Disease_Position is null");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionIsNotNull() {
            addCriterion("Disease_Position is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionEqualTo(String value) {
            addCriterion("Disease_Position =", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionNotEqualTo(String value) {
            addCriterion("Disease_Position <>", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionGreaterThan(String value) {
            addCriterion("Disease_Position >", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionGreaterThanOrEqualTo(String value) {
            addCriterion("Disease_Position >=", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionLessThan(String value) {
            addCriterion("Disease_Position <", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionLessThanOrEqualTo(String value) {
            addCriterion("Disease_Position <=", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionLike(String value) {
            addCriterion("Disease_Position like", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionNotLike(String value) {
            addCriterion("Disease_Position not like", value, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionIn(List<String> values) {
            addCriterion("Disease_Position in", values, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionNotIn(List<String> values) {
            addCriterion("Disease_Position not in", values, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionBetween(String value1, String value2) {
            addCriterion("Disease_Position between", value1, value2, "diseasePosition");
            return (Criteria) this;
        }

        public Criteria andDiseasePositionNotBetween(String value1, String value2) {
            addCriterion("Disease_Position not between", value1, value2, "diseasePosition");
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