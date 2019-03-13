package com.adv.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyTablesExample() {
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

        public Criteria andBuyNameIsNull() {
            addCriterion("buy_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyNameIsNotNull() {
            addCriterion("buy_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNameEqualTo(String value) {
            addCriterion("buy_name =", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotEqualTo(String value) {
            addCriterion("buy_name <>", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThan(String value) {
            addCriterion("buy_name >", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThanOrEqualTo(String value) {
            addCriterion("buy_name >=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThan(String value) {
            addCriterion("buy_name <", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThanOrEqualTo(String value) {
            addCriterion("buy_name <=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLike(String value) {
            addCriterion("buy_name like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotLike(String value) {
            addCriterion("buy_name not like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameIn(List<String> values) {
            addCriterion("buy_name in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotIn(List<String> values) {
            addCriterion("buy_name not in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameBetween(String value1, String value2) {
            addCriterion("buy_name between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotBetween(String value1, String value2) {
            addCriterion("buy_name not between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNumberIsNull() {
            addCriterion("buy_number is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumberIsNotNull() {
            addCriterion("buy_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumberEqualTo(Integer value) {
            addCriterion("buy_number =", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberNotEqualTo(Integer value) {
            addCriterion("buy_number <>", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberGreaterThan(Integer value) {
            addCriterion("buy_number >", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_number >=", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberLessThan(Integer value) {
            addCriterion("buy_number <", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("buy_number <=", value, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberIn(List<Integer> values) {
            addCriterion("buy_number in", values, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberNotIn(List<Integer> values) {
            addCriterion("buy_number not in", values, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberBetween(Integer value1, Integer value2) {
            addCriterion("buy_number between", value1, value2, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andBuyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_number not between", value1, value2, "buyNumber");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Long value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Long value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Long value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Long value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Long> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Long> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Long value1, Long value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterion("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterion("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterion("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterion("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterion("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterion("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterion("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNull() {
            addCriterion("supp_phone is null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIsNotNull() {
            addCriterion("supp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneEqualTo(String value) {
            addCriterion("supp_phone =", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotEqualTo(String value) {
            addCriterion("supp_phone <>", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThan(String value) {
            addCriterion("supp_phone >", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supp_phone >=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThan(String value) {
            addCriterion("supp_phone <", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLessThanOrEqualTo(String value) {
            addCriterion("supp_phone <=", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneLike(String value) {
            addCriterion("supp_phone like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotLike(String value) {
            addCriterion("supp_phone not like", value, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneIn(List<String> values) {
            addCriterion("supp_phone in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotIn(List<String> values) {
            addCriterion("supp_phone not in", values, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneBetween(String value1, String value2) {
            addCriterion("supp_phone between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andSuppPhoneNotBetween(String value1, String value2) {
            addCriterion("supp_phone not between", value1, value2, "suppPhone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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