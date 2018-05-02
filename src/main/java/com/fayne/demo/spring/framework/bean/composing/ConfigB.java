package com.fayne.demo.spring.framework.bean.composing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 11:50
 */
@Configuration
@Import({ConfigA.class})
public class ConfigB {
    @Bean("b")
    public Character b(){
        return 'b';
    }
}
