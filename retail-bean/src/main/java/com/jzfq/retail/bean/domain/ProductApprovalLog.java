package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductApprovalLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.product_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.approval_user
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String approvalUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.approval_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer approvalUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_approval_log.approval_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date approvalTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.id
     *
     * @return the value of product_approval_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.id
     *
     * @param id the value for product_approval_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.product_id
     *
     * @return the value of product_approval_log.product_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.product_id
     *
     * @param productId the value for product_approval_log.product_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.state
     *
     * @return the value of product_approval_log.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.state
     *
     * @param state the value for product_approval_log.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.reason
     *
     * @return the value of product_approval_log.reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.reason
     *
     * @param reason the value for product_approval_log.reason
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.approval_user
     *
     * @return the value of product_approval_log.approval_user
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getApprovalUser() {
        return approvalUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.approval_user
     *
     * @param approvalUser the value for product_approval_log.approval_user
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setApprovalUser(String approvalUser) {
        this.approvalUser = approvalUser == null ? null : approvalUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.approval_user_id
     *
     * @return the value of product_approval_log.approval_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.approval_user_id
     *
     * @param approvalUserId the value for product_approval_log.approval_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_approval_log.approval_time
     *
     * @return the value of product_approval_log.approval_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getApprovalTime() {
        return approvalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_approval_log.approval_time
     *
     * @param approvalTime the value for product_approval_log.approval_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
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
        ProductApprovalLog other = (ProductApprovalLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getApprovalUser() == null ? other.getApprovalUser() == null : this.getApprovalUser().equals(other.getApprovalUser()))
            && (this.getApprovalUserId() == null ? other.getApprovalUserId() == null : this.getApprovalUserId().equals(other.getApprovalUserId()))
            && (this.getApprovalTime() == null ? other.getApprovalTime() == null : this.getApprovalTime().equals(other.getApprovalTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getApprovalUser() == null) ? 0 : getApprovalUser().hashCode());
        result = prime * result + ((getApprovalUserId() == null) ? 0 : getApprovalUserId().hashCode());
        result = prime * result + ((getApprovalTime() == null) ? 0 : getApprovalTime().hashCode());
        return result;
    }
}