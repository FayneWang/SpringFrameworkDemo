package com.fayne.demo.spring.framework;

import com.fayne.demo.spring.framework.event.context.EventConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EventConfig.class)
public class ContextEventText {
    @Test
    public void test() throws Exception {

    }
}
