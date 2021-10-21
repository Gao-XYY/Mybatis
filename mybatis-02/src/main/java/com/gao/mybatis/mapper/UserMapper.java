package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-15 22:50
 **/
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
