package com.fayne.demo.spring.framework.bean.composing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:50
 */
@Configuration
public class ConfigA {
    @Bean("a")
    public Character a(){
        return 'a';
    }
}
