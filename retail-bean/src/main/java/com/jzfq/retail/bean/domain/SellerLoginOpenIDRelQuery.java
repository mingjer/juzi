package com.jzfq.retail.bean.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerLoginOpenIDRelQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public SellerLoginOpenIDRelQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
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
            addCriterion("sellerLoginOpenIDRel.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sellerLoginOpenIDRel.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdIsNull() {
            addCriterion("sellerLoginOpenIDRel.login_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdIsNotNull() {
            addCriterion("sellerLoginOpenIDRel.login_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id =", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdNotEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id <>", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdGreaterThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id >", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id >=", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdLessThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id <", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id <=", value, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id in", values, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdNotIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id not in", values, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id between", value1, value2, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andLoginPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.login_permission_id not between", value1, value2, "loginPermissionId");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("sellerLoginOpenIDRel.openID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("sellerLoginOpenIDRel.openID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("sellerLoginOpenIDRel.openID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("sellerLoginOpenIDRel.openID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("sellerLoginOpenIDRel.openID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginOpenIDRel.openID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("sellerLoginOpenIDRel.openID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginOpenIDRel.openID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("sellerLoginOpenIDRel.openID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("sellerLoginOpenIDRel.openID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("sellerLoginOpenIDRel.openID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("sellerLoginOpenIDRel.openID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("sellerLoginOpenIDRel.openID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("sellerLoginOpenIDRel.openID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("sellerLoginOpenIDRel.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("sellerLoginOpenIDRel.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginOpenIDRel.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("sellerLoginOpenIDRel.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginOpenIDRel.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("sellerLoginOpenIDRel.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("sellerLoginOpenIDRel.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sellerLoginOpenIDRel.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("sellerLoginOpenIDRel.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("sellerLoginOpenIDRel.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("sellerLoginOpenIDRel.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sellerLoginOpenIDRel.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginOpenIDRel.openID) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 30 16:52:44 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
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