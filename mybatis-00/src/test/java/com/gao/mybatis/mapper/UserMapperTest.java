package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.User;
import com.gao.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-16 23:25
 **/
public class UserMapperTest {


    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();

    }



}