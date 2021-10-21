package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 关于@Param()注解
 * 基本类型的参数或者String类型，需要加上
 * 引用类型不需要加
 * 如果只有一个基本类型的话，可以忽略，但是建议加上
 * 我们SQL中引用的就是我们这里的@Param("uid")中设定的属性名
 *
 * #{}和${}区别
 * #{}可以防止sql注入 ${}不可以
 **/
public interface UserMapper {

    User getUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);


}
