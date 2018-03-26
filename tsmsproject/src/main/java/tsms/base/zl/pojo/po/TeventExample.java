package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TeventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeventExample() {
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

        public Criteria andEventaddrIsNull() {
            addCriterion("EVENTADDR is null");
            return (Criteria) this;
        }

        public Criteria andEventaddrIsNotNull() {
            addCriterion("EVENTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andEventaddrEqualTo(BigDecimal value) {
            addCriterion("EVENTADDR =", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrNotEqualTo(BigDecimal value) {
            addCriterion("EVENTADDR <>", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrGreaterThan(BigDecimal value) {
            addCriterion("EVENTADDR >", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTADDR >=", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrLessThan(BigDecimal value) {
            addCriterion("EVENTADDR <", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTADDR <=", value, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrIn(List<BigDecimal> values) {
            addCriterion("EVENTADDR in", values, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrNotIn(List<BigDecimal> values) {
            addCriterion("EVENTADDR not in", values, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTADDR between", value1, value2, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventaddrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTADDR not between", value1, value2, "eventaddr");
            return (Criteria) this;
        }

        public Criteria andEventnameIsNull() {
            addCriterion("EVENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEventnameIsNotNull() {
            addCriterion("EVENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEventnameEqualTo(String value) {
            addCriterion("EVENTNAME =", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameNotEqualTo(String value) {
            addCriterion("EVENTNAME <>", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameGreaterThan(String value) {
            addCriterion("EVENTNAME >", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameGreaterThanOrEqualTo(String value) {
            addCriterion("EVENTNAME >=", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameLessThan(String value) {
            addCriterion("EVENTNAME <", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameLessThanOrEqualTo(String value) {
            addCriterion("EVENTNAME <=", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameLike(String value) {
            addCriterion("EVENTNAME like", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameNotLike(String value) {
            addCriterion("EVENTNAME not like", value, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameIn(List<String> values) {
            addCriterion("EVENTNAME in", values, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameNotIn(List<String> values) {
            addCriterion("EVENTNAME not in", values, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameBetween(String value1, String value2) {
            addCriterion("EVENTNAME between", value1, value2, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventnameNotBetween(String value1, String value2) {
            addCriterion("EVENTNAME not between", value1, value2, "eventname");
            return (Criteria) this;
        }

        public Criteria andEventtypeIsNull() {
            addCriterion("EVENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEventtypeIsNotNull() {
            addCriterion("EVENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEventtypeEqualTo(String value) {
            addCriterion("EVENTTYPE =", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotEqualTo(String value) {
            addCriterion("EVENTTYPE <>", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThan(String value) {
            addCriterion("EVENTTYPE >", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThanOrEqualTo(String value) {
            addCriterion("EVENTTYPE >=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThan(String value) {
            addCriterion("EVENTTYPE <", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThanOrEqualTo(String value) {
            addCriterion("EVENTTYPE <=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLike(String value) {
            addCriterion("EVENTTYPE like", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotLike(String value) {
            addCriterion("EVENTTYPE not like", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeIn(List<String> values) {
            addCriterion("EVENTTYPE in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotIn(List<String> values) {
            addCriterion("EVENTTYPE not in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeBetween(String value1, String value2) {
            addCriterion("EVENTTYPE between", value1, value2, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotBetween(String value1, String value2) {
            addCriterion("EVENTTYPE not between", value1, value2, "eventtype");
            return (Criteria) this;
        }

        public Criteria andAlarmneededIsNull() {
            addCriterion("ALARMNEEDED is null");
            return (Criteria) this;
        }

        public Criteria andAlarmneededIsNotNull() {
            addCriterion("ALARMNEEDED is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmneededEqualTo(String value) {
            addCriterion("ALARMNEEDED =", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededNotEqualTo(String value) {
            addCriterion("ALARMNEEDED <>", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededGreaterThan(String value) {
            addCriterion("ALARMNEEDED >", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMNEEDED >=", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededLessThan(String value) {
            addCriterion("ALARMNEEDED <", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededLessThanOrEqualTo(String value) {
            addCriterion("ALARMNEEDED <=", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededLike(String value) {
            addCriterion("ALARMNEEDED like", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededNotLike(String value) {
            addCriterion("ALARMNEEDED not like", value, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededIn(List<String> values) {
            addCriterion("ALARMNEEDED in", values, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededNotIn(List<String> values) {
            addCriterion("ALARMNEEDED not in", values, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededBetween(String value1, String value2) {
            addCriterion("ALARMNEEDED between", value1, value2, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andAlarmneededNotBetween(String value1, String value2) {
            addCriterion("ALARMNEEDED not between", value1, value2, "alarmneeded");
            return (Criteria) this;
        }

        public Criteria andEventdescIsNull() {
            addCriterion("EVENTDESC is null");
            return (Criteria) this;
        }

        public Criteria andEventdescIsNotNull() {
            addCriterion("EVENTDESC is not null");
            return (Criteria) this;
        }

        public Criteria andEventdescEqualTo(String value) {
            addCriterion("EVENTDESC =", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescNotEqualTo(String value) {
            addCriterion("EVENTDESC <>", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescGreaterThan(String value) {
            addCriterion("EVENTDESC >", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescGreaterThanOrEqualTo(String value) {
            addCriterion("EVENTDESC >=", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescLessThan(String value) {
            addCriterion("EVENTDESC <", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescLessThanOrEqualTo(String value) {
            addCriterion("EVENTDESC <=", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescLike(String value) {
            addCriterion("EVENTDESC like", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescNotLike(String value) {
            addCriterion("EVENTDESC not like", value, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescIn(List<String> values) {
            addCriterion("EVENTDESC in", values, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescNotIn(List<String> values) {
            addCriterion("EVENTDESC not in", values, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescBetween(String value1, String value2) {
            addCriterion("EVENTDESC between", value1, value2, "eventdesc");
            return (Criteria) this;
        }

        public Criteria andEventdescNotBetween(String value1, String value2) {
            addCriterion("EVENTDESC not between", value1, value2, "eventdesc");
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