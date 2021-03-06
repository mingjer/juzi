package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SellerPasswordChangeRecord;
import com.jzfq.retail.bean.domain.SellerPasswordChangeRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerPasswordChangeRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int countByExample(SellerPasswordChangeRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int deleteByExample(SellerPasswordChangeRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int insert(SellerPasswordChangeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int insertSelective(SellerPasswordChangeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    List<SellerPasswordChangeRecord> selectByExample(SellerPasswordChangeRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    SellerPasswordChangeRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") SellerPasswordChangeRecord record, @Param("example") SellerPasswordChangeRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByExample(@Param("record") SellerPasswordChangeRecord record, @Param("example") SellerPasswordChangeRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByPrimaryKeySelective(SellerPasswordChangeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_password_change_record
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByPrimaryKey(SellerPasswordChangeRecord record);
}