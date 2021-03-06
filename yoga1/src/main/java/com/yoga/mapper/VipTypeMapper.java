package com.yoga.mapper;

import com.yoga.entity.VipType;
import com.yoga.entity.VipTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    long countByExample(VipTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByExample(VipTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insert(VipType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insertSelective(VipType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    List<VipType> selectByExample(VipTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    VipType selectByPrimaryKey(Integer typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") VipType record, @Param("example") VipTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExample(@Param("record") VipType record, @Param("example") VipTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(VipType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vip_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKey(VipType record);
}