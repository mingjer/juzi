package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class SellerImage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.seller_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String sellerCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.store_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String storeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.image_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String imageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.url
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.image_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String imageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.del_flag
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.create_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.create_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.update_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String updateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_image.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_image
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.id
     *
     * @return the value of seller_image.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.id
     *
     * @param id the value for seller_image.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.seller_id
     *
     * @return the value of seller_image.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.seller_id
     *
     * @param sellerId the value for seller_image.seller_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.seller_code
     *
     * @return the value of seller_image.seller_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getSellerCode() {
        return sellerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.seller_code
     *
     * @param sellerCode the value for seller_image.seller_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode == null ? null : sellerCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.store_type
     *
     * @return the value of seller_image.store_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getStoreType() {
        return storeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.store_type
     *
     * @param storeType the value for seller_image.store_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.image_name
     *
     * @return the value of seller_image.image_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.image_name
     *
     * @param imageName the value for seller_image.image_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.url
     *
     * @return the value of seller_image.url
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.url
     *
     * @param url the value for seller_image.url
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.image_type
     *
     * @return the value of seller_image.image_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.image_type
     *
     * @param imageType the value for seller_image.image_type
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.del_flag
     *
     * @return the value of seller_image.del_flag
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.del_flag
     *
     * @param delFlag the value for seller_image.del_flag
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.create_time
     *
     * @return the value of seller_image.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.create_time
     *
     * @param createTime the value for seller_image.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.create_name
     *
     * @return the value of seller_image.create_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.create_name
     *
     * @param createName the value for seller_image.create_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.create_user_id
     *
     * @return the value of seller_image.create_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.create_user_id
     *
     * @param createUserId the value for seller_image.create_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.update_time
     *
     * @return the value of seller_image.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.update_time
     *
     * @param updateTime the value for seller_image.update_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.update_name
     *
     * @return the value of seller_image.update_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.update_name
     *
     * @param updateName the value for seller_image.update_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_image.update_user_id
     *
     * @return the value of seller_image.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_image.update_user_id
     *
     * @param updateUserId the value for seller_image.update_user_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_image
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
        SellerImage other = (SellerImage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getSellerCode() == null ? other.getSellerCode() == null : this.getSellerCode().equals(other.getSellerCode()))
            && (this.getStoreType() == null ? other.getStoreType() == null : this.getStoreType().equals(other.getStoreType()))
            && (this.getImageName() == null ? other.getImageName() == null : this.getImageName().equals(other.getImageName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getImageType() == null ? other.getImageType() == null : this.getImageType().equals(other.getImageType()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateName() == null ? other.getCreateName() == null : this.getCreateName().equals(other.getCreateName()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateName() == null ? other.getUpdateName() == null : this.getUpdateName().equals(other.getUpdateName()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_image
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getSellerCode() == null) ? 0 : getSellerCode().hashCode());
        result = prime * result + ((getStoreType() == null) ? 0 : getStoreType().hashCode());
        result = prime * result + ((getImageName() == null) ? 0 : getImageName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getImageType() == null) ? 0 : getImageType().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateName() == null) ? 0 : getCreateName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateName() == null) ? 0 : getUpdateName().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        return result;
    }
}