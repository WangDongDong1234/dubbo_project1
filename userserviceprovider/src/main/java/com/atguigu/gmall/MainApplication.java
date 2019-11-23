package com.atguigu.gmall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo_project
 * @description: ${description}
 * @author: Mr.Wang
 * @create: 2019-11-23 14:24
 **/
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        //为了不让程序中止
        System.in.read();
    }
}
