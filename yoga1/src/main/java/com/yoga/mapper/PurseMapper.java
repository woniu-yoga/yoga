package com.yoga.mapper;

import com.yoga.entity.Purse;
import com.yoga.entity.PurseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:49 GMT+08:00 2020
     */
    long countByExample(PurseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:49 GMT+08:00 2020
     */
    int deleteByExample(PurseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:49 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer purseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int insert(Purse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int insertSelective(Purse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    List<Purse> selectByExample(PurseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    Purse selectByPrimaryKey(Integer purseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Purse record, @Param("example") PurseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Purse record, @Param("example") PurseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Purse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purse
     *
     * @mbg.generated Thu Jun 11 14:45:50 GMT+08:00 2020
     */
    int updateByPrimaryKey(Purse record);
}