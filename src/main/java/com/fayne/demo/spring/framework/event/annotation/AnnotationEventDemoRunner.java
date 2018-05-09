package com.fayne.demo.spring.framework.event.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class AnnotationEventDemoRunner {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationEventConfig.class);
        ctx.start();
        ctx.stop();
        ctx.close();

    }
}
