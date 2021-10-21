package com.gao.mybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-18 21:05
 **/
@Data
public class Teacher {

    private int id;

    private String name;

    private List<Student> students;

}
