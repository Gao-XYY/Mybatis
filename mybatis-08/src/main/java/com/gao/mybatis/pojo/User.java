package com.gao.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-21 14:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private int id;

    private String name;

    private String pwd;

}
