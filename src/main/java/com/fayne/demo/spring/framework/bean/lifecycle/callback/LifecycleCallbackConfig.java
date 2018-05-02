package com.fayne.demo.spring.framework.bean.lifecycle.callback;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 10:44
 */
@Configuration
public class LifecycleCallbackConfig {

    @Bean(initMethod = "init")
    public Bar getBar(){
        return new Bar();
    }

    @Bean(name="foo",destroyMethod = "cleanup")
    public Foo getFoo(){
        return new Foo();
    }
}
