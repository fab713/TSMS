package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EventuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventuserExample() {
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

        public Criteria andEventuseridIsNull() {
            addCriterion("EVENTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andEventuseridIsNotNull() {
            addCriterion("EVENTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andEventuseridEqualTo(BigDecimal value) {
            addCriterion("EVENTUSERID =", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridNotEqualTo(BigDecimal value) {
            addCriterion("EVENTUSERID <>", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridGreaterThan(BigDecimal value) {
            addCriterion("EVENTUSERID >", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTUSERID >=", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridLessThan(BigDecimal value) {
            addCriterion("EVENTUSERID <", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTUSERID <=", value, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridIn(List<BigDecimal> values) {
            addCriterion("EVENTUSERID in", values, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridNotIn(List<BigDecimal> values) {
            addCriterion("EVENTUSERID not in", values, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTUSERID between", value1, value2, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andEventuseridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTUSERID not between", value1, value2, "eventuserid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(BigDecimal value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(BigDecimal value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(BigDecimal value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(BigDecimal value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<BigDecimal> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<BigDecimal> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEventidIsNull() {
            addCriterion("EVENTID is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("EVENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(BigDecimal value) {
            addCriterion("EVENTID =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(BigDecimal value) {
            addCriterion("EVENTID <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(BigDecimal value) {
            addCriterion("EVENTID >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTID >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(BigDecimal value) {
            addCriterion("EVENTID <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTID <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<BigDecimal> values) {
            addCriterion("EVENTID in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<BigDecimal> values) {
            addCriterion("EVENTID not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTID between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTID not between", value1, value2, "eventid");
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