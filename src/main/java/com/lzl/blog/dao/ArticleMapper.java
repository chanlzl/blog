/*
*
* ArticleMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Article;
import com.lzl.blog.entity.vo.ArticleVo;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

public interface ArticleMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Article record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Article record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Article selectByPrimaryKey(Integer id);


    List<Article> selectArticle();

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Article record);


    List<ArticleVo> selectArticleByParam(ArticleVo articleVo);
}