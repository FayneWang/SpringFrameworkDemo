package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.java_based.container.configration.AppConfig;
import com.fayne.demo.spring.framework.java_based.container.configration.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:53
 */
public class ValidatorRunTest {

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        ValidatorConfig config = ctx.getBean(ValidatorConfig.class);
        PersonInfo info = new PersonInfo();
        info.setAge(-1);
        info.setName(null);
        config.setValidate(info);
    }
}
