package com.fayne.demo.spring.framework.bean.dependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 10:32
 */

@Configuration
public class DependenciesConfig {

    @Bean("dependency-test-string1")
    public String getIntegerValue(){
        return "54321";
    }

    @Bean("dependency-test-string2")
    public String getIntegerValue2(){
        return "12345";
    }

    @Bean("dependency-test")
    public Integer getDependencies(@Qualifier("dependency-test-string1") String value){
        return Integer.valueOf(value);
    }
}
