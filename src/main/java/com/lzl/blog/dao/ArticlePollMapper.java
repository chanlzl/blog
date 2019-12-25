/*
*
* ArticlePollMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.ArticlePoll;

public interface ArticlePollMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(ArticlePoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(ArticlePoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    ArticlePoll selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(ArticlePoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(ArticlePoll record);
}