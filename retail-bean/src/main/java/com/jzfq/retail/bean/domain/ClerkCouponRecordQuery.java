package com.jzfq.retail.bean.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClerkCouponRecordQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public ClerkCouponRecordQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
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
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
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
            addCriterion("clerkCouponRecord.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("clerkCouponRecord.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("clerkCouponRecord.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("clerkCouponRecord.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("clerkCouponRecord.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clerkCouponRecord.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("clerkCouponRecord.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("clerkCouponRecord.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("clerkCouponRecord.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("clerkCouponRecord.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("clerkCouponRecord.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clerkCouponRecord.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("clerkCouponRecord.seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("clerkCouponRecord.seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("clerkCouponRecord.seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("clerkCouponRecord.seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("clerkCouponRecord.seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("clerkCouponRecord.seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("clerkCouponRecord.seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("clerkCouponRecord.seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("clerkCouponRecord.seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("clerkCouponRecord.seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andClerkNameIsNull() {
            addCriterion("clerkCouponRecord.clerk_name is null");
            return (Criteria) this;
        }

        public Criteria andClerkNameIsNotNull() {
            addCriterion("clerkCouponRecord.clerk_name is not null");
            return (Criteria) this;
        }

        public Criteria andClerkNameEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_name =", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_name <>", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameGreaterThan(String value) {
            addCriterion("clerkCouponRecord.clerk_name >", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameGreaterThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_name >=", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLessThan(String value) {
            addCriterion("clerkCouponRecord.clerk_name <", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLessThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_name <=", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLike(String value) {
            addCriterion("clerkCouponRecord.clerk_name like", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotLike(String value) {
            addCriterion("clerkCouponRecord.clerk_name not like", value, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameIn(List<String> values) {
            addCriterion("clerkCouponRecord.clerk_name in", values, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotIn(List<String> values) {
            addCriterion("clerkCouponRecord.clerk_name not in", values, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.clerk_name between", value1, value2, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkNameNotBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.clerk_name not between", value1, value2, "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkMobileIsNull() {
            addCriterion("clerkCouponRecord.clerk_mobile is null");
            return (Criteria) this;
        }

        public Criteria andClerkMobileIsNotNull() {
            addCriterion("clerkCouponRecord.clerk_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andClerkMobileEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile =", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileNotEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile <>", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileGreaterThan(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile >", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileGreaterThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile >=", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileLessThan(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile <", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileLessThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile <=", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileLike(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile like", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileNotLike(String value) {
            addCriterion("clerkCouponRecord.clerk_mobile not like", value, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileIn(List<String> values) {
            addCriterion("clerkCouponRecord.clerk_mobile in", values, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileNotIn(List<String> values) {
            addCriterion("clerkCouponRecord.clerk_mobile not in", values, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.clerk_mobile between", value1, value2, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andClerkMobileNotBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.clerk_mobile not between", value1, value2, "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("clerkCouponRecord.coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("clerkCouponRecord.coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("clerkCouponRecord.coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<BigDecimal> values) {
            addCriterion("clerkCouponRecord.coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<BigDecimal> values) {
            addCriterion("clerkCouponRecord.coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clerkCouponRecord.coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clerkCouponRecord.coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("clerkCouponRecord.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("clerkCouponRecord.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("clerkCouponRecord.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("clerkCouponRecord.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("clerkCouponRecord.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("clerkCouponRecord.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("clerkCouponRecord.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("clerkCouponRecord.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("clerkCouponRecord.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("clerkCouponRecord.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("clerkCouponRecord.use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("clerkCouponRecord.use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(Date value) {
            addCriterion("clerkCouponRecord.use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(Date value) {
            addCriterion("clerkCouponRecord.use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(Date value) {
            addCriterion("clerkCouponRecord.use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clerkCouponRecord.use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(Date value) {
            addCriterion("clerkCouponRecord.use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Date value) {
            addCriterion("clerkCouponRecord.use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<Date> values) {
            addCriterion("clerkCouponRecord.use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<Date> values) {
            addCriterion("clerkCouponRecord.use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(Date value1, Date value2) {
            addCriterion("clerkCouponRecord.use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(Date value1, Date value2) {
            addCriterion("clerkCouponRecord.use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNull() {
            addCriterion("clerkCouponRecord.record_user is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNotNull() {
            addCriterion("clerkCouponRecord.record_user is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserEqualTo(String value) {
            addCriterion("clerkCouponRecord.record_user =", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotEqualTo(String value) {
            addCriterion("clerkCouponRecord.record_user <>", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThan(String value) {
            addCriterion("clerkCouponRecord.record_user >", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.record_user >=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThan(String value) {
            addCriterion("clerkCouponRecord.record_user <", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThanOrEqualTo(String value) {
            addCriterion("clerkCouponRecord.record_user <=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLike(String value) {
            addCriterion("clerkCouponRecord.record_user like", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotLike(String value) {
            addCriterion("clerkCouponRecord.record_user not like", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserIn(List<String> values) {
            addCriterion("clerkCouponRecord.record_user in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotIn(List<String> values) {
            addCriterion("clerkCouponRecord.record_user not in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.record_user between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotBetween(String value1, String value2) {
            addCriterion("clerkCouponRecord.record_user not between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andSellerNameLikeInsensitive(String value) {
            addCriterion("upper(clerkCouponRecord.seller_name) like", value.toUpperCase(), "sellerName");
            return (Criteria) this;
        }

        public Criteria andClerkNameLikeInsensitive(String value) {
            addCriterion("upper(clerkCouponRecord.clerk_name) like", value.toUpperCase(), "clerkName");
            return (Criteria) this;
        }

        public Criteria andClerkMobileLikeInsensitive(String value) {
            addCriterion("upper(clerkCouponRecord.clerk_mobile) like", value.toUpperCase(), "clerkMobile");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(clerkCouponRecord.status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andRecordUserLikeInsensitive(String value) {
            addCriterion("upper(clerkCouponRecord.record_user) like", value.toUpperCase(), "recordUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 15 16:47:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table clerk_coupon_record
     *
     * @mbggenerated Wed Aug 15 16:47:45 CST 2018
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