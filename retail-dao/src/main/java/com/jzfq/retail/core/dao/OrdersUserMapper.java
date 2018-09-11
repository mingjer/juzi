package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.OrdersUser;
import com.jzfq.retail.bean.domain.OrdersUserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int countByExample(OrdersUserQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int deleteByExample(OrdersUserQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int insert(OrdersUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int insertSelective(OrdersUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    List<OrdersUser> selectByExample(OrdersUserQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    OrdersUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrdersUser record, @Param("example") OrdersUserQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int updateByExample(@Param("record") OrdersUser record, @Param("example") OrdersUserQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int updateByPrimaryKeySelective(OrdersUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_user
     *
     * @mbggenerated Wed Jul 11 15:05:56 CST 2018
     */
    int updateByPrimaryKey(OrdersUser record);
}