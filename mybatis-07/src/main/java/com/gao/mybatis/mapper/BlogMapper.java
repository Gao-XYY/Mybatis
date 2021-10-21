package com.gao.mybatis.mapper;

import com.gao.mybatis.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-20 11:50
 **/
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询Blog
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);
    //更新blog
    int updateBlog(Map map);

    //查询1、2、 3 号记录的博客
    List<Blog> queryBlogForeach(Map map);

}
