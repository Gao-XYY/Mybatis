package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.Student;
import com.gao.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-18 23:21
 **/
public class MyTest {

    @Test
    public void testStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StrudentMapper mapper = sqlSession.getMapper(StrudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }

}
