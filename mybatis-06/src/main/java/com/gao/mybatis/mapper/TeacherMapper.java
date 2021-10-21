package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-18 21:07
 **/
public interface TeacherMapper {

    List<Teacher> getTeacher(@Param("tid") int id);

    List<Teacher> getTeacher2(@Param("tid") int id);

}
