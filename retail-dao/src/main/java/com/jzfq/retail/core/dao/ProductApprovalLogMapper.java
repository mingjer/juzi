package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.ProductApprovalLog;
import com.jzfq.retail.bean.domain.ProductApprovalLogQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductApprovalLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int countByExample(ProductApprovalLogQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByExample(ProductApprovalLogQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insert(ProductApprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int insertSelective(ProductApprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    List<ProductApprovalLog> selectByExample(ProductApprovalLogQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    ProductApprovalLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductApprovalLog record, @Param("example") ProductApprovalLogQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByExample(@Param("record") ProductApprovalLog record, @Param("example") ProductApprovalLogQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKeySelective(ProductApprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_approval_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    int updateByPrimaryKey(ProductApprovalLog record);
}