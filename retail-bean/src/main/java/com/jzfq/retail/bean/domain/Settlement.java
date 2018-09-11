package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Settlement implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settle_cycle
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String settleCycle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.seller_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String sellerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_product
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyProduct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_logistics
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyLogistics;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_order
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_paid_balance
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyPaidBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_paid_reality
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyPaidReality;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_coupon
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyCoupon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_act_full
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyActFull;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_discount
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyDiscount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyIntegral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer integral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_integral_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyIntegralBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_other
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal moneyOther;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_other_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer moneyOtherType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.money_other_reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String moneyOtherReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.commision
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal commision;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.payable
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal payable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.status
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.update_user_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String updateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table settlement
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.id
     *
     * @return the value of settlement.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.id
     *
     * @param id the value for settlement.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settle_cycle
     *
     * @return the value of settlement.settle_cycle
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getSettleCycle() {
        return settleCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settle_cycle
     *
     * @param settleCycle the value for settlement.settle_cycle
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSettleCycle(String settleCycle) {
        this.settleCycle = settleCycle == null ? null : settleCycle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.seller_id
     *
     * @return the value of settlement.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.seller_id
     *
     * @param sellerId the value for settlement.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.seller_name
     *
     * @return the value of settlement.seller_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.seller_name
     *
     * @param sellerName the value for settlement.seller_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_product
     *
     * @return the value of settlement.money_product
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyProduct() {
        return moneyProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_product
     *
     * @param moneyProduct the value for settlement.money_product
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyProduct(BigDecimal moneyProduct) {
        this.moneyProduct = moneyProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_logistics
     *
     * @return the value of settlement.money_logistics
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyLogistics() {
        return moneyLogistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_logistics
     *
     * @param moneyLogistics the value for settlement.money_logistics
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyLogistics(BigDecimal moneyLogistics) {
        this.moneyLogistics = moneyLogistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_order
     *
     * @return the value of settlement.money_order
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyOrder() {
        return moneyOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_order
     *
     * @param moneyOrder the value for settlement.money_order
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyOrder(BigDecimal moneyOrder) {
        this.moneyOrder = moneyOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_paid_balance
     *
     * @return the value of settlement.money_paid_balance
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyPaidBalance() {
        return moneyPaidBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_paid_balance
     *
     * @param moneyPaidBalance the value for settlement.money_paid_balance
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyPaidBalance(BigDecimal moneyPaidBalance) {
        this.moneyPaidBalance = moneyPaidBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_paid_reality
     *
     * @return the value of settlement.money_paid_reality
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyPaidReality() {
        return moneyPaidReality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_paid_reality
     *
     * @param moneyPaidReality the value for settlement.money_paid_reality
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyPaidReality(BigDecimal moneyPaidReality) {
        this.moneyPaidReality = moneyPaidReality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_coupon
     *
     * @return the value of settlement.money_coupon
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyCoupon() {
        return moneyCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_coupon
     *
     * @param moneyCoupon the value for settlement.money_coupon
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyCoupon(BigDecimal moneyCoupon) {
        this.moneyCoupon = moneyCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_act_full
     *
     * @return the value of settlement.money_act_full
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyActFull() {
        return moneyActFull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_act_full
     *
     * @param moneyActFull the value for settlement.money_act_full
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyActFull(BigDecimal moneyActFull) {
        this.moneyActFull = moneyActFull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_discount
     *
     * @return the value of settlement.money_discount
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyDiscount() {
        return moneyDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_discount
     *
     * @param moneyDiscount the value for settlement.money_discount
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyDiscount(BigDecimal moneyDiscount) {
        this.moneyDiscount = moneyDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_integral
     *
     * @return the value of settlement.money_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyIntegral() {
        return moneyIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_integral
     *
     * @param moneyIntegral the value for settlement.money_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyIntegral(BigDecimal moneyIntegral) {
        this.moneyIntegral = moneyIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.integral
     *
     * @return the value of settlement.integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.integral
     *
     * @param integral the value for settlement.integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_back
     *
     * @return the value of settlement.money_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyBack() {
        return moneyBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_back
     *
     * @param moneyBack the value for settlement.money_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyBack(BigDecimal moneyBack) {
        this.moneyBack = moneyBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_integral_back
     *
     * @return the value of settlement.money_integral_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyIntegralBack() {
        return moneyIntegralBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_integral_back
     *
     * @param moneyIntegralBack the value for settlement.money_integral_back
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyIntegralBack(BigDecimal moneyIntegralBack) {
        this.moneyIntegralBack = moneyIntegralBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_other
     *
     * @return the value of settlement.money_other
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getMoneyOther() {
        return moneyOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_other
     *
     * @param moneyOther the value for settlement.money_other
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyOther(BigDecimal moneyOther) {
        this.moneyOther = moneyOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_other_type
     *
     * @return the value of settlement.money_other_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getMoneyOtherType() {
        return moneyOtherType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_other_type
     *
     * @param moneyOtherType the value for settlement.money_other_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyOtherType(Integer moneyOtherType) {
        this.moneyOtherType = moneyOtherType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.money_other_reason
     *
     * @return the value of settlement.money_other_reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getMoneyOtherReason() {
        return moneyOtherReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.money_other_reason
     *
     * @param moneyOtherReason the value for settlement.money_other_reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMoneyOtherReason(String moneyOtherReason) {
        this.moneyOtherReason = moneyOtherReason == null ? null : moneyOtherReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.commision
     *
     * @return the value of settlement.commision
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getCommision() {
        return commision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.commision
     *
     * @param commision the value for settlement.commision
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCommision(BigDecimal commision) {
        this.commision = commision;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.payable
     *
     * @return the value of settlement.payable
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getPayable() {
        return payable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.payable
     *
     * @param payable the value for settlement.payable
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPayable(BigDecimal payable) {
        this.payable = payable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.status
     *
     * @return the value of settlement.status
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.status
     *
     * @param status the value for settlement.status
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.create_time
     *
     * @return the value of settlement.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.create_time
     *
     * @param createTime the value for settlement.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.update_time
     *
     * @return the value of settlement.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.update_time
     *
     * @param updateTime the value for settlement.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.update_user_id
     *
     * @return the value of settlement.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.update_user_id
     *
     * @param updateUserId the value for settlement.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.update_user_name
     *
     * @return the value of settlement.update_user_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.update_user_name
     *
     * @param updateUserName the value for settlement.update_user_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Settlement other = (Settlement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettleCycle() == null ? other.getSettleCycle() == null : this.getSettleCycle().equals(other.getSettleCycle()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getMoneyProduct() == null ? other.getMoneyProduct() == null : this.getMoneyProduct().equals(other.getMoneyProduct()))
            && (this.getMoneyLogistics() == null ? other.getMoneyLogistics() == null : this.getMoneyLogistics().equals(other.getMoneyLogistics()))
            && (this.getMoneyOrder() == null ? other.getMoneyOrder() == null : this.getMoneyOrder().equals(other.getMoneyOrder()))
            && (this.getMoneyPaidBalance() == null ? other.getMoneyPaidBalance() == null : this.getMoneyPaidBalance().equals(other.getMoneyPaidBalance()))
            && (this.getMoneyPaidReality() == null ? other.getMoneyPaidReality() == null : this.getMoneyPaidReality().equals(other.getMoneyPaidReality()))
            && (this.getMoneyCoupon() == null ? other.getMoneyCoupon() == null : this.getMoneyCoupon().equals(other.getMoneyCoupon()))
            && (this.getMoneyActFull() == null ? other.getMoneyActFull() == null : this.getMoneyActFull().equals(other.getMoneyActFull()))
            && (this.getMoneyDiscount() == null ? other.getMoneyDiscount() == null : this.getMoneyDiscount().equals(other.getMoneyDiscount()))
            && (this.getMoneyIntegral() == null ? other.getMoneyIntegral() == null : this.getMoneyIntegral().equals(other.getMoneyIntegral()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getMoneyBack() == null ? other.getMoneyBack() == null : this.getMoneyBack().equals(other.getMoneyBack()))
            && (this.getMoneyIntegralBack() == null ? other.getMoneyIntegralBack() == null : this.getMoneyIntegralBack().equals(other.getMoneyIntegralBack()))
            && (this.getMoneyOther() == null ? other.getMoneyOther() == null : this.getMoneyOther().equals(other.getMoneyOther()))
            && (this.getMoneyOtherType() == null ? other.getMoneyOtherType() == null : this.getMoneyOtherType().equals(other.getMoneyOtherType()))
            && (this.getMoneyOtherReason() == null ? other.getMoneyOtherReason() == null : this.getMoneyOtherReason().equals(other.getMoneyOtherReason()))
            && (this.getCommision() == null ? other.getCommision() == null : this.getCommision().equals(other.getCommision()))
            && (this.getPayable() == null ? other.getPayable() == null : this.getPayable().equals(other.getPayable()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateUserName() == null ? other.getUpdateUserName() == null : this.getUpdateUserName().equals(other.getUpdateUserName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettleCycle() == null) ? 0 : getSettleCycle().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getMoneyProduct() == null) ? 0 : getMoneyProduct().hashCode());
        result = prime * result + ((getMoneyLogistics() == null) ? 0 : getMoneyLogistics().hashCode());
        result = prime * result + ((getMoneyOrder() == null) ? 0 : getMoneyOrder().hashCode());
        result = prime * result + ((getMoneyPaidBalance() == null) ? 0 : getMoneyPaidBalance().hashCode());
        result = prime * result + ((getMoneyPaidReality() == null) ? 0 : getMoneyPaidReality().hashCode());
        result = prime * result + ((getMoneyCoupon() == null) ? 0 : getMoneyCoupon().hashCode());
        result = prime * result + ((getMoneyActFull() == null) ? 0 : getMoneyActFull().hashCode());
        result = prime * result + ((getMoneyDiscount() == null) ? 0 : getMoneyDiscount().hashCode());
        result = prime * result + ((getMoneyIntegral() == null) ? 0 : getMoneyIntegral().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getMoneyBack() == null) ? 0 : getMoneyBack().hashCode());
        result = prime * result + ((getMoneyIntegralBack() == null) ? 0 : getMoneyIntegralBack().hashCode());
        result = prime * result + ((getMoneyOther() == null) ? 0 : getMoneyOther().hashCode());
        result = prime * result + ((getMoneyOtherType() == null) ? 0 : getMoneyOtherType().hashCode());
        result = prime * result + ((getMoneyOtherReason() == null) ? 0 : getMoneyOtherReason().hashCode());
        result = prime * result + ((getCommision() == null) ? 0 : getCommision().hashCode());
        result = prime * result + ((getPayable() == null) ? 0 : getPayable().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateUserName() == null) ? 0 : getUpdateUserName().hashCode());
        return result;
    }
}