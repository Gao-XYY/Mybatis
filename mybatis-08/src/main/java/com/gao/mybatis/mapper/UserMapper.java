package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-21 15:00
 **/
public interface UserMapper {

    User queryUserById(@Param("id") int id);


    int updateUser(User user);

}
