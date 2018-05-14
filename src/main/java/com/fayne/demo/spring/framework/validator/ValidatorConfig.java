package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 15:09
 */

@Configuration
@EnableWebMvc
@ComponentScan
public class ValidatorConfig {

    void setValidate(@PersonInfoContraint PersonInfo info){

    }

}
