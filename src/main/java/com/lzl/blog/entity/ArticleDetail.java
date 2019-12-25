/*
*
* ArticleDetail.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-22
*/
package com.lzl.blog.entity;

public class ArticleDetail {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 文章主键
     */
    private String articleId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 文章主键
     * @return article_id 文章主键
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * 文章主键
     * @param articleId 文章主键
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    /**
     * 文章内容
     * @return content 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 文章内容
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}