package com.fayne.demo.spring.framework.java_based.container.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 15:09
 */

@Configuration
public class AppConfig {

    @Bean
    public MyService myService(){
        return new MyService();
    }
}
