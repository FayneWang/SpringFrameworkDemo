package com.fayne.demo.spring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 9:59
 */

@Configuration
@ComponentScan(basePackages = {"com.fayne.demo.spring.framework.bean.dependency",
                               "com.fayne.demo.spring.framework.bean.lifecycle.callback"})
public class MyConfig {

    @Bean("abc")
    Integer getTestValue(){
        return 1;
    }

}
