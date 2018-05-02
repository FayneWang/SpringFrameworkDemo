package com.fayne.demo.spring.framework;

import com.fayne.demo.spring.framework.property.PropertyConfig;
import com.fayne.demo.spring.framework.property.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 16:35
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PropertyConfig.class)
public class PropertisTest {

    @Autowired
    TestBean testBean;

    @Test
    public void test() throws Exception {
        String name = testBean.getName();
        name = name;
    }
}
