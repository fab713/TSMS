package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUserloginidIsNull() {
            addCriterion("USERLOGINID is null");
            return (Criteria) this;
        }

        public Criteria andUserloginidIsNotNull() {
            addCriterion("USERLOGINID is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginidEqualTo(String value) {
            addCriterion("USERLOGINID =", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotEqualTo(String value) {
            addCriterion("USERLOGINID <>", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidGreaterThan(String value) {
            addCriterion("USERLOGINID >", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidGreaterThanOrEqualTo(String value) {
            addCriterion("USERLOGINID >=", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLessThan(String value) {
            addCriterion("USERLOGINID <", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLessThanOrEqualTo(String value) {
            addCriterion("USERLOGINID <=", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLike(String value) {
            addCriterion("USERLOGINID like", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotLike(String value) {
            addCriterion("USERLOGINID not like", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidIn(List<String> values) {
            addCriterion("USERLOGINID in", values, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotIn(List<String> values) {
            addCriterion("USERLOGINID not in", values, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidBetween(String value1, String value2) {
            addCriterion("USERLOGINID between", value1, value2, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotBetween(String value1, String value2) {
            addCriterion("USERLOGINID not between", value1, value2, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNull() {
            addCriterion("USERPASS is null");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNotNull() {
            addCriterion("USERPASS is not null");
            return (Criteria) this;
        }

        public Criteria andUserpassEqualTo(String value) {
            addCriterion("USERPASS =", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotEqualTo(String value) {
            addCriterion("USERPASS <>", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThan(String value) {
            addCriterion("USERPASS >", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASS >=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThan(String value) {
            addCriterion("USERPASS <", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThanOrEqualTo(String value) {
            addCriterion("USERPASS <=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLike(String value) {
            addCriterion("USERPASS like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotLike(String value) {
            addCriterion("USERPASS not like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassIn(List<String> values) {
            addCriterion("USERPASS in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotIn(List<String> values) {
            addCriterion("USERPASS not in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassBetween(String value1, String value2) {
            addCriterion("USERPASS between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotBetween(String value1, String value2) {
            addCriterion("USERPASS not between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("USERSEX is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("USERSEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("USERSEX =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("USERSEX <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("USERSEX >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("USERSEX >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("USERSEX <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("USERSEX <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("USERSEX like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("USERSEX not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("USERSEX in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("USERSEX not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("USERSEX between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("USERSEX not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIsNull() {
            addCriterion("WORKPHONE is null");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIsNotNull() {
            addCriterion("WORKPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkphoneEqualTo(String value) {
            addCriterion("WORKPHONE =", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotEqualTo(String value) {
            addCriterion("WORKPHONE <>", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneGreaterThan(String value) {
            addCriterion("WORKPHONE >", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("WORKPHONE >=", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLessThan(String value) {
            addCriterion("WORKPHONE <", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLessThanOrEqualTo(String value) {
            addCriterion("WORKPHONE <=", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLike(String value) {
            addCriterion("WORKPHONE like", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotLike(String value) {
            addCriterion("WORKPHONE not like", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIn(List<String> values) {
            addCriterion("WORKPHONE in", values, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotIn(List<String> values) {
            addCriterion("WORKPHONE not in", values, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneBetween(String value1, String value2) {
            addCriterion("WORKPHONE between", value1, value2, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotBetween(String value1, String value2) {
            addCriterion("WORKPHONE not between", value1, value2, "workphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CELLPHONE <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CELLPHONE like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CELLPHONE not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andMebmeridIsNull() {
            addCriterion("MEBMERID is null");
            return (Criteria) this;
        }

        public Criteria andMebmeridIsNotNull() {
            addCriterion("MEBMERID is not null");
            return (Criteria) this;
        }

        public Criteria andMebmeridEqualTo(String value) {
            addCriterion("MEBMERID =", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridNotEqualTo(String value) {
            addCriterion("MEBMERID <>", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridGreaterThan(String value) {
            addCriterion("MEBMERID >", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridGreaterThanOrEqualTo(String value) {
            addCriterion("MEBMERID >=", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridLessThan(String value) {
            addCriterion("MEBMERID <", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridLessThanOrEqualTo(String value) {
            addCriterion("MEBMERID <=", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridLike(String value) {
            addCriterion("MEBMERID like", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridNotLike(String value) {
            addCriterion("MEBMERID not like", value, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridIn(List<String> values) {
            addCriterion("MEBMERID in", values, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridNotIn(List<String> values) {
            addCriterion("MEBMERID not in", values, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridBetween(String value1, String value2) {
            addCriterion("MEBMERID between", value1, value2, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andMebmeridNotBetween(String value1, String value2) {
            addCriterion("MEBMERID not between", value1, value2, "mebmerid");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("USEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("USEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("USEREMAIL =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("USEREMAIL <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("USEREMAIL >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("USEREMAIL >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("USEREMAIL <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("USEREMAIL <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("USEREMAIL like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("USEREMAIL not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("USEREMAIL in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("USEREMAIL not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("USEREMAIL between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("USEREMAIL not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserIsNull() {
            addCriterion("ISMAKERUSER is null");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserIsNotNull() {
            addCriterion("ISMAKERUSER is not null");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserEqualTo(String value) {
            addCriterion("ISMAKERUSER =", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserNotEqualTo(String value) {
            addCriterion("ISMAKERUSER <>", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserGreaterThan(String value) {
            addCriterion("ISMAKERUSER >", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserGreaterThanOrEqualTo(String value) {
            addCriterion("ISMAKERUSER >=", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserLessThan(String value) {
            addCriterion("ISMAKERUSER <", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserLessThanOrEqualTo(String value) {
            addCriterion("ISMAKERUSER <=", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserLike(String value) {
            addCriterion("ISMAKERUSER like", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserNotLike(String value) {
            addCriterion("ISMAKERUSER not like", value, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserIn(List<String> values) {
            addCriterion("ISMAKERUSER in", values, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserNotIn(List<String> values) {
            addCriterion("ISMAKERUSER not in", values, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserBetween(String value1, String value2) {
            addCriterion("ISMAKERUSER between", value1, value2, "ismakeruser");
            return (Criteria) this;
        }

        public Criteria andIsmakeruserNotBetween(String value1, String value2) {
            addCriterion("ISMAKERUSER not between", value1, value2, "ismakeruser");
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