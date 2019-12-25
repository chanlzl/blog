/*
*
* CommentMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.Comment;

public interface CommentMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(Comment record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(Comment record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(Comment record);
}