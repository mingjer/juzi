package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.OrderImage;
import com.jzfq.retail.bean.domain.OrderImageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int countByExample(OrderImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int deleteByExample(OrderImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int insert(OrderImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int insertSelective(OrderImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    List<OrderImage> selectByExample(OrderImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    OrderImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderImage record, @Param("example") OrderImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int updateByExample(@Param("record") OrderImage record, @Param("example") OrderImageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int updateByPrimaryKeySelective(OrderImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_image
     *
     * @mbggenerated Tue Aug 28 17:42:37 CST 2018
     */
    int updateByPrimaryKey(OrderImage record);
}