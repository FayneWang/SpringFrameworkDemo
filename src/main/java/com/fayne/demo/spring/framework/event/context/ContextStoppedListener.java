package com.fayne.demo.spring.framework.event.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStoppedListener implements ApplicationListener<ContextStoppedEvent>{

    public void onApplicationEvent(ContextStoppedEvent event) {

    }
}
