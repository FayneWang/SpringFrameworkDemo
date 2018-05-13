package com.fayne.demo.spring.framework;

import com.fayne.demo.spring.framework.validator.ValidatorConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ValidatorConfig.class)
public class ValidatorTest {

    @Test
    public void testValidator() throws Exception {

    }
}
