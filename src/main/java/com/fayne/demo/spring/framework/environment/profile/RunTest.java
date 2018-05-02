package com.fayne.demo.spring.framework.environment.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class RunTest {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("a","production");
        ctx.register(EnvironmentConfig.class);
        ctx.refresh();

        Character value = (Character)ctx.getBean("a");
        value = (Character)ctx.getBean("c");

    }
}
