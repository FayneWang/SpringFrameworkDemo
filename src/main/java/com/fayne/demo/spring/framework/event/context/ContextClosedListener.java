package com.fayne.demo.spring.framework.event.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedListener  implements ApplicationListener<ContextClosedEvent>{

    public void onApplicationEvent(ContextClosedEvent event) {

    }
}
