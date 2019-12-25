/*
*
* CommentPollMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.CommentPoll;

public interface CommentPollMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(CommentPoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insertSelective(CommentPoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    CommentPoll selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(CommentPoll record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(CommentPoll record);
}