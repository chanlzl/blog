/*
*
* ArticleDetailMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-22
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.ArticleDetail;

public interface ArticleDetailMapper {
    /**
     *
     * @mbg.generated 2019-12-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    int insert(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    int insertSelective(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    ArticleDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    int updateByPrimaryKeySelective(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    int updateByPrimaryKeyWithBLOBs(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-22
     */
    int updateByPrimaryKey(ArticleDetail record);
}