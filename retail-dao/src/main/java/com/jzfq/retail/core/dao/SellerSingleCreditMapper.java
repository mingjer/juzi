package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SellerSingleCredit;
import com.jzfq.retail.bean.domain.SellerSingleCreditQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerSingleCreditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int countByExample(SellerSingleCreditQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int deleteByExample(SellerSingleCreditQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int insert(SellerSingleCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int insertSelective(SellerSingleCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    List<SellerSingleCredit> selectByExample(SellerSingleCreditQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    SellerSingleCredit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") SellerSingleCredit record, @Param("example") SellerSingleCreditQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int updateByExample(@Param("record") SellerSingleCredit record, @Param("example") SellerSingleCreditQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int updateByPrimaryKeySelective(SellerSingleCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_single_credit
     *
     * @mbggenerated Thu Jul 05 09:37:06 CST 2018
     */
    int updateByPrimaryKey(SellerSingleCredit record);
}