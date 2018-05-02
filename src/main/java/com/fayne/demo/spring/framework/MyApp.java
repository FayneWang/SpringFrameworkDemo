package com.fayne.demo.spring.framework;

import com.fayne.demo.spring.framework.bean.lifecycle.callback.Foo;
import org.omg.CORBA.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 9:55
 */
public class MyApp {

    public static void main(String args[]){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        applicationContext.removeBeanDefinition("foo");
        Integer i = (Integer) applicationContext.getBean("dependency-test");

    }
}
