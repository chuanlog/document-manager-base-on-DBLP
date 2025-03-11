package com.scut.documentmanagerbaseondbpl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用来描述文章的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    //存储文章作者列表，不使用List因为StringBuilder较为轻量级且便于修改
    private StringBuilder authors;
    //文章标题
    private String title;
    //文章发表的期刊名称
    private String journal;
    //期刊的卷号
    private String volume;
    //文章发表的年份
    private String year;
    //文章的页码
    private String pages;
    //电子版链接
    private String ee;

    /**
     * 添加单个作者，直接在文章作者的StringBuilder中添加作者名，并添加windows风格的换行(\r\n)
     */
    public void addAuthor(StringBuilder author){
        authors.append(author).append("\r\n");
    }
}
