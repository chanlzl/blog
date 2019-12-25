/*
*
* LogMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Log;

public interface LogMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Log record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Log record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Log selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Log record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Log record);
}