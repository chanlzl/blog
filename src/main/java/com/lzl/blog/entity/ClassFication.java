/*
*
* ClassFication.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

public class ClassFication {
    /**
     * 类别主键
     */
    private Integer id;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别主键
     * @return id 类别主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 类别主键
     * @param id 类别主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 类别名称
     * @return name 类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类别名称
     * @param name 类别名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}