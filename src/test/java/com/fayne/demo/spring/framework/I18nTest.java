package com.fayne.demo.spring.framework;

import com.fayne.demo.spring.framework.i18n.I18NConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;
/**
 * @Author: WangZezhou(301255)
 * @Date 2018/5/3 10:11
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = I18NConfig.class)
public class I18nTest {


    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ResourceBundleMessageSource messageSource;


    @Test
    public void test() throws Exception {

        String message = messageSource.getMessage("i18ntest",new Object[]{"test unit"}, Locale.getDefault());
        message = messageSource.getMessage("i18n.test",new Object[]{"test unit"},null, null);
        message = message;
    }
}
