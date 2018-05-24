package com.fayne.demo.spring.framework.bean.composing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class BeanComposingRunner {

    public static void main(String args[]){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        Character a = (Character) ctx.getBean("a");
        Character b = (Character)ctx.getBean("b");
    }
}
