package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FunctioninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctioninfoExample() {
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

        public Criteria andFunctioninfoidIsNull() {
            addCriterion("FUNCTIONINFOID is null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidIsNotNull() {
            addCriterion("FUNCTIONINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidEqualTo(BigDecimal value) {
            addCriterion("FUNCTIONINFOID =", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidNotEqualTo(BigDecimal value) {
            addCriterion("FUNCTIONINFOID <>", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidGreaterThan(BigDecimal value) {
            addCriterion("FUNCTIONINFOID >", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNCTIONINFOID >=", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidLessThan(BigDecimal value) {
            addCriterion("FUNCTIONINFOID <", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUNCTIONINFOID <=", value, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidIn(List<BigDecimal> values) {
            addCriterion("FUNCTIONINFOID in", values, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidNotIn(List<BigDecimal> values) {
            addCriterion("FUNCTIONINFOID not in", values, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNCTIONINFOID between", value1, value2, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUNCTIONINFOID not between", value1, value2, "functioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidIsNull() {
            addCriterion("FUN_FUNCTIONINFOID is null");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidIsNotNull() {
            addCriterion("FUN_FUNCTIONINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidEqualTo(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID =", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidNotEqualTo(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID <>", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidGreaterThan(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID >", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID >=", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidLessThan(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID <", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUN_FUNCTIONINFOID <=", value, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidIn(List<BigDecimal> values) {
            addCriterion("FUN_FUNCTIONINFOID in", values, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidNotIn(List<BigDecimal> values) {
            addCriterion("FUN_FUNCTIONINFOID not in", values, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUN_FUNCTIONINFOID between", value1, value2, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunFunctioninfoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUN_FUNCTIONINFOID not between", value1, value2, "funFunctioninfoid");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameIsNull() {
            addCriterion("FUNCTIONINFONAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameIsNotNull() {
            addCriterion("FUNCTIONINFONAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameEqualTo(String value) {
            addCriterion("FUNCTIONINFONAME =", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameNotEqualTo(String value) {
            addCriterion("FUNCTIONINFONAME <>", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameGreaterThan(String value) {
            addCriterion("FUNCTIONINFONAME >", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFONAME >=", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameLessThan(String value) {
            addCriterion("FUNCTIONINFONAME <", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFONAME <=", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameLike(String value) {
            addCriterion("FUNCTIONINFONAME like", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameNotLike(String value) {
            addCriterion("FUNCTIONINFONAME not like", value, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameIn(List<String> values) {
            addCriterion("FUNCTIONINFONAME in", values, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameNotIn(List<String> values) {
            addCriterion("FUNCTIONINFONAME not in", values, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFONAME between", value1, value2, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfonameNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFONAME not between", value1, value2, "functioninfoname");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescIsNull() {
            addCriterion("FUNCTIONINFODESC is null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescIsNotNull() {
            addCriterion("FUNCTIONINFODESC is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescEqualTo(String value) {
            addCriterion("FUNCTIONINFODESC =", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescNotEqualTo(String value) {
            addCriterion("FUNCTIONINFODESC <>", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescGreaterThan(String value) {
            addCriterion("FUNCTIONINFODESC >", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFODESC >=", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescLessThan(String value) {
            addCriterion("FUNCTIONINFODESC <", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFODESC <=", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescLike(String value) {
            addCriterion("FUNCTIONINFODESC like", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescNotLike(String value) {
            addCriterion("FUNCTIONINFODESC not like", value, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescIn(List<String> values) {
            addCriterion("FUNCTIONINFODESC in", values, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescNotIn(List<String> values) {
            addCriterion("FUNCTIONINFODESC not in", values, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFODESC between", value1, value2, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfodescNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFODESC not between", value1, value2, "functioninfodesc");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlIsNull() {
            addCriterion("FUNCTIONINFOURL is null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlIsNotNull() {
            addCriterion("FUNCTIONINFOURL is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlEqualTo(String value) {
            addCriterion("FUNCTIONINFOURL =", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlNotEqualTo(String value) {
            addCriterion("FUNCTIONINFOURL <>", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlGreaterThan(String value) {
            addCriterion("FUNCTIONINFOURL >", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFOURL >=", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlLessThan(String value) {
            addCriterion("FUNCTIONINFOURL <", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIONINFOURL <=", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlLike(String value) {
            addCriterion("FUNCTIONINFOURL like", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlNotLike(String value) {
            addCriterion("FUNCTIONINFOURL not like", value, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlIn(List<String> values) {
            addCriterion("FUNCTIONINFOURL in", values, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlNotIn(List<String> values) {
            addCriterion("FUNCTIONINFOURL not in", values, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFOURL between", value1, value2, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andFunctioninfourlNotBetween(String value1, String value2) {
            addCriterion("FUNCTIONINFOURL not between", value1, value2, "functioninfourl");
            return (Criteria) this;
        }

        public Criteria andIsdataacessIsNull() {
            addCriterion("ISDATAACESS is null");
            return (Criteria) this;
        }

        public Criteria andIsdataacessIsNotNull() {
            addCriterion("ISDATAACESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsdataacessEqualTo(String value) {
            addCriterion("ISDATAACESS =", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessNotEqualTo(String value) {
            addCriterion("ISDATAACESS <>", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessGreaterThan(String value) {
            addCriterion("ISDATAACESS >", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessGreaterThanOrEqualTo(String value) {
            addCriterion("ISDATAACESS >=", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessLessThan(String value) {
            addCriterion("ISDATAACESS <", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessLessThanOrEqualTo(String value) {
            addCriterion("ISDATAACESS <=", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessLike(String value) {
            addCriterion("ISDATAACESS like", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessNotLike(String value) {
            addCriterion("ISDATAACESS not like", value, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessIn(List<String> values) {
            addCriterion("ISDATAACESS in", values, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessNotIn(List<String> values) {
            addCriterion("ISDATAACESS not in", values, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessBetween(String value1, String value2) {
            addCriterion("ISDATAACESS between", value1, value2, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsdataacessNotBetween(String value1, String value2) {
            addCriterion("ISDATAACESS not between", value1, value2, "isdataacess");
            return (Criteria) this;
        }

        public Criteria andIsshortcutIsNull() {
            addCriterion("ISSHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andIsshortcutIsNotNull() {
            addCriterion("ISSHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsshortcutEqualTo(String value) {
            addCriterion("ISSHORTCUT =", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutNotEqualTo(String value) {
            addCriterion("ISSHORTCUT <>", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutGreaterThan(String value) {
            addCriterion("ISSHORTCUT >", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutGreaterThanOrEqualTo(String value) {
            addCriterion("ISSHORTCUT >=", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutLessThan(String value) {
            addCriterion("ISSHORTCUT <", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutLessThanOrEqualTo(String value) {
            addCriterion("ISSHORTCUT <=", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutLike(String value) {
            addCriterion("ISSHORTCUT like", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutNotLike(String value) {
            addCriterion("ISSHORTCUT not like", value, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutIn(List<String> values) {
            addCriterion("ISSHORTCUT in", values, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutNotIn(List<String> values) {
            addCriterion("ISSHORTCUT not in", values, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutBetween(String value1, String value2) {
            addCriterion("ISSHORTCUT between", value1, value2, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsshortcutNotBetween(String value1, String value2) {
            addCriterion("ISSHORTCUT not between", value1, value2, "isshortcut");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemIsNull() {
            addCriterion("ISMENUITEM is null");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemIsNotNull() {
            addCriterion("ISMENUITEM is not null");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemEqualTo(String value) {
            addCriterion("ISMENUITEM =", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemNotEqualTo(String value) {
            addCriterion("ISMENUITEM <>", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemGreaterThan(String value) {
            addCriterion("ISMENUITEM >", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemGreaterThanOrEqualTo(String value) {
            addCriterion("ISMENUITEM >=", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemLessThan(String value) {
            addCriterion("ISMENUITEM <", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemLessThanOrEqualTo(String value) {
            addCriterion("ISMENUITEM <=", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemLike(String value) {
            addCriterion("ISMENUITEM like", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemNotLike(String value) {
            addCriterion("ISMENUITEM not like", value, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemIn(List<String> values) {
            addCriterion("ISMENUITEM in", values, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemNotIn(List<String> values) {
            addCriterion("ISMENUITEM not in", values, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemBetween(String value1, String value2) {
            addCriterion("ISMENUITEM between", value1, value2, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andIsmenuitemNotBetween(String value1, String value2) {
            addCriterion("ISMENUITEM not between", value1, value2, "ismenuitem");
            return (Criteria) this;
        }

        public Criteria andOtherurlIsNull() {
            addCriterion("OTHERURL is null");
            return (Criteria) this;
        }

        public Criteria andOtherurlIsNotNull() {
            addCriterion("OTHERURL is not null");
            return (Criteria) this;
        }

        public Criteria andOtherurlEqualTo(String value) {
            addCriterion("OTHERURL =", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlNotEqualTo(String value) {
            addCriterion("OTHERURL <>", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlGreaterThan(String value) {
            addCriterion("OTHERURL >", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERURL >=", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlLessThan(String value) {
            addCriterion("OTHERURL <", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlLessThanOrEqualTo(String value) {
            addCriterion("OTHERURL <=", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlLike(String value) {
            addCriterion("OTHERURL like", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlNotLike(String value) {
            addCriterion("OTHERURL not like", value, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlIn(List<String> values) {
            addCriterion("OTHERURL in", values, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlNotIn(List<String> values) {
            addCriterion("OTHERURL not in", values, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlBetween(String value1, String value2) {
            addCriterion("OTHERURL between", value1, value2, "otherurl");
            return (Criteria) this;
        }

        public Criteria andOtherurlNotBetween(String value1, String value2) {
            addCriterion("OTHERURL not between", value1, value2, "otherurl");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncIsNull() {
            addCriterion("ISMAKERFUNC is null");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncIsNotNull() {
            addCriterion("ISMAKERFUNC is not null");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncEqualTo(String value) {
            addCriterion("ISMAKERFUNC =", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncNotEqualTo(String value) {
            addCriterion("ISMAKERFUNC <>", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncGreaterThan(String value) {
            addCriterion("ISMAKERFUNC >", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncGreaterThanOrEqualTo(String value) {
            addCriterion("ISMAKERFUNC >=", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncLessThan(String value) {
            addCriterion("ISMAKERFUNC <", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncLessThanOrEqualTo(String value) {
            addCriterion("ISMAKERFUNC <=", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncLike(String value) {
            addCriterion("ISMAKERFUNC like", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncNotLike(String value) {
            addCriterion("ISMAKERFUNC not like", value, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncIn(List<String> values) {
            addCriterion("ISMAKERFUNC in", values, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncNotIn(List<String> values) {
            addCriterion("ISMAKERFUNC not in", values, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncBetween(String value1, String value2) {
            addCriterion("ISMAKERFUNC between", value1, value2, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIsmakerfuncNotBetween(String value1, String value2) {
            addCriterion("ISMAKERFUNC not between", value1, value2, "ismakerfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncIsNull() {
            addCriterion("ISLOGFUNC is null");
            return (Criteria) this;
        }

        public Criteria andIslogfuncIsNotNull() {
            addCriterion("ISLOGFUNC is not null");
            return (Criteria) this;
        }

        public Criteria andIslogfuncEqualTo(String value) {
            addCriterion("ISLOGFUNC =", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncNotEqualTo(String value) {
            addCriterion("ISLOGFUNC <>", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncGreaterThan(String value) {
            addCriterion("ISLOGFUNC >", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncGreaterThanOrEqualTo(String value) {
            addCriterion("ISLOGFUNC >=", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncLessThan(String value) {
            addCriterion("ISLOGFUNC <", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncLessThanOrEqualTo(String value) {
            addCriterion("ISLOGFUNC <=", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncLike(String value) {
            addCriterion("ISLOGFUNC like", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncNotLike(String value) {
            addCriterion("ISLOGFUNC not like", value, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncIn(List<String> values) {
            addCriterion("ISLOGFUNC in", values, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncNotIn(List<String> values) {
            addCriterion("ISLOGFUNC not in", values, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncBetween(String value1, String value2) {
            addCriterion("ISLOGFUNC between", value1, value2, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIslogfuncNotBetween(String value1, String value2) {
            addCriterion("ISLOGFUNC not between", value1, value2, "islogfunc");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationIsNull() {
            addCriterion("ISINPUTRELATION is null");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationIsNotNull() {
            addCriterion("ISINPUTRELATION is not null");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationEqualTo(String value) {
            addCriterion("ISINPUTRELATION =", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationNotEqualTo(String value) {
            addCriterion("ISINPUTRELATION <>", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationGreaterThan(String value) {
            addCriterion("ISINPUTRELATION >", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationGreaterThanOrEqualTo(String value) {
            addCriterion("ISINPUTRELATION >=", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationLessThan(String value) {
            addCriterion("ISINPUTRELATION <", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationLessThanOrEqualTo(String value) {
            addCriterion("ISINPUTRELATION <=", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationLike(String value) {
            addCriterion("ISINPUTRELATION like", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationNotLike(String value) {
            addCriterion("ISINPUTRELATION not like", value, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationIn(List<String> values) {
            addCriterion("ISINPUTRELATION in", values, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationNotIn(List<String> values) {
            addCriterion("ISINPUTRELATION not in", values, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationBetween(String value1, String value2) {
            addCriterion("ISINPUTRELATION between", value1, value2, "isinputrelation");
            return (Criteria) this;
        }

        public Criteria andIsinputrelationNotBetween(String value1, String value2) {
            addCriterion("ISINPUTRELATION not between", value1, value2, "isinputrelation");
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