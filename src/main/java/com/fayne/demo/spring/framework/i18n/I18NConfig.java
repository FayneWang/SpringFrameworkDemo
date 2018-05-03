package com.fayne.demo.spring.framework.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/3 10:07
 */

@Configuration
public class I18NConfig {

    @Bean
    public ResourceBundleMessageSource getMessageSource(){
        ResourceBundleMessageSource message = new ResourceBundleMessageSource();
        message.addBasenames("i18n_test");
        message.setDefaultEncoding("UTF-8"); //设置 properties的乱码。
        String message1 = message.getMessage("i18ntest",new Object[]{"I18N test unit"}, Locale.getDefault()); // 没有配置的编译区域会自动设置成中文的
        return message;
    }


}
