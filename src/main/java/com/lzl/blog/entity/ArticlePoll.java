/*
*
* ArticlePoll.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import java.util.Date;

public class ArticlePoll {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 点赞时间
     */
    private Date createTime;

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 点赞or踩
     */
    private Boolean isPositive;

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
     * 点赞时间
     * @return create_time 点赞时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 点赞时间
     * @param createTime 点赞时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 点赞or踩
     * @return is_positive 点赞or踩
     */
    public Boolean getIsPositive() {
        return isPositive;
    }

    /**
     * 点赞or踩
     * @param isPositive 点赞or踩
     */
    public void setIsPositive(Boolean isPositive) {
        this.isPositive = isPositive;
    }
}