/*
*
* BlogMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Blog;

public interface BlogMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Blog record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Blog record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Blog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Blog record);
}