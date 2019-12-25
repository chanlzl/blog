/*
*
* UserDetail.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserDetail {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private Integer tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String photo;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String createTime;

    /**
     * 修改时间
     */
    private Long updateTime;

    /**
     * 是否删除，1:删除
     */
    private int isDelete;

    public UserDetail() {
    }

    public UserDetail(String userId, String nickName, String userName, String password, Integer tel, String email, String photo, String salt, Long updateTime) {
        this.userId = userId;
        this.nickName = nickName;
        this.userName = userName;
        this.password = password;
        this.tel = tel;
        this.email = email;
        this.photo = photo;
        this.salt = salt;
        this.updateTime = updateTime;
    }

    public UserDetail(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户昵称
     * @return nick_name 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户昵称
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 电话
     * @return tel 电话
     */
    public Integer getTel() {
        return tel;
    }

    /**
     * 电话
     * @param tel 电话
     */
    public void setTel(Integer tel) {
        this.tel = tel;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 头像
     * @return photo 头像
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 头像
     * @param photo 头像
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * 盐值
     * @return salt 盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐值
     * @param salt 盐值
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否删除，1:删除
     * @return is_delete 是否删除，1:删除
     */
    public int getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除，1:删除
     * @param isDelete 是否删除，1:删除
     */
    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                ", photo='" + photo + '\'' +
                ", salt='" + salt + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                '}';
    }
}