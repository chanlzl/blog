/*
*
* AttachMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Attach;

public interface AttachMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Attach record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Attach record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Attach selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Attach record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Attach record);
}