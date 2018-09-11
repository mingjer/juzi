package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.ProductCore;
import com.jzfq.retail.bean.domain.ProductCoreQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int countByExample(ProductCoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int deleteByExample(ProductCoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int insert(ProductCore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int insertSelective(ProductCore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    List<ProductCore> selectByExample(ProductCoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    ProductCore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductCore record, @Param("example") ProductCoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int updateByExample(@Param("record") ProductCore record, @Param("example") ProductCoreQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int updateByPrimaryKeySelective(ProductCore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_core
     *
     * @mbggenerated Sun Jul 29 17:21:09 CST 2018
     */
    int updateByPrimaryKey(ProductCore record);
}