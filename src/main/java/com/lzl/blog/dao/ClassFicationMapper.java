/*
*
* ClassFicationMapper.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.dao;

import com.lzl.blog.entity.ClassFication;

public interface ClassFicationMapper {
    /**
     *
     * @mbg.generated 2019-12-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int insert(ClassFication record);

    /**
     *insertSelective
     * @mbg.generated 2019-12-15
     */
    int insertSelective(ClassFication record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    ClassFication selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKeySelective(ClassFication record);

    /**
     *
     * @mbg.generated 2019-12-15
     */
    int updateByPrimaryKey(ClassFication record);

    ClassFication selectByParam(ClassFication classFication);
}