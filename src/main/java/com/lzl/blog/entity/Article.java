/*
*
* Article.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import java.util.Date;

public class Article {
    /**
     * 文章主键
     */
    private String id;

    /**
     * 文章主题
     */
    private String title;

    /**
     * 作者id
     */
    private String userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 文章概要
     */
    private String summary;

    /**
     * 阅读数
     */
    private Integer readCount;

    /**
     * 分类id
     */
    private Integer classId;

    /**
     * 是否精华
     */
    private Boolean isEssence;

    /**
     * 是否置顶
     */
    private Boolean isTop;

    /**
     * 是否删除，1:删除
     */
    private Boolean isDelete;

    /**
     * 文章主键
     * @return id 文章主键
     */
    public String getId() {
        return id;
    }

    /**
     * 文章主键
     * @param id 文章主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 文章主题
     * @return title 文章主题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 文章主题
     * @param title 文章主题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 作者id
     * @return user_id 作者id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 作者id
     * @param userId 作者id
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 文章概要
     * @return summary 文章概要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 文章概要
     * @param summary 文章概要
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 阅读数
     * @return read_count 阅读数
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * 阅读数
     * @param readCount 阅读数
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * 分类id
     * @return class_id 分类id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 分类id
     * @param classId 分类id
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 是否精华
     * @return is_essence 是否精华
     */
    public Boolean getIsEssence() {
        return isEssence;
    }

    /**
     * 是否精华
     * @param isEssence 是否精华
     */
    public void setIsEssence(Boolean isEssence) {
        this.isEssence = isEssence;
    }

    /**
     * 是否置顶
     * @return is_top 是否置顶
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * 是否置顶
     * @param isTop 是否置顶
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * 是否删除，1:删除
     * @return is_delete 是否删除，1:删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除，1:删除
     * @param isDelete 是否删除，1:删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}