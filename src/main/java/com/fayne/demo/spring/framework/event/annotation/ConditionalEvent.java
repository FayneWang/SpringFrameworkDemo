package com.fayne.demo.spring.framework.event.annotation;


import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class ConditionalEvent extends ApplicationEvent{

    private String test;

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ConditionalEvent(Object source) {
        super(source);
    }

}
