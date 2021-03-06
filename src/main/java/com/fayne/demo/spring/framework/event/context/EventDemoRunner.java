package com.fayne.demo.spring.framework.event.context;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class EventDemoRunner {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);
        ctx.start();
        ctx.stop();
        ctx.close();

    }
}
