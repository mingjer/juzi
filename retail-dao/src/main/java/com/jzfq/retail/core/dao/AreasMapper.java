package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.Areas;
import com.jzfq.retail.bean.domain.AreasQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int countByExample(AreasQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int deleteByExample(AreasQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int insert(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int insertSelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    List<Areas> selectByExample(AreasQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    Areas selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") Areas record, @Param("example") AreasQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int updateByExample(@Param("record") Areas record, @Param("example") AreasQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int updateByPrimaryKeySelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table areas
     *
     * @mbggenerated Sat Jun 23 17:06:16 CST 2018
     */
    int updateByPrimaryKey(Areas record);
}