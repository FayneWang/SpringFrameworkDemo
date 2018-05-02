package com.fayne.demo.spring.framework.bean.lifecycle.callback;

import com.fayne.demo.spring.framework.bean.composing.ConfigB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class RunTest {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LifecycleCallbackConfig.class);
        ctx.removeBeanDefinition("foo");

    }
}
