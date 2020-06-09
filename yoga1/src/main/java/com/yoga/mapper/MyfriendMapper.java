package com.yoga.mapper;

import com.yoga.entity.Myfriend;
import com.yoga.entity.MyfriendExample;
import com.yoga.entity.MyfriendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyfriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    long countByExample(MyfriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByExample(MyfriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByPrimaryKey(MyfriendKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insert(Myfriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insertSelective(Myfriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    List<Myfriend> selectByExample(MyfriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    Myfriend selectByPrimaryKey(MyfriendKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Myfriend record, @Param("example") MyfriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Myfriend record, @Param("example") MyfriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Myfriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myfriend
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKey(Myfriend record);
}