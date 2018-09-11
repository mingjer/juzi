package com.jzfq.retail.bean.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerLoginPermissionQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public SellerLoginPermissionQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
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
     * This method corresponds to the database table seller_login_permission
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
     * This method corresponds to the database table seller_login_permission
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_permission
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
     * This class corresponds to the database table seller_login_permission
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
            addCriterion("sellerLoginPermission.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sellerLoginPermission.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("sellerLoginPermission.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("sellerLoginPermission.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("sellerLoginPermission.seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("sellerLoginPermission.seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("sellerLoginPermission.seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("sellerLoginPermission.seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("sellerLoginPermission.seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("sellerLoginPermission.seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("sellerLoginPermission.seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("sellerLoginPermission.seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("sellerLoginPermission.seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("sellerLoginPermission.seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNull() {
            addCriterion("sellerLoginPermission.seller_code is null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNotNull() {
            addCriterion("sellerLoginPermission.seller_code is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_code =", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_code <>", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThan(String value) {
            addCriterion("sellerLoginPermission.seller_code >", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_code >=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThan(String value) {
            addCriterion("sellerLoginPermission.seller_code <", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_code <=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLike(String value) {
            addCriterion("sellerLoginPermission.seller_code like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotLike(String value) {
            addCriterion("sellerLoginPermission.seller_code not like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_code in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_code not in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_code between", value1, value2, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_code not between", value1, value2, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMobileIsNull() {
            addCriterion("sellerLoginPermission.seller_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSellerMobileIsNotNull() {
            addCriterion("sellerLoginPermission.seller_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMobileEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_mobile =", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_mobile <>", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileGreaterThan(String value) {
            addCriterion("sellerLoginPermission.seller_mobile >", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_mobile >=", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileLessThan(String value) {
            addCriterion("sellerLoginPermission.seller_mobile <", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_mobile <=", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileLike(String value) {
            addCriterion("sellerLoginPermission.seller_mobile like", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileNotLike(String value) {
            addCriterion("sellerLoginPermission.seller_mobile not like", value, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_mobile in", values, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_mobile not in", values, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_mobile between", value1, value2, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerMobileNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_mobile not between", value1, value2, "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIsNull() {
            addCriterion("sellerLoginPermission.seller_login is null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIsNotNull() {
            addCriterion("sellerLoginPermission.seller_login is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLoginEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_login =", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_login <>", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginGreaterThan(String value) {
            addCriterion("sellerLoginPermission.seller_login >", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_login >=", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginLessThan(String value) {
            addCriterion("sellerLoginPermission.seller_login <", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_login <=", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginLike(String value) {
            addCriterion("sellerLoginPermission.seller_login like", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNotLike(String value) {
            addCriterion("sellerLoginPermission.seller_login not like", value, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_login in", values, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_login not in", values, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_login between", value1, value2, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerLoginNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_login not between", value1, value2, "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNull() {
            addCriterion("sellerLoginPermission.seller_password is null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNotNull() {
            addCriterion("sellerLoginPermission.seller_password is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_password =", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_password <>", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThan(String value) {
            addCriterion("sellerLoginPermission.seller_password >", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_password >=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThan(String value) {
            addCriterion("sellerLoginPermission.seller_password <", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.seller_password <=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLike(String value) {
            addCriterion("sellerLoginPermission.seller_password like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotLike(String value) {
            addCriterion("sellerLoginPermission.seller_password not like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_password in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.seller_password not in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_password between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.seller_password not between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("sellerLoginPermission.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("sellerLoginPermission.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("sellerLoginPermission.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("sellerLoginPermission.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("sellerLoginPermission.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sellerLoginPermission.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("sellerLoginPermission.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sellerLoginPermission.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("sellerLoginPermission.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("sellerLoginPermission.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("sellerLoginPermission.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sellerLoginPermission.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("sellerLoginPermission.create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("sellerLoginPermission.create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("sellerLoginPermission.create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("sellerLoginPermission.create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("sellerLoginPermission.create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("sellerLoginPermission.create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerLoginPermission.create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("sellerLoginPermission.create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("sellerLoginPermission.create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("sellerLoginPermission.create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("sellerLoginPermission.create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("sellerLoginPermission.create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("sellerLoginPermission.create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("sellerLoginPermission.create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("sellerLoginPermission.create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("sellerLoginPermission.create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("sellerLoginPermission.create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("sellerLoginPermission.create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("sellerLoginPermission.create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andSellerNameLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.seller_name) like", value.toUpperCase(), "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.seller_code) like", value.toUpperCase(), "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerMobileLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.seller_mobile) like", value.toUpperCase(), "sellerMobile");
            return (Criteria) this;
        }

        public Criteria andSellerLoginLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.seller_login) like", value.toUpperCase(), "sellerLogin");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.seller_password) like", value.toUpperCase(), "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andCreateUserLikeInsensitive(String value) {
            addCriterion("upper(sellerLoginPermission.create_user) like", value.toUpperCase(), "createUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table seller_login_permission
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
     * This class corresponds to the database table seller_login_permission
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