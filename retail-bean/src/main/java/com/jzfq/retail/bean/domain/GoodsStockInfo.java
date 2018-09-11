package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class GoodsStockInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.goods_stock_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer goodsStockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.sn
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private String sn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.sn_status
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private String snStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.count
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.into_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Date intoTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.out_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Date outTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.update_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.pre_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Date preTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.collect_person
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private String collectPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.purchase_collect_goods_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer purchaseCollectGoodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.stock_site_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer stockSiteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.stock_site_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private String stockSiteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.stock_address_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private Integer stockAddressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_stock_info.stock_address_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private String stockAddressName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_stock_info
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.id
     *
     * @return the value of goods_stock_info.id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.id
     *
     * @param id the value for goods_stock_info.id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.goods_stock_id
     *
     * @return the value of goods_stock_info.goods_stock_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getGoodsStockId() {
        return goodsStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.goods_stock_id
     *
     * @param goodsStockId the value for goods_stock_info.goods_stock_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setGoodsStockId(Integer goodsStockId) {
        this.goodsStockId = goodsStockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.sn
     *
     * @return the value of goods_stock_info.sn
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.sn
     *
     * @param sn the value for goods_stock_info.sn
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.sn_status
     *
     * @return the value of goods_stock_info.sn_status
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public String getSnStatus() {
        return snStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.sn_status
     *
     * @param snStatus the value for goods_stock_info.sn_status
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setSnStatus(String snStatus) {
        this.snStatus = snStatus == null ? null : snStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.count
     *
     * @return the value of goods_stock_info.count
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.count
     *
     * @param count the value for goods_stock_info.count
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.into_time
     *
     * @return the value of goods_stock_info.into_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Date getIntoTime() {
        return intoTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.into_time
     *
     * @param intoTime the value for goods_stock_info.into_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setIntoTime(Date intoTime) {
        this.intoTime = intoTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.out_time
     *
     * @return the value of goods_stock_info.out_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.out_time
     *
     * @param outTime the value for goods_stock_info.out_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.update_time
     *
     * @return the value of goods_stock_info.update_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.update_time
     *
     * @param updateTime the value for goods_stock_info.update_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.pre_time
     *
     * @return the value of goods_stock_info.pre_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Date getPreTime() {
        return preTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.pre_time
     *
     * @param preTime the value for goods_stock_info.pre_time
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setPreTime(Date preTime) {
        this.preTime = preTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.collect_person
     *
     * @return the value of goods_stock_info.collect_person
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public String getCollectPerson() {
        return collectPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.collect_person
     *
     * @param collectPerson the value for goods_stock_info.collect_person
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setCollectPerson(String collectPerson) {
        this.collectPerson = collectPerson == null ? null : collectPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.purchase_collect_goods_id
     *
     * @return the value of goods_stock_info.purchase_collect_goods_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getPurchaseCollectGoodsId() {
        return purchaseCollectGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.purchase_collect_goods_id
     *
     * @param purchaseCollectGoodsId the value for goods_stock_info.purchase_collect_goods_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setPurchaseCollectGoodsId(Integer purchaseCollectGoodsId) {
        this.purchaseCollectGoodsId = purchaseCollectGoodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.stock_site_id
     *
     * @return the value of goods_stock_info.stock_site_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getStockSiteId() {
        return stockSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.stock_site_id
     *
     * @param stockSiteId the value for goods_stock_info.stock_site_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setStockSiteId(Integer stockSiteId) {
        this.stockSiteId = stockSiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.stock_site_name
     *
     * @return the value of goods_stock_info.stock_site_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public String getStockSiteName() {
        return stockSiteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.stock_site_name
     *
     * @param stockSiteName the value for goods_stock_info.stock_site_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setStockSiteName(String stockSiteName) {
        this.stockSiteName = stockSiteName == null ? null : stockSiteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.stock_address_id
     *
     * @return the value of goods_stock_info.stock_address_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public Integer getStockAddressId() {
        return stockAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.stock_address_id
     *
     * @param stockAddressId the value for goods_stock_info.stock_address_id
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setStockAddressId(Integer stockAddressId) {
        this.stockAddressId = stockAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_stock_info.stock_address_name
     *
     * @return the value of goods_stock_info.stock_address_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public String getStockAddressName() {
        return stockAddressName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_stock_info.stock_address_name
     *
     * @param stockAddressName the value for goods_stock_info.stock_address_name
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    public void setStockAddressName(String stockAddressName) {
        this.stockAddressName = stockAddressName == null ? null : stockAddressName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_stock_info
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
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
        GoodsStockInfo other = (GoodsStockInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsStockId() == null ? other.getGoodsStockId() == null : this.getGoodsStockId().equals(other.getGoodsStockId()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getSnStatus() == null ? other.getSnStatus() == null : this.getSnStatus().equals(other.getSnStatus()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getIntoTime() == null ? other.getIntoTime() == null : this.getIntoTime().equals(other.getIntoTime()))
            && (this.getOutTime() == null ? other.getOutTime() == null : this.getOutTime().equals(other.getOutTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPreTime() == null ? other.getPreTime() == null : this.getPreTime().equals(other.getPreTime()))
            && (this.getCollectPerson() == null ? other.getCollectPerson() == null : this.getCollectPerson().equals(other.getCollectPerson()))
            && (this.getPurchaseCollectGoodsId() == null ? other.getPurchaseCollectGoodsId() == null : this.getPurchaseCollectGoodsId().equals(other.getPurchaseCollectGoodsId()))
            && (this.getStockSiteId() == null ? other.getStockSiteId() == null : this.getStockSiteId().equals(other.getStockSiteId()))
            && (this.getStockSiteName() == null ? other.getStockSiteName() == null : this.getStockSiteName().equals(other.getStockSiteName()))
            && (this.getStockAddressId() == null ? other.getStockAddressId() == null : this.getStockAddressId().equals(other.getStockAddressId()))
            && (this.getStockAddressName() == null ? other.getStockAddressName() == null : this.getStockAddressName().equals(other.getStockAddressName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_stock_info
     *
     * @mbggenerated Tue Aug 14 21:22:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsStockId() == null) ? 0 : getGoodsStockId().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getSnStatus() == null) ? 0 : getSnStatus().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getIntoTime() == null) ? 0 : getIntoTime().hashCode());
        result = prime * result + ((getOutTime() == null) ? 0 : getOutTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPreTime() == null) ? 0 : getPreTime().hashCode());
        result = prime * result + ((getCollectPerson() == null) ? 0 : getCollectPerson().hashCode());
        result = prime * result + ((getPurchaseCollectGoodsId() == null) ? 0 : getPurchaseCollectGoodsId().hashCode());
        result = prime * result + ((getStockSiteId() == null) ? 0 : getStockSiteId().hashCode());
        result = prime * result + ((getStockSiteName() == null) ? 0 : getStockSiteName().hashCode());
        result = prime * result + ((getStockAddressId() == null) ? 0 : getStockAddressId().hashCode());
        result = prime * result + ((getStockAddressName() == null) ? 0 : getStockAddressName().hashCode());
        return result;
    }
}