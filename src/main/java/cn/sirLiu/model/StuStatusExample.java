package cn.sirLiu.model;

import java.util.ArrayList;
import java.util.List;

public class StuStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuStatusExample() {
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

        public Criteria andStuStatusIdIsNull() {
            addCriterion("stu_status_id is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdIsNotNull() {
            addCriterion("stu_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdEqualTo(Integer value) {
            addCriterion("stu_status_id =", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdNotEqualTo(Integer value) {
            addCriterion("stu_status_id <>", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdGreaterThan(Integer value) {
            addCriterion("stu_status_id >", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_status_id >=", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdLessThan(Integer value) {
            addCriterion("stu_status_id <", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_status_id <=", value, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdIn(List<Integer> values) {
            addCriterion("stu_status_id in", values, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdNotIn(List<Integer> values) {
            addCriterion("stu_status_id not in", values, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_status_id between", value1, value2, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_status_id not between", value1, value2, "stuStatusId");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameIsNull() {
            addCriterion("stu_status_name is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameIsNotNull() {
            addCriterion("stu_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameEqualTo(String value) {
            addCriterion("stu_status_name =", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameNotEqualTo(String value) {
            addCriterion("stu_status_name <>", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameGreaterThan(String value) {
            addCriterion("stu_status_name >", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status_name >=", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameLessThan(String value) {
            addCriterion("stu_status_name <", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameLessThanOrEqualTo(String value) {
            addCriterion("stu_status_name <=", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameLike(String value) {
            addCriterion("stu_status_name like", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameNotLike(String value) {
            addCriterion("stu_status_name not like", value, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameIn(List<String> values) {
            addCriterion("stu_status_name in", values, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameNotIn(List<String> values) {
            addCriterion("stu_status_name not in", values, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameBetween(String value1, String value2) {
            addCriterion("stu_status_name between", value1, value2, "stuStatusName");
            return (Criteria) this;
        }

        public Criteria andStuStatusNameNotBetween(String value1, String value2) {
            addCriterion("stu_status_name not between", value1, value2, "stuStatusName");
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