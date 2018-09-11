package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.StockStatus;
import com.jzfq.retail.bean.domain.StockStatusQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int countByExample(StockStatusQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int deleteByExample(StockStatusQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int insert(StockStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int insertSelective(StockStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    List<StockStatus> selectByExample(StockStatusQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    StockStatus selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") StockStatus record, @Param("example") StockStatusQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int updateByExample(@Param("record") StockStatus record, @Param("example") StockStatusQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int updateByPrimaryKeySelective(StockStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_status
     *
     * @mbggenerated Thu Aug 02 14:59:40 CST 2018
     */
    int updateByPrimaryKey(StockStatus record);
}