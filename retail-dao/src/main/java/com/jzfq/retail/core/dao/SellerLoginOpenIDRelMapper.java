package com.jzfq.retail.core.dao;

import com.jzfq.retail.bean.domain.SellerLoginOpenIDRel;
import com.jzfq.retail.bean.domain.SellerLoginOpenIDRelQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerLoginOpenIDRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int countByExample(SellerLoginOpenIDRelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int deleteByExample(SellerLoginOpenIDRelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int insert(SellerLoginOpenIDRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int insertSelective(SellerLoginOpenIDRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    List<SellerLoginOpenIDRel> selectByExample(SellerLoginOpenIDRelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    SellerLoginOpenIDRel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") SellerLoginOpenIDRel record, @Param("example") SellerLoginOpenIDRelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByExample(@Param("record") SellerLoginOpenIDRel record, @Param("example") SellerLoginOpenIDRelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByPrimaryKeySelective(SellerLoginOpenIDRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    int updateByPrimaryKey(SellerLoginOpenIDRel record);
}