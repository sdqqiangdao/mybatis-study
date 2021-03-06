package org.mybatis.study.web.dao;

import org.mybatis.study.web.model.Blog;

import java.util.List;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Sun Apr 01 16:59:18 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Sun Apr 01 16:59:18 CST 2018
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Sun Apr 01 16:59:18 CST 2018
     */
    Blog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Sun Apr 01 16:59:18 CST 2018
     */
    List<Blog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Sun Apr 01 16:59:18 CST 2018
     */
    int updateByPrimaryKey(Blog record);
}