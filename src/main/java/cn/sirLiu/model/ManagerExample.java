package cn.sirLiu.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerSexIsNull() {
            addCriterion("manager_sex is null");
            return (Criteria) this;
        }

        public Criteria andManagerSexIsNotNull() {
            addCriterion("manager_sex is not null");
            return (Criteria) this;
        }

        public Criteria andManagerSexEqualTo(String value) {
            addCriterion("manager_sex =", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotEqualTo(String value) {
            addCriterion("manager_sex <>", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexGreaterThan(String value) {
            addCriterion("manager_sex >", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexGreaterThanOrEqualTo(String value) {
            addCriterion("manager_sex >=", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLessThan(String value) {
            addCriterion("manager_sex <", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLessThanOrEqualTo(String value) {
            addCriterion("manager_sex <=", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLike(String value) {
            addCriterion("manager_sex like", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotLike(String value) {
            addCriterion("manager_sex not like", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexIn(List<String> values) {
            addCriterion("manager_sex in", values, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotIn(List<String> values) {
            addCriterion("manager_sex not in", values, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexBetween(String value1, String value2) {
            addCriterion("manager_sex between", value1, value2, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotBetween(String value1, String value2) {
            addCriterion("manager_sex not between", value1, value2, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressIsNull() {
            addCriterion("manager_living_address is null");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressIsNotNull() {
            addCriterion("manager_living_address is not null");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressEqualTo(String value) {
            addCriterion("manager_living_address =", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressNotEqualTo(String value) {
            addCriterion("manager_living_address <>", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressGreaterThan(String value) {
            addCriterion("manager_living_address >", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("manager_living_address >=", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressLessThan(String value) {
            addCriterion("manager_living_address <", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressLessThanOrEqualTo(String value) {
            addCriterion("manager_living_address <=", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressLike(String value) {
            addCriterion("manager_living_address like", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressNotLike(String value) {
            addCriterion("manager_living_address not like", value, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressIn(List<String> values) {
            addCriterion("manager_living_address in", values, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressNotIn(List<String> values) {
            addCriterion("manager_living_address not in", values, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressBetween(String value1, String value2) {
            addCriterion("manager_living_address between", value1, value2, "managerLivingAddress");
            return (Criteria) this;
        }

        public Criteria andManagerLivingAddressNotBetween(String value1, String value2) {
            addCriterion("manager_living_address not between", value1, value2, "managerLivingAddress");
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