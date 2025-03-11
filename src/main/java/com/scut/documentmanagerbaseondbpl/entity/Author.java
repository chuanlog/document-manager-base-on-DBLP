package com.scut.documentmanagerbaseondbpl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *作者类,存储作者名称以及出现次数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private String name;//作者名
    private int count;//出现次数

    /**
     * 只提供名字的构造函数，将出现次数默认初始化为1
     * @param name
     */
    public Author(String name) {
        this.name = name;
        this.count = 1;
    }
}
