package com.adv.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakesTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakesTablesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialsIsNull() {
            addCriterion("materials is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsIsNotNull() {
            addCriterion("materials is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsEqualTo(String value) {
            addCriterion("materials =", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotEqualTo(String value) {
            addCriterion("materials <>", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsGreaterThan(String value) {
            addCriterion("materials >", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("materials >=", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLessThan(String value) {
            addCriterion("materials <", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLessThanOrEqualTo(String value) {
            addCriterion("materials <=", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsLike(String value) {
            addCriterion("materials like", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotLike(String value) {
            addCriterion("materials not like", value, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsIn(List<String> values) {
            addCriterion("materials in", values, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotIn(List<String> values) {
            addCriterion("materials not in", values, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsBetween(String value1, String value2) {
            addCriterion("materials between", value1, value2, "materials");
            return (Criteria) this;
        }

        public Criteria andMaterialsNotBetween(String value1, String value2) {
            addCriterion("materials not between", value1, value2, "materials");
            return (Criteria) this;
        }

        public Criteria andTakesNameIsNull() {
            addCriterion("takes_name is null");
            return (Criteria) this;
        }

        public Criteria andTakesNameIsNotNull() {
            addCriterion("takes_name is not null");
            return (Criteria) this;
        }

        public Criteria andTakesNameEqualTo(String value) {
            addCriterion("takes_name =", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameNotEqualTo(String value) {
            addCriterion("takes_name <>", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameGreaterThan(String value) {
            addCriterion("takes_name >", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameGreaterThanOrEqualTo(String value) {
            addCriterion("takes_name >=", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameLessThan(String value) {
            addCriterion("takes_name <", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameLessThanOrEqualTo(String value) {
            addCriterion("takes_name <=", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameLike(String value) {
            addCriterion("takes_name like", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameNotLike(String value) {
            addCriterion("takes_name not like", value, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameIn(List<String> values) {
            addCriterion("takes_name in", values, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameNotIn(List<String> values) {
            addCriterion("takes_name not in", values, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameBetween(String value1, String value2) {
            addCriterion("takes_name between", value1, value2, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNameNotBetween(String value1, String value2) {
            addCriterion("takes_name not between", value1, value2, "takesName");
            return (Criteria) this;
        }

        public Criteria andTakesNumberIsNull() {
            addCriterion("takes_number is null");
            return (Criteria) this;
        }

        public Criteria andTakesNumberIsNotNull() {
            addCriterion("takes_number is not null");
            return (Criteria) this;
        }

        public Criteria andTakesNumberEqualTo(Integer value) {
            addCriterion("takes_number =", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberNotEqualTo(Integer value) {
            addCriterion("takes_number <>", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberGreaterThan(Integer value) {
            addCriterion("takes_number >", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("takes_number >=", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberLessThan(Integer value) {
            addCriterion("takes_number <", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("takes_number <=", value, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberIn(List<Integer> values) {
            addCriterion("takes_number in", values, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberNotIn(List<Integer> values) {
            addCriterion("takes_number not in", values, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberBetween(Integer value1, Integer value2) {
            addCriterion("takes_number between", value1, value2, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andTakesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("takes_number not between", value1, value2, "takesNumber");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTakesDateIsNull() {
            addCriterion("takes_date is null");
            return (Criteria) this;
        }

        public Criteria andTakesDateIsNotNull() {
            addCriterion("takes_date is not null");
            return (Criteria) this;
        }

        public Criteria andTakesDateEqualTo(Date value) {
            addCriterion("takes_date =", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateNotEqualTo(Date value) {
            addCriterion("takes_date <>", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateGreaterThan(Date value) {
            addCriterion("takes_date >", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("takes_date >=", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateLessThan(Date value) {
            addCriterion("takes_date <", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateLessThanOrEqualTo(Date value) {
            addCriterion("takes_date <=", value, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateIn(List<Date> values) {
            addCriterion("takes_date in", values, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateNotIn(List<Date> values) {
            addCriterion("takes_date not in", values, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateBetween(Date value1, Date value2) {
            addCriterion("takes_date between", value1, value2, "takesDate");
            return (Criteria) this;
        }

        public Criteria andTakesDateNotBetween(Date value1, Date value2) {
            addCriterion("takes_date not between", value1, value2, "takesDate");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("application not between", value1, value2, "application");
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