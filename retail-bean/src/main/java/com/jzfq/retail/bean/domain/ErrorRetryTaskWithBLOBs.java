package com.jzfq.retail.bean.domain;

import java.io.Serializable;

public class ErrorRetryTaskWithBLOBs extends ErrorRetryTask implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_retry_task.request_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    private String requestParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_retry_task.response_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    private String responseParam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table error_retry_task
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_retry_task.request_param
     *
     * @return the value of error_retry_task.request_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_retry_task.request_param
     *
     * @param requestParam the value for error_retry_task.request_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_retry_task.response_param
     *
     * @return the value of error_retry_task.response_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    public String getResponseParam() {
        return responseParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_retry_task.response_param
     *
     * @param responseParam the value for error_retry_task.response_param
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    public void setResponseParam(String responseParam) {
        this.responseParam = responseParam == null ? null : responseParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_retry_task
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
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
        ErrorRetryTaskWithBLOBs other = (ErrorRetryTaskWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getRetryCount() == null ? other.getRetryCount() == null : this.getRetryCount().equals(other.getRetryCount()))
            && (this.getCurrentCount() == null ? other.getCurrentCount() == null : this.getCurrentCount().equals(other.getCurrentCount()))
            && (this.getRetryResult() == null ? other.getRetryResult() == null : this.getRetryResult().equals(other.getRetryResult()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRequestParam() == null ? other.getRequestParam() == null : this.getRequestParam().equals(other.getRequestParam()))
            && (this.getResponseParam() == null ? other.getResponseParam() == null : this.getResponseParam().equals(other.getResponseParam()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_retry_task
     *
     * @mbggenerated Tue Jul 03 17:06:28 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getRetryCount() == null) ? 0 : getRetryCount().hashCode());
        result = prime * result + ((getCurrentCount() == null) ? 0 : getCurrentCount().hashCode());
        result = prime * result + ((getRetryResult() == null) ? 0 : getRetryResult().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRequestParam() == null) ? 0 : getRequestParam().hashCode());
        result = prime * result + ((getResponseParam() == null) ? 0 : getResponseParam().hashCode());
        return result;
    }
}