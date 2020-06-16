package com.yoga.mapper;

import com.yoga.entity.Userinfo;
import com.yoga.entity.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {

    /**
     * 根据uid查找用户信息
     * @param uid
     * @return
     */
    Userinfo findByUid(Integer uid);


    /**
     * 查询附近的人的信息（教练、场馆、学员）
     * @param lng , lat
     * @return
     */
    List<Userinfo> nearBy(Double lng , Double lat);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    Userinfo selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKey(Userinfo record);

    /**
     * 查询所有的权限且用于直接的展示
     * @param uname
     *
     * @return
     */

    Userinfo loginin(@Param("uname")String uname );
}