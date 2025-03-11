package com.scut.documentmanagerbaseondbpl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用来描述文章的实体类
 * 由于xml文件中的信息五花八门，有的字段可能为空，又有一些其他的奇奇怪怪的字段，
 * 所以这个类的字段设计以课程任务书中的实例字段为准。
 * (其实重要的也就authors和title，其他的没什么用)
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
    //文章发表月份
    private String month;
    //文章发表的年份
    private String year;
    //光盘
    private String cdrom;
    //电子版链接
    private String ee;
    //文章的状态(这个字段是多加的，用来描述文章的状态，如已发表，未发表等，即xml文件中的标签，没什么用)
    private String status;

    /**
     * 添加单个作者，直接在文章作者的StringBuilder中添加作者名，并添加windows风格的换行(\r\n)
     */
    public void addAuthor(StringBuilder author) {
        authors.append(author).append("\r\n");
    }
}
