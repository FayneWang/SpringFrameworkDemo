package com.fayne.demo.spring.framework.java_based.container.configration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class RunTest {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = ctx.getBean(MyService.class);

    }
}
