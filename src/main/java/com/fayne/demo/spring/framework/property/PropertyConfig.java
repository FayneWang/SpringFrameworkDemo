package com.fayne.demo.spring.framework.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 16:29
 */

@Configuration
@PropertySource("classpath:com/fayne/demo/spring/framework/property/test.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Bean
    public TestBean testBean(){
        TestBean testBean = new TestBean();
        testBean.setName(env.getProperty("testbean.name"));

        return testBean;
    }
}
