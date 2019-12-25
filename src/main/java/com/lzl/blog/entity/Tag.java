/*
*
* Tag.java
* Copyright(C) 2019-2020 lzl
* @date 2019-12-15
*/
package com.lzl.blog.entity;

public class Tag {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 标签名
     */
    private String name;

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
     * 标签名
     * @return name 标签名
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名
     * @param name 标签名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}