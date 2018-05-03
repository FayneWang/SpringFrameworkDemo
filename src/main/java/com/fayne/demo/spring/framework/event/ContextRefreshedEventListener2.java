package com.fayne.demo.spring.framework.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedEventListener2 implements ApplicationListener<ContextRefreshedEvent>{

    public void onApplicationEvent(ContextRefreshedEvent event) {

    }

}
