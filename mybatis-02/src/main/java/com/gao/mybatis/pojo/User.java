package com.gao.mybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-15 22:44
 **/
//@Alias("hello")这个注解可以给这个实体类取一个别名
public class User {

    private Integer id;

    private String name;

    private String pwd;

    public User() {
    }

    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}