/*
*
* Attach.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import java.util.Date;

public class Attach {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 文件名
     */
    private String fName;

    /**
     * 文件类型
     */
    private String fType;

    /**
     * 上传路径
     */
    private String fKey;

    /**
     * 操作人id
     */
    private Integer userId;

    /**
     * 上传时间
     */
    private Date createTime;

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
     * 文件名
     * @return f_name 文件名
     */
    public String getfName() {
        return fName;
    }

    /**
     * 文件名
     * @param fName 文件名
     */
    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    /**
     * 文件类型
     * @return f_type 文件类型
     */
    public String getfType() {
        return fType;
    }

    /**
     * 文件类型
     * @param fType 文件类型
     */
    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    /**
     * 上传路径
     * @return f_key 上传路径
     */
    public String getfKey() {
        return fKey;
    }

    /**
     * 上传路径
     * @param fKey 上传路径
     */
    public void setfKey(String fKey) {
        this.fKey = fKey == null ? null : fKey.trim();
    }

    /**
     * 操作人id
     * @return user_id 操作人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 操作人id
     * @param userId 操作人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 上传时间
     * @return create_time 上传时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 上传时间
     * @param createTime 上传时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}