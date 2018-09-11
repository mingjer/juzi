package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class WithdrawRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.withdraw_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String withdrawId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.seller_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Integer sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.seller_code
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String sellerCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.seller_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String sellerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.merchant
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String merchant;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.application
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String application;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.amount
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Double amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.state
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.fail_reason
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String failReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.trans_num
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String transNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.create_user_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.create_user_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.create_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column withdraw_record.finish_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table withdraw_record
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.id
     *
     * @return the value of withdraw_record.id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.id
     *
     * @param id the value for withdraw_record.id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.withdraw_id
     *
     * @return the value of withdraw_record.withdraw_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getWithdrawId() {
        return withdrawId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.withdraw_id
     *
     * @param withdrawId the value for withdraw_record.withdraw_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId == null ? null : withdrawId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.seller_id
     *
     * @return the value of withdraw_record.seller_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.seller_id
     *
     * @param sellerId the value for withdraw_record.seller_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.seller_code
     *
     * @return the value of withdraw_record.seller_code
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getSellerCode() {
        return sellerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.seller_code
     *
     * @param sellerCode the value for withdraw_record.seller_code
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode == null ? null : sellerCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.seller_name
     *
     * @return the value of withdraw_record.seller_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.seller_name
     *
     * @param sellerName the value for withdraw_record.seller_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.merchant
     *
     * @return the value of withdraw_record.merchant
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.merchant
     *
     * @param merchant the value for withdraw_record.merchant
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setMerchant(String merchant) {
        this.merchant = merchant == null ? null : merchant.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.application
     *
     * @return the value of withdraw_record.application
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getApplication() {
        return application;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.application
     *
     * @param application the value for withdraw_record.application
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.amount
     *
     * @return the value of withdraw_record.amount
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.amount
     *
     * @param amount the value for withdraw_record.amount
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.state
     *
     * @return the value of withdraw_record.state
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.state
     *
     * @param state the value for withdraw_record.state
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.fail_reason
     *
     * @return the value of withdraw_record.fail_reason
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.fail_reason
     *
     * @param failReason the value for withdraw_record.fail_reason
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.trans_num
     *
     * @return the value of withdraw_record.trans_num
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getTransNum() {
        return transNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.trans_num
     *
     * @param transNum the value for withdraw_record.trans_num
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setTransNum(String transNum) {
        this.transNum = transNum == null ? null : transNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.create_user_id
     *
     * @return the value of withdraw_record.create_user_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.create_user_id
     *
     * @param createUserId the value for withdraw_record.create_user_id
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.create_user_name
     *
     * @return the value of withdraw_record.create_user_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.create_user_name
     *
     * @param createUserName the value for withdraw_record.create_user_name
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.create_time
     *
     * @return the value of withdraw_record.create_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.create_time
     *
     * @param createTime the value for withdraw_record.create_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column withdraw_record.finish_time
     *
     * @return the value of withdraw_record.finish_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column withdraw_record.finish_time
     *
     * @param finishTime the value for withdraw_record.finish_time
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table withdraw_record
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
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
        WithdrawRecord other = (WithdrawRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWithdrawId() == null ? other.getWithdrawId() == null : this.getWithdrawId().equals(other.getWithdrawId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getSellerCode() == null ? other.getSellerCode() == null : this.getSellerCode().equals(other.getSellerCode()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getMerchant() == null ? other.getMerchant() == null : this.getMerchant().equals(other.getMerchant()))
            && (this.getApplication() == null ? other.getApplication() == null : this.getApplication().equals(other.getApplication()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getFailReason() == null ? other.getFailReason() == null : this.getFailReason().equals(other.getFailReason()))
            && (this.getTransNum() == null ? other.getTransNum() == null : this.getTransNum().equals(other.getTransNum()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateUserName() == null ? other.getCreateUserName() == null : this.getCreateUserName().equals(other.getCreateUserName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table withdraw_record
     *
     * @mbggenerated Fri Aug 31 15:56:25 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWithdrawId() == null) ? 0 : getWithdrawId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getSellerCode() == null) ? 0 : getSellerCode().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getMerchant() == null) ? 0 : getMerchant().hashCode());
        result = prime * result + ((getApplication() == null) ? 0 : getApplication().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());
        result = prime * result + ((getTransNum() == null) ? 0 : getTransNum().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateUserName() == null) ? 0 : getCreateUserName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        return result;
    }
}