package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.ProductImage;
import com.jzfq.retail.bean.domain.ProductImageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int countByExample(ProductImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int deleteByExample(ProductImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int insert(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int insertSelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    List<ProductImage> selectByExample(ProductImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    ProductImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductImage record, @Param("example") ProductImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int updateByExample(@Param("record") ProductImage record, @Param("example") ProductImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int updateByPrimaryKeySelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbggenerated Tue Aug 28 14:46:37 CST 2018
     */
    int updateByPrimaryKey(ProductImage record);
}