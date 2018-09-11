package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SupplierOffers implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.supplier_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.product_goods_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer productGoodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.product_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.sku_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer skuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.sku_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private String skuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.product_brand_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer productBrandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.product_brand_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private String productBrandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.price
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.create_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.create_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.update_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer updateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier_offers.update_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table supplier_offers
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.id
     *
     * @return the value of supplier_offers.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.id
     *
     * @param id the value for supplier_offers.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.supplier_id
     *
     * @return the value of supplier_offers.supplier_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.supplier_id
     *
     * @param supplierId the value for supplier_offers.supplier_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.product_goods_id
     *
     * @return the value of supplier_offers.product_goods_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getProductGoodsId() {
        return productGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.product_goods_id
     *
     * @param productGoodsId the value for supplier_offers.product_goods_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setProductGoodsId(Integer productGoodsId) {
        this.productGoodsId = productGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.product_name
     *
     * @return the value of supplier_offers.product_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.product_name
     *
     * @param productName the value for supplier_offers.product_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.sku_id
     *
     * @return the value of supplier_offers.sku_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.sku_id
     *
     * @param skuId the value for supplier_offers.sku_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.sku_name
     *
     * @return the value of supplier_offers.sku_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.sku_name
     *
     * @param skuName the value for supplier_offers.sku_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.product_brand_id
     *
     * @return the value of supplier_offers.product_brand_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getProductBrandId() {
        return productBrandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.product_brand_id
     *
     * @param productBrandId the value for supplier_offers.product_brand_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setProductBrandId(Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.product_brand_name
     *
     * @return the value of supplier_offers.product_brand_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public String getProductBrandName() {
        return productBrandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.product_brand_name
     *
     * @param productBrandName the value for supplier_offers.product_brand_name
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName == null ? null : productBrandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.price
     *
     * @return the value of supplier_offers.price
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.price
     *
     * @param price the value for supplier_offers.price
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.create_id
     *
     * @return the value of supplier_offers.create_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.create_id
     *
     * @param createId the value for supplier_offers.create_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.create_time
     *
     * @return the value of supplier_offers.create_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.create_time
     *
     * @param createTime the value for supplier_offers.create_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.update_id
     *
     * @return the value of supplier_offers.update_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.update_id
     *
     * @param updateId the value for supplier_offers.update_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier_offers.update_time
     *
     * @return the value of supplier_offers.update_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier_offers.update_time
     *
     * @param updateTime the value for supplier_offers.update_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_offers
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
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
        SupplierOffers other = (SupplierOffers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getProductGoodsId() == null ? other.getProductGoodsId() == null : this.getProductGoodsId().equals(other.getProductGoodsId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getProductBrandId() == null ? other.getProductBrandId() == null : this.getProductBrandId().equals(other.getProductBrandId()))
            && (this.getProductBrandName() == null ? other.getProductBrandName() == null : this.getProductBrandName().equals(other.getProductBrandName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_offers
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getProductGoodsId() == null) ? 0 : getProductGoodsId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getProductBrandId() == null) ? 0 : getProductBrandId().hashCode());
        result = prime * result + ((getProductBrandName() == null) ? 0 : getProductBrandName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}