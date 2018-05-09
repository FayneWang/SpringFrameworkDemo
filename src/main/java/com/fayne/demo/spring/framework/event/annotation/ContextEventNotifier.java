package com.fayne.demo.spring.framework.event.annotation;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component // 需要
public class ContextEventNotifier {

    @EventListener
    public void processEvent(ContextRefreshedEvent event){


    }

    @EventListener({ContextRefreshedEvent.class, ContextStartedEvent.class})
    public void processEvent(){

    }
}
