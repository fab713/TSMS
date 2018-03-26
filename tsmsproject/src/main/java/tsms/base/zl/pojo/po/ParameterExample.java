package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParameterExample() {
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

        public Criteria andParameteridIsNull() {
            addCriterion("PARAMETERID is null");
            return (Criteria) this;
        }

        public Criteria andParameteridIsNotNull() {
            addCriterion("PARAMETERID is not null");
            return (Criteria) this;
        }

        public Criteria andParameteridEqualTo(BigDecimal value) {
            addCriterion("PARAMETERID =", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotEqualTo(BigDecimal value) {
            addCriterion("PARAMETERID <>", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridGreaterThan(BigDecimal value) {
            addCriterion("PARAMETERID >", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAMETERID >=", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridLessThan(BigDecimal value) {
            addCriterion("PARAMETERID <", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAMETERID <=", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridIn(List<BigDecimal> values) {
            addCriterion("PARAMETERID in", values, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotIn(List<BigDecimal> values) {
            addCriterion("PARAMETERID not in", values, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAMETERID between", value1, value2, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAMETERID not between", value1, value2, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParametertypeIsNull() {
            addCriterion("PARAMETERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andParametertypeIsNotNull() {
            addCriterion("PARAMETERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParametertypeEqualTo(String value) {
            addCriterion("PARAMETERTYPE =", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotEqualTo(String value) {
            addCriterion("PARAMETERTYPE <>", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeGreaterThan(String value) {
            addCriterion("PARAMETERTYPE >", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERTYPE >=", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLessThan(String value) {
            addCriterion("PARAMETERTYPE <", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERTYPE <=", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeLike(String value) {
            addCriterion("PARAMETERTYPE like", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotLike(String value) {
            addCriterion("PARAMETERTYPE not like", value, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeIn(List<String> values) {
            addCriterion("PARAMETERTYPE in", values, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotIn(List<String> values) {
            addCriterion("PARAMETERTYPE not in", values, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeBetween(String value1, String value2) {
            addCriterion("PARAMETERTYPE between", value1, value2, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametertypeNotBetween(String value1, String value2) {
            addCriterion("PARAMETERTYPE not between", value1, value2, "parametertype");
            return (Criteria) this;
        }

        public Criteria andParametercodeIsNull() {
            addCriterion("PARAMETERCODE is null");
            return (Criteria) this;
        }

        public Criteria andParametercodeIsNotNull() {
            addCriterion("PARAMETERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andParametercodeEqualTo(String value) {
            addCriterion("PARAMETERCODE =", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotEqualTo(String value) {
            addCriterion("PARAMETERCODE <>", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeGreaterThan(String value) {
            addCriterion("PARAMETERCODE >", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERCODE >=", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLessThan(String value) {
            addCriterion("PARAMETERCODE <", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERCODE <=", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeLike(String value) {
            addCriterion("PARAMETERCODE like", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotLike(String value) {
            addCriterion("PARAMETERCODE not like", value, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeIn(List<String> values) {
            addCriterion("PARAMETERCODE in", values, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotIn(List<String> values) {
            addCriterion("PARAMETERCODE not in", values, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeBetween(String value1, String value2) {
            addCriterion("PARAMETERCODE between", value1, value2, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParametercodeNotBetween(String value1, String value2) {
            addCriterion("PARAMETERCODE not between", value1, value2, "parametercode");
            return (Criteria) this;
        }

        public Criteria andParameterdescIsNull() {
            addCriterion("PARAMETERDESC is null");
            return (Criteria) this;
        }

        public Criteria andParameterdescIsNotNull() {
            addCriterion("PARAMETERDESC is not null");
            return (Criteria) this;
        }

        public Criteria andParameterdescEqualTo(String value) {
            addCriterion("PARAMETERDESC =", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotEqualTo(String value) {
            addCriterion("PARAMETERDESC <>", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescGreaterThan(String value) {
            addCriterion("PARAMETERDESC >", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERDESC >=", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLessThan(String value) {
            addCriterion("PARAMETERDESC <", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERDESC <=", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescLike(String value) {
            addCriterion("PARAMETERDESC like", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotLike(String value) {
            addCriterion("PARAMETERDESC not like", value, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescIn(List<String> values) {
            addCriterion("PARAMETERDESC in", values, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotIn(List<String> values) {
            addCriterion("PARAMETERDESC not in", values, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescBetween(String value1, String value2) {
            addCriterion("PARAMETERDESC between", value1, value2, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParameterdescNotBetween(String value1, String value2) {
            addCriterion("PARAMETERDESC not between", value1, value2, "parameterdesc");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNull() {
            addCriterion("PARAMETERVALUE is null");
            return (Criteria) this;
        }

        public Criteria andParametervalueIsNotNull() {
            addCriterion("PARAMETERVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParametervalueEqualTo(String value) {
            addCriterion("PARAMETERVALUE =", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotEqualTo(String value) {
            addCriterion("PARAMETERVALUE <>", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThan(String value) {
            addCriterion("PARAMETERVALUE >", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERVALUE >=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThan(String value) {
            addCriterion("PARAMETERVALUE <", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERVALUE <=", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueLike(String value) {
            addCriterion("PARAMETERVALUE like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotLike(String value) {
            addCriterion("PARAMETERVALUE not like", value, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueIn(List<String> values) {
            addCriterion("PARAMETERVALUE in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotIn(List<String> values) {
            addCriterion("PARAMETERVALUE not in", values, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueBetween(String value1, String value2) {
            addCriterion("PARAMETERVALUE between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParametervalueNotBetween(String value1, String value2) {
            addCriterion("PARAMETERVALUE not between", value1, value2, "parametervalue");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultIsNull() {
            addCriterion("PARAMETERDEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultIsNotNull() {
            addCriterion("PARAMETERDEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultEqualTo(String value) {
            addCriterion("PARAMETERDEFAULT =", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultNotEqualTo(String value) {
            addCriterion("PARAMETERDEFAULT <>", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultGreaterThan(String value) {
            addCriterion("PARAMETERDEFAULT >", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETERDEFAULT >=", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultLessThan(String value) {
            addCriterion("PARAMETERDEFAULT <", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultLessThanOrEqualTo(String value) {
            addCriterion("PARAMETERDEFAULT <=", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultLike(String value) {
            addCriterion("PARAMETERDEFAULT like", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultNotLike(String value) {
            addCriterion("PARAMETERDEFAULT not like", value, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultIn(List<String> values) {
            addCriterion("PARAMETERDEFAULT in", values, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultNotIn(List<String> values) {
            addCriterion("PARAMETERDEFAULT not in", values, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultBetween(String value1, String value2) {
            addCriterion("PARAMETERDEFAULT between", value1, value2, "parameterdefault");
            return (Criteria) this;
        }

        public Criteria andParameterdefaultNotBetween(String value1, String value2) {
            addCriterion("PARAMETERDEFAULT not between", value1, value2, "parameterdefault");
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