package com.gao.mybatis.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @program: Mybatis-study
 * @description: 描述
 * @author: Gao-xy
 * @create: 2021-10-20 12:18
 **/
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

//    @Test
//    public void test(){
//        System.out.println(IDUtils.getId());
//    }

}
