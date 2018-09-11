package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class StockSite implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.id
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.code
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.address
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.name
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.information
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private String information;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.status
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_site.create_time
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_site
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.id
     *
     * @return the value of stock_site.id
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.id
     *
     * @param id the value for stock_site.id
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.code
     *
     * @return the value of stock_site.code
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.code
     *
     * @param code the value for stock_site.code
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.address
     *
     * @return the value of stock_site.address
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.address
     *
     * @param address the value for stock_site.address
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.name
     *
     * @return the value of stock_site.name
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.name
     *
     * @param name the value for stock_site.name
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.information
     *
     * @return the value of stock_site.information
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public String getInformation() {
        return information;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.information
     *
     * @param information the value for stock_site.information
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.status
     *
     * @return the value of stock_site.status
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.status
     *
     * @param status the value for stock_site.status
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_site.create_time
     *
     * @return the value of stock_site.create_time
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_site.create_time
     *
     * @param createTime the value for stock_site.create_time
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_site
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
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
        StockSite other = (StockSite) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getInformation() == null ? other.getInformation() == null : this.getInformation().equals(other.getInformation()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_site
     *
     * @mbggenerated Thu Aug 02 11:56:06 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getInformation() == null) ? 0 : getInformation().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}