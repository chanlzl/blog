/*
*
* Comment.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import java.util.Date;

public class Comment {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 父id
     */
    private Integer parentId;

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
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 评论内容
     * @return content 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 评论内容
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 文章id
     * @return article_id 文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 文章id
     * @param articleId 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 父id
     * @return parent_id 父id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父id
     * @param parentId 父id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}