/*
*
* TagMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Tag;

public interface TagMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Tag record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Tag record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Tag selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Tag record);
}