package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.Teacher;
import com.gao.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import static org.junit.Assert.*;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-18 21:58
 **/
public class TeacherMapperTest {


    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    public void getTeacher(){

    }


}