package com.yoga.mapper;

import com.yoga.entity.Tree;
import com.yoga.entity.TreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeMapper {
    /**
     * 根据用户id查找权限信息
     * @param uid
     * @return
     */
    List<Tree> findByUid(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    long countByExample(TreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByExample(TreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insert(Tree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int insertSelective(Tree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    List<Tree> selectByExample(TreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    Tree selectByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Tree record, @Param("example") TreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Tree record, @Param("example") TreeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Tree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tree
     *
     * @mbg.generated Tue Jun 09 19:11:09 GMT+08:00 2020
     */
    int updateByPrimaryKey(Tree record);
}