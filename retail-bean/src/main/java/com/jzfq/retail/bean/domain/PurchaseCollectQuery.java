package com.jzfq.retail.bean.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseCollectQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public PurchaseCollectQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
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
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
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
            addCriterion("purchaseCollect.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("purchaseCollect.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("purchaseCollect.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("purchaseCollect.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("purchaseCollect.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("purchaseCollect.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("purchaseCollect.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("purchaseCollect.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdIsNull() {
            addCriterion("purchaseCollect.purchase_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdIsNotNull() {
            addCriterion("purchaseCollect.purchase_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdEqualTo(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id =", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotEqualTo(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id <>", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdGreaterThan(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id >", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id >=", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdLessThan(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id <", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.purchase_orders_id <=", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdIn(List<Integer> values) {
            addCriterion("purchaseCollect.purchase_orders_id in", values, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotIn(List<Integer> values) {
            addCriterion("purchaseCollect.purchase_orders_id not in", values, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.purchase_orders_id between", value1, value2, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.purchase_orders_id not between", value1, value2, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("purchaseCollect.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("purchaseCollect.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("purchaseCollect.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("purchaseCollect.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("purchaseCollect.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("purchaseCollect.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("purchaseCollect.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("purchaseCollect.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("purchaseCollect.supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("purchaseCollect.supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("purchaseCollect.supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("purchaseCollect.supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("purchaseCollect.supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("purchaseCollect.supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("purchaseCollect.supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("purchaseCollect.supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("purchaseCollect.supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("purchaseCollect.supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("purchaseCollect.supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("purchaseCollect.supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andCollectStatusIsNull() {
            addCriterion("purchaseCollect.collect_status is null");
            return (Criteria) this;
        }

        public Criteria andCollectStatusIsNotNull() {
            addCriterion("purchaseCollect.collect_status is not null");
            return (Criteria) this;
        }

        public Criteria andCollectStatusEqualTo(Integer value) {
            addCriterion("purchaseCollect.collect_status =", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusNotEqualTo(Integer value) {
            addCriterion("purchaseCollect.collect_status <>", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusGreaterThan(Integer value) {
            addCriterion("purchaseCollect.collect_status >", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.collect_status >=", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusLessThan(Integer value) {
            addCriterion("purchaseCollect.collect_status <", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseCollect.collect_status <=", value, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusIn(List<Integer> values) {
            addCriterion("purchaseCollect.collect_status in", values, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusNotIn(List<Integer> values) {
            addCriterion("purchaseCollect.collect_status not in", values, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.collect_status between", value1, value2, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseCollect.collect_status not between", value1, value2, "collectStatus");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("purchaseCollect.collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("purchaseCollect.collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("purchaseCollect.collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("purchaseCollect.collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("purchaseCollect.collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("purchaseCollect.collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("purchaseCollect.collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("purchaseCollect.collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIsNull() {
            addCriterion("purchaseCollect.last_collect_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIsNotNull() {
            addCriterion("purchaseCollect.last_collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeEqualTo(Date value) {
            addCriterion("purchaseCollect.last_collect_time =", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotEqualTo(Date value) {
            addCriterion("purchaseCollect.last_collect_time <>", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeGreaterThan(Date value) {
            addCriterion("purchaseCollect.last_collect_time >", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.last_collect_time >=", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeLessThan(Date value) {
            addCriterion("purchaseCollect.last_collect_time <", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.last_collect_time <=", value, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeIn(List<Date> values) {
            addCriterion("purchaseCollect.last_collect_time in", values, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotIn(List<Date> values) {
            addCriterion("purchaseCollect.last_collect_time not in", values, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.last_collect_time between", value1, value2, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andLastCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.last_collect_time not between", value1, value2, "lastCollectTime");
            return (Criteria) this;
        }

        public Criteria andCollectPersonIsNull() {
            addCriterion("purchaseCollect.collect_person is null");
            return (Criteria) this;
        }

        public Criteria andCollectPersonIsNotNull() {
            addCriterion("purchaseCollect.collect_person is not null");
            return (Criteria) this;
        }

        public Criteria andCollectPersonEqualTo(String value) {
            addCriterion("purchaseCollect.collect_person =", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonNotEqualTo(String value) {
            addCriterion("purchaseCollect.collect_person <>", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonGreaterThan(String value) {
            addCriterion("purchaseCollect.collect_person >", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.collect_person >=", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonLessThan(String value) {
            addCriterion("purchaseCollect.collect_person <", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonLessThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.collect_person <=", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonLike(String value) {
            addCriterion("purchaseCollect.collect_person like", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonNotLike(String value) {
            addCriterion("purchaseCollect.collect_person not like", value, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonIn(List<String> values) {
            addCriterion("purchaseCollect.collect_person in", values, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonNotIn(List<String> values) {
            addCriterion("purchaseCollect.collect_person not in", values, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonBetween(String value1, String value2) {
            addCriterion("purchaseCollect.collect_person between", value1, value2, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andCollectPersonNotBetween(String value1, String value2) {
            addCriterion("purchaseCollect.collect_person not between", value1, value2, "collectPerson");
            return (Criteria) this;
        }

        public Criteria andIntoCodeIsNull() {
            addCriterion("purchaseCollect.into_code is null");
            return (Criteria) this;
        }

        public Criteria andIntoCodeIsNotNull() {
            addCriterion("purchaseCollect.into_code is not null");
            return (Criteria) this;
        }

        public Criteria andIntoCodeEqualTo(String value) {
            addCriterion("purchaseCollect.into_code =", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeNotEqualTo(String value) {
            addCriterion("purchaseCollect.into_code <>", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeGreaterThan(String value) {
            addCriterion("purchaseCollect.into_code >", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.into_code >=", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeLessThan(String value) {
            addCriterion("purchaseCollect.into_code <", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeLessThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.into_code <=", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeLike(String value) {
            addCriterion("purchaseCollect.into_code like", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeNotLike(String value) {
            addCriterion("purchaseCollect.into_code not like", value, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeIn(List<String> values) {
            addCriterion("purchaseCollect.into_code in", values, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeNotIn(List<String> values) {
            addCriterion("purchaseCollect.into_code not in", values, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeBetween(String value1, String value2) {
            addCriterion("purchaseCollect.into_code between", value1, value2, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoCodeNotBetween(String value1, String value2) {
            addCriterion("purchaseCollect.into_code not between", value1, value2, "intoCode");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNull() {
            addCriterion("purchaseCollect.into_time is null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNotNull() {
            addCriterion("purchaseCollect.into_time is not null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeEqualTo(Date value) {
            addCriterion("purchaseCollect.into_time =", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotEqualTo(Date value) {
            addCriterion("purchaseCollect.into_time <>", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThan(Date value) {
            addCriterion("purchaseCollect.into_time >", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.into_time >=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThan(Date value) {
            addCriterion("purchaseCollect.into_time <", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchaseCollect.into_time <=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIn(List<Date> values) {
            addCriterion("purchaseCollect.into_time in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotIn(List<Date> values) {
            addCriterion("purchaseCollect.into_time not in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.into_time between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchaseCollect.into_time not between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("purchaseCollect.source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("purchaseCollect.source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("purchaseCollect.source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("purchaseCollect.source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("purchaseCollect.source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("purchaseCollect.source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("purchaseCollect.source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("purchaseCollect.source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("purchaseCollect.source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("purchaseCollect.source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("purchaseCollect.source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("purchaseCollect.source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("purchaseCollect.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("purchaseCollect.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("purchaseCollect.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("purchaseCollect.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("purchaseCollect.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("purchaseCollect.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("purchaseCollect.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("purchaseCollect.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("purchaseCollect.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("purchaseCollect.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("purchaseCollect.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("purchaseCollect.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("purchaseCollect.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLikeInsensitive(String value) {
            addCriterion("upper(purchaseCollect.supplier_name) like", value.toUpperCase(), "supplierName");
            return (Criteria) this;
        }

        public Criteria andCollectPersonLikeInsensitive(String value) {
            addCriterion("upper(purchaseCollect.collect_person) like", value.toUpperCase(), "collectPerson");
            return (Criteria) this;
        }

        public Criteria andIntoCodeLikeInsensitive(String value) {
            addCriterion("upper(purchaseCollect.into_code) like", value.toUpperCase(), "intoCode");
            return (Criteria) this;
        }

        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(purchaseCollect.source) like", value.toUpperCase(), "source");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(purchaseCollect.remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_collect
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 06 20:10:11 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
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