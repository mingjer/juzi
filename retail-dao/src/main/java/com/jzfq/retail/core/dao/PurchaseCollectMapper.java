package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.PurchaseCollect;
import com.jzfq.retail.bean.domain.PurchaseCollectQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int countByExample(PurchaseCollectQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int deleteByExample(PurchaseCollectQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int insert(PurchaseCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int insertSelective(PurchaseCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    List<PurchaseCollect> selectByExample(PurchaseCollectQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    PurchaseCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") PurchaseCollect record, @Param("example") PurchaseCollectQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int updateByExample(@Param("record") PurchaseCollect record, @Param("example") PurchaseCollectQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int updateByPrimaryKeySelective(PurchaseCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_collect
     *
     * @mbggenerated Mon Aug 06 20:10:11 CST 2018
     */
    int updateByPrimaryKey(PurchaseCollect record);
}