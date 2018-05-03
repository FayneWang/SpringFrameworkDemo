package com.fayne.demo.spring.framework.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartEventListener implements ApplicationListener<ContextStartedEvent>{

    public void onApplicationEvent(ContextStartedEvent event) {

    }

}
