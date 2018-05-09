package com.fayne.demo.spring.framework.event.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConditionalEventNotifier {

    @EventListener(condition = "#event.test=='demo'")
    public void processEvent1(ConditionalEvent event){
        System.out.println("ConditionalEventNotifier.processEvent1:"+event.getTest());
    }


    @EventListener
    public void processEvent2(ConditionalEvent event){
        System.out.println("ConditionalEventNotifier.processEvent1:"+event.getTest());
    }

    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationEventConfig.class);
        ConditionalEvent event1 = new ConditionalEvent(ctx);
        event1.setTest("demo");
        ConditionalEvent event2 = new ConditionalEvent(ctx);
        event2.setTest("test");

        ctx.publishEvent(event1);
        ctx.publishEvent(event2);
    }
}
