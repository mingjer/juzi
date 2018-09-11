package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class SellerUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.password
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.real_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.phone
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.job
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String job;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.role_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.create_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.update_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer updateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_user.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_user
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.id
     *
     * @return the value of seller_user.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.id
     *
     * @param id the value for seller_user.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.name
     *
     * @return the value of seller_user.name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.name
     *
     * @param name the value for seller_user.name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.password
     *
     * @return the value of seller_user.password
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.password
     *
     * @param password the value for seller_user.password
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.code
     *
     * @return the value of seller_user.code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.code
     *
     * @param code the value for seller_user.code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.real_name
     *
     * @return the value of seller_user.real_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.real_name
     *
     * @param realName the value for seller_user.real_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.phone
     *
     * @return the value of seller_user.phone
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.phone
     *
     * @param phone the value for seller_user.phone
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.job
     *
     * @return the value of seller_user.job
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.job
     *
     * @param job the value for seller_user.job
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.seller_id
     *
     * @return the value of seller_user.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.seller_id
     *
     * @param sellerId the value for seller_user.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.role_id
     *
     * @return the value of seller_user.role_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.role_id
     *
     * @param roleId the value for seller_user.role_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.state
     *
     * @return the value of seller_user.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.state
     *
     * @param state the value for seller_user.state
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.create_id
     *
     * @return the value of seller_user.create_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.create_id
     *
     * @param createId the value for seller_user.create_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.create_time
     *
     * @return the value of seller_user.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.create_time
     *
     * @param createTime the value for seller_user.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.update_id
     *
     * @return the value of seller_user.update_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.update_id
     *
     * @param updateId the value for seller_user.update_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_user.update_time
     *
     * @return the value of seller_user.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_user.update_time
     *
     * @param updateTime the value for seller_user.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_user
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
        SellerUser other = (SellerUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_user
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}