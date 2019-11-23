package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo_project
 * @description: ${description}
 * @author: Mr.Wang
 * @create: 2019-11-23 15:05
 **/
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService=ioc.getBean(OrderService.class);
        orderService.initOrder("1");
        System.in.read();
    }
}
