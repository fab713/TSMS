package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EventrecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventrecExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEventrecidIsNull() {
            addCriterion("EVENTRECID is null");
            return (Criteria) this;
        }

        public Criteria andEventrecidIsNotNull() {
            addCriterion("EVENTRECID is not null");
            return (Criteria) this;
        }

        public Criteria andEventrecidEqualTo(BigDecimal value) {
            addCriterion("EVENTRECID =", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidNotEqualTo(BigDecimal value) {
            addCriterion("EVENTRECID <>", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidGreaterThan(BigDecimal value) {
            addCriterion("EVENTRECID >", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTRECID >=", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidLessThan(BigDecimal value) {
            addCriterion("EVENTRECID <", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVENTRECID <=", value, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidIn(List<BigDecimal> values) {
            addCriterion("EVENTRECID in", values, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidNotIn(List<BigDecimal> values) {
            addCriterion("EVENTRECID not in", values, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTRECID between", value1, value2, "eventrecid");
            return (Criteria) this;
        }

        public Criteria andEventrecidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVENTRECID not between", value1, value2, "eventrecid");
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

        public Criteria andEventtimeIsNull() {
            addCriterion("EVENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNotNull() {
            addCriterion("EVENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEventtimeEqualTo(Date value) {
            addCriterionForJDBCDate("EVENTTIME =", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EVENTTIME <>", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EVENTTIME >", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EVENTTIME >=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThan(Date value) {
            addCriterionForJDBCDate("EVENTTIME <", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EVENTTIME <=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeIn(List<Date> values) {
            addCriterionForJDBCDate("EVENTTIME in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EVENTTIME not in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EVENTTIME between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EVENTTIME not between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("SENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("SENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("SENDTIME =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SENDTIME <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SENDTIME >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDTIME >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterionForJDBCDate("SENDTIME <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDTIME <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("SENDTIME in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SENDTIME not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDTIME between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDTIME not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendstateIsNull() {
            addCriterion("SENDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSendstateIsNotNull() {
            addCriterion("SENDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendstateEqualTo(BigDecimal value) {
            addCriterion("SENDSTATE =", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateNotEqualTo(BigDecimal value) {
            addCriterion("SENDSTATE <>", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateGreaterThan(BigDecimal value) {
            addCriterion("SENDSTATE >", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SENDSTATE >=", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateLessThan(BigDecimal value) {
            addCriterion("SENDSTATE <", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SENDSTATE <=", value, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateIn(List<BigDecimal> values) {
            addCriterion("SENDSTATE in", values, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateNotIn(List<BigDecimal> values) {
            addCriterion("SENDSTATE not in", values, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENDSTATE between", value1, value2, "sendstate");
            return (Criteria) this;
        }

        public Criteria andSendstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENDSTATE not between", value1, value2, "sendstate");
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