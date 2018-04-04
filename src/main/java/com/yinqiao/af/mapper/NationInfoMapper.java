package com.yinqiao.af.mapper;

import com.yinqiao.af.model.NationInfo;
import java.util.List;

public interface NationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FJB_NATION
     *
     * @mbg.generated Wed Mar 14 09:45:11 CST 2018
     */
    int deleteByPrimaryKey(String nationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FJB_NATION
     *
     * @mbg.generated Wed Mar 14 09:45:11 CST 2018
     */
    int insert(NationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FJB_NATION
     *
     * @mbg.generated Wed Mar 14 09:45:11 CST 2018
     */
    NationInfo selectByPrimaryKey(String nationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FJB_NATION
     *
     * @mbg.generated Wed Mar 14 09:45:11 CST 2018
     */
    List<NationInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FJB_NATION
     *
     * @mbg.generated Wed Mar 14 09:45:11 CST 2018
     */
    int updateByPrimaryKey(NationInfo record);
    
    List<String> selectAllNation();
    
    String queryNationId(String nation);
}