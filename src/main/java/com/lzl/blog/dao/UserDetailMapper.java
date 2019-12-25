/*
*
* UserDetailMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.UserDetail;

public interface UserDetailMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(UserDetail record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(UserDetail record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    UserDetail selectByPrimaryKey(Integer userId);


    UserDetail selectByUserName(String username);


    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(UserDetail record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(UserDetail record);
}