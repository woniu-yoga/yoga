package com.yoga.mapper;

import com.yoga.entity.VideoType;
import com.yoga.entity.VideoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    long countByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insert(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insertSelective(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    List<VideoType> selectByExample(VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    VideoType selectByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExample(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(VideoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_type
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKey(VideoType record);
}