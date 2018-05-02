package com.fayne.demo.spring.framework.environment.profile;

import com.fayne.demo.spring.framework.environment.profile.annotation.Develop;
import com.fayne.demo.spring.framework.environment.profile.annotation.Production;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 15:23
 */
@Configuration
public class EnvironmentConfig {

    @Profile("a")
    @Bean("a")
    public Character getA(){
        return 'a';
    }

    @Profile("b")
    @Bean("b")
    public Character getB(){
        return 'b';
    }

    @Production
    @Bean("c")
    public Character getC(){
        return 'c';
    }


    @Develop
    @Bean("d")
    public Character getD(){
        return 'd';
    }

}
