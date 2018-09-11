package com.jzfq.retail.bean.domain;

import java.io.Serializable;

public class ProductWithBLOBs extends Product implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name2
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private String name2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private String packing;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.after_sales
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private String afterSales;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.spec_packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private String specPacking;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name2
     *
     * @return the value of product.name2
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public String getName2() {
        return name2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name2
     *
     * @param name2 the value for product.name2
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.packing
     *
     * @return the value of product.packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public String getPacking() {
        return packing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.packing
     *
     * @param packing the value for product.packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public void setPacking(String packing) {
        this.packing = packing == null ? null : packing.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.after_sales
     *
     * @return the value of product.after_sales
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public String getAfterSales() {
        return afterSales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.after_sales
     *
     * @param afterSales the value for product.after_sales
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public void setAfterSales(String afterSales) {
        this.afterSales = afterSales == null ? null : afterSales.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.spec_packing
     *
     * @return the value of product.spec_packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public String getSpecPacking() {
        return specPacking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.spec_packing
     *
     * @param specPacking the value for product.spec_packing
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    public void setSpecPacking(String specPacking) {
        this.specPacking = specPacking == null ? null : specPacking.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
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
        ProductWithBLOBs other = (ProductWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getProductCateId() == null ? other.getProductCateId() == null : this.getProductCateId().equals(other.getProductCateId()))
                && (this.getProductCatePath() == null ? other.getProductCatePath() == null : this.getProductCatePath().equals(other.getProductCatePath()))
                && (this.getName1() == null ? other.getName1() == null : this.getName1().equals(other.getName1()))
                && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
                && (this.getProductBrandId() == null ? other.getProductBrandId() == null : this.getProductBrandId().equals(other.getProductBrandId()))
                && (this.getIsSelf() == null ? other.getIsSelf() == null : this.getIsSelf().equals(other.getIsSelf()))
                && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
                && (this.getProtectedPrice() == null ? other.getProtectedPrice() == null : this.getProtectedPrice().equals(other.getProtectedPrice()))
                && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
                && (this.getMallPcPrice() == null ? other.getMallPcPrice() == null : this.getMallPcPrice().equals(other.getMallPcPrice()))
                && (this.getMalMobilePrice() == null ? other.getMalMobilePrice() == null : this.getMalMobilePrice().equals(other.getMalMobilePrice()))
                && (this.getVirtualSales() == null ? other.getVirtualSales() == null : this.getVirtualSales().equals(other.getVirtualSales()))
                && (this.getActualSales() == null ? other.getActualSales() == null : this.getActualSales().equals(other.getActualSales()))
                && (this.getProductStock() == null ? other.getProductStock() == null : this.getProductStock().equals(other.getProductStock()))
                && (this.getIsNorm() == null ? other.getIsNorm() == null : this.getIsNorm().equals(other.getIsNorm()))
                && (this.getNormIds() == null ? other.getNormIds() == null : this.getNormIds().equals(other.getNormIds()))
                && (this.getNormName() == null ? other.getNormName() == null : this.getNormName().equals(other.getNormName()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
                && (this.getIsTop() == null ? other.getIsTop() == null : this.getIsTop().equals(other.getIsTop()))
                && (this.getUpTime() == null ? other.getUpTime() == null : this.getUpTime().equals(other.getUpTime()))
                && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
                && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
                && (this.getUpUserId() == null ? other.getUpUserId() == null : this.getUpUserId().equals(other.getUpUserId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getSellerCateId() == null ? other.getSellerCateId() == null : this.getSellerCateId().equals(other.getSellerCateId()))
                && (this.getSellerIsTop() == null ? other.getSellerIsTop() == null : this.getSellerIsTop().equals(other.getSellerIsTop()))
                && (this.getSellerState() == null ? other.getSellerState() == null : this.getSellerState().equals(other.getSellerState()))
                && (this.getCommentsNumber() == null ? other.getCommentsNumber() == null : this.getCommentsNumber().equals(other.getCommentsNumber()))
                && (this.getProductCateState() == null ? other.getProductCateState() == null : this.getProductCateState().equals(other.getProductCateState()))
                && (this.getIsInventedProduct() == null ? other.getIsInventedProduct() == null : this.getIsInventedProduct().equals(other.getIsInventedProduct()))
                && (this.getTransportType() == null ? other.getTransportType() == null : this.getTransportType().equals(other.getTransportType()))
                && (this.getTransportId() == null ? other.getTransportId() == null : this.getTransportId().equals(other.getTransportId()))
                && (this.getMasterImg() == null ? other.getMasterImg() == null : this.getMasterImg().equals(other.getMasterImg()))
                && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
                && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
                && (this.getWeights() == null ? other.getWeights() == null : this.getWeights().equals(other.getWeights()))
                && (this.getSettlementPrice() == null ? other.getSettlementPrice() == null : this.getSettlementPrice().equals(other.getSettlementPrice()))
                && (this.getOffTime() == null ? other.getOffTime() == null : this.getOffTime().equals(other.getOffTime()))
                && (this.getmFloorDataId() == null ? other.getmFloorDataId() == null : this.getmFloorDataId().equals(other.getmFloorDataId()))
                && (this.getMasterMiddleImg() == null ? other.getMasterMiddleImg() == null : this.getMasterMiddleImg().equals(other.getMasterMiddleImg()))
                && (this.getMasterLittleImg() == null ? other.getMasterLittleImg() == null : this.getMasterLittleImg().equals(other.getMasterLittleImg()))
                && (this.getTagFall() == null ? other.getTagFall() == null : this.getTagFall().equals(other.getTagFall()))
                && (this.getTagFree() == null ? other.getTagFree() == null : this.getTagFree().equals(other.getTagFree()))
                && (this.getSourceDescription() == null ? other.getSourceDescription() == null : this.getSourceDescription().equals(other.getSourceDescription()))
                && (this.getIsFullPayment() == null ? other.getIsFullPayment() == null : this.getIsFullPayment().equals(other.getIsFullPayment()))
                && (this.getIsByStages() == null ? other.getIsByStages() == null : this.getIsByStages().equals(other.getIsByStages()))
                && (this.getIsSearch() == null ? other.getIsSearch() == null : this.getIsSearch().equals(other.getIsSearch()))
                && (this.getIsPickself() == null ? other.getIsPickself() == null : this.getIsPickself().equals(other.getIsPickself()))
                && (this.getRemark4() == null ? other.getRemark4() == null : this.getRemark4().equals(other.getRemark4()))
                && (this.getRemark5() == null ? other.getRemark5() == null : this.getRemark5().equals(other.getRemark5()))
                && (this.getRemark6() == null ? other.getRemark6() == null : this.getRemark6().equals(other.getRemark6()))
                && (this.getRemark7() == null ? other.getRemark7() == null : this.getRemark7().equals(other.getRemark7()))
                && (this.getIsCategory() == null ? other.getIsCategory() == null : this.getIsCategory().equals(other.getIsCategory()))
                && (this.getLimits() == null ? other.getLimits() == null : this.getLimits().equals(other.getLimits()))
                && (this.getDeliveryChannel() == null ? other.getDeliveryChannel() == null : this.getDeliveryChannel().equals(other.getDeliveryChannel()))
                && (this.getIdentification() == null ? other.getIdentification() == null : this.getIdentification().equals(other.getIdentification()))
                && (this.getHuohao() == null ? other.getHuohao() == null : this.getHuohao().equals(other.getHuohao()))
                && (this.getMallId() == null ? other.getMallId() == null : this.getMallId().equals(other.getMallId()))
                && (this.getProLabel() == null ? other.getProLabel() == null : this.getProLabel().equals(other.getProLabel()))
                && (this.getName2() == null ? other.getName2() == null : this.getName2().equals(other.getName2()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getPacking() == null ? other.getPacking() == null : this.getPacking().equals(other.getPacking()))
                && (this.getAfterSales() == null ? other.getAfterSales() == null : this.getAfterSales().equals(other.getAfterSales()))
                && (this.getSpecPacking() == null ? other.getSpecPacking() == null : this.getSpecPacking().equals(other.getSpecPacking()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated Tue Aug 28 17:01:25 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductCateId() == null) ? 0 : getProductCateId().hashCode());
        result = prime * result + ((getProductCatePath() == null) ? 0 : getProductCatePath().hashCode());
        result = prime * result + ((getName1() == null) ? 0 : getName1().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getProductBrandId() == null) ? 0 : getProductBrandId().hashCode());
        result = prime * result + ((getIsSelf() == null) ? 0 : getIsSelf().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getProtectedPrice() == null) ? 0 : getProtectedPrice().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getMallPcPrice() == null) ? 0 : getMallPcPrice().hashCode());
        result = prime * result + ((getMalMobilePrice() == null) ? 0 : getMalMobilePrice().hashCode());
        result = prime * result + ((getVirtualSales() == null) ? 0 : getVirtualSales().hashCode());
        result = prime * result + ((getActualSales() == null) ? 0 : getActualSales().hashCode());
        result = prime * result + ((getProductStock() == null) ? 0 : getProductStock().hashCode());
        result = prime * result + ((getIsNorm() == null) ? 0 : getIsNorm().hashCode());
        result = prime * result + ((getNormIds() == null) ? 0 : getNormIds().hashCode());
        result = prime * result + ((getNormName() == null) ? 0 : getNormName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getIsTop() == null) ? 0 : getIsTop().hashCode());
        result = prime * result + ((getUpTime() == null) ? 0 : getUpTime().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getUpUserId() == null) ? 0 : getUpUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSellerCateId() == null) ? 0 : getSellerCateId().hashCode());
        result = prime * result + ((getSellerIsTop() == null) ? 0 : getSellerIsTop().hashCode());
        result = prime * result + ((getSellerState() == null) ? 0 : getSellerState().hashCode());
        result = prime * result + ((getCommentsNumber() == null) ? 0 : getCommentsNumber().hashCode());
        result = prime * result + ((getProductCateState() == null) ? 0 : getProductCateState().hashCode());
        result = prime * result + ((getIsInventedProduct() == null) ? 0 : getIsInventedProduct().hashCode());
        result = prime * result + ((getTransportType() == null) ? 0 : getTransportType().hashCode());
        result = prime * result + ((getTransportId() == null) ? 0 : getTransportId().hashCode());
        result = prime * result + ((getMasterImg() == null) ? 0 : getMasterImg().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getWeights() == null) ? 0 : getWeights().hashCode());
        result = prime * result + ((getSettlementPrice() == null) ? 0 : getSettlementPrice().hashCode());
        result = prime * result + ((getOffTime() == null) ? 0 : getOffTime().hashCode());
        result = prime * result + ((getmFloorDataId() == null) ? 0 : getmFloorDataId().hashCode());
        result = prime * result + ((getMasterMiddleImg() == null) ? 0 : getMasterMiddleImg().hashCode());
        result = prime * result + ((getMasterLittleImg() == null) ? 0 : getMasterLittleImg().hashCode());
        result = prime * result + ((getTagFall() == null) ? 0 : getTagFall().hashCode());
        result = prime * result + ((getTagFree() == null) ? 0 : getTagFree().hashCode());
        result = prime * result + ((getSourceDescription() == null) ? 0 : getSourceDescription().hashCode());
        result = prime * result + ((getIsFullPayment() == null) ? 0 : getIsFullPayment().hashCode());
        result = prime * result + ((getIsByStages() == null) ? 0 : getIsByStages().hashCode());
        result = prime * result + ((getIsSearch() == null) ? 0 : getIsSearch().hashCode());
        result = prime * result + ((getIsPickself() == null) ? 0 : getIsPickself().hashCode());
        result = prime * result + ((getRemark4() == null) ? 0 : getRemark4().hashCode());
        result = prime * result + ((getRemark5() == null) ? 0 : getRemark5().hashCode());
        result = prime * result + ((getRemark6() == null) ? 0 : getRemark6().hashCode());
        result = prime * result + ((getRemark7() == null) ? 0 : getRemark7().hashCode());
        result = prime * result + ((getIsCategory() == null) ? 0 : getIsCategory().hashCode());
        result = prime * result + ((getLimits() == null) ? 0 : getLimits().hashCode());
        result = prime * result + ((getDeliveryChannel() == null) ? 0 : getDeliveryChannel().hashCode());
        result = prime * result + ((getIdentification() == null) ? 0 : getIdentification().hashCode());
        result = prime * result + ((getHuohao() == null) ? 0 : getHuohao().hashCode());
        result = prime * result + ((getMallId() == null) ? 0 : getMallId().hashCode());
        result = prime * result + ((getProLabel() == null) ? 0 : getProLabel().hashCode());
        result = prime * result + ((getName2() == null) ? 0 : getName2().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPacking() == null) ? 0 : getPacking().hashCode());
        result = prime * result + ((getAfterSales() == null) ? 0 : getAfterSales().hashCode());
        result = prime * result + ((getSpecPacking() == null) ? 0 : getSpecPacking().hashCode());
        return result;
    }
}