/*
*
* ArticleDetailMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-25
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.ArticleDetail;

public interface ArticleDetailMapper {
    /**
     *
     * @mbg.generated 2019-12-25
     */
    int deleteByPrimaryKey(String articleId);

    /**
     *
     * @mbg.generated 2019-12-25
     */
    int insert(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-25
     */
    int insertSelective(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-25
     */
    ArticleDetail selectByPrimaryKey(String articleId);

    /**
     *
     * @mbg.generated 2019-12-25
     */
    int updateByPrimaryKeySelective(ArticleDetail record);

    /**
     *
     * @mbg.generated 2019-12-25
     */
    int updateByPrimaryKeyWithBLOBs(ArticleDetail record);
}