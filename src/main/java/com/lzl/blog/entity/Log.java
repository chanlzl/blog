/*
*
* Log.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import java.util.Date;

public class Log {
    /**
     * 
     */
    private Integer id;

    /**
     * 产生的动作
     */
    private String action;

    /**
     * 产生的数据
     */
    private String data;

    /**
     * 发生人id
     */
    private Integer userId;

    /**
     * 发生人ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 产生的动作
     * @return action 产生的动作
     */
    public String getAction() {
        return action;
    }

    /**
     * 产生的动作
     * @param action 产生的动作
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 产生的数据
     * @return data 产生的数据
     */
    public String getData() {
        return data;
    }

    /**
     * 产生的数据
     * @param data 产生的数据
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * 发生人id
     * @return user_id 发生人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 发生人id
     * @param userId 发生人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 发生人ip
     * @return ip 发生人ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 发生人ip
     * @param ip 发生人ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
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
}