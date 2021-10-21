package com.gao.mybatis.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-20 11:45
 **/
@Data
public class Blog {

    private String id;

    private String title;

    private String author;

    //在java中Date一般用util包下的，SQL包下的创建不出来时间
    private Date createTime;

    private int views;

}
