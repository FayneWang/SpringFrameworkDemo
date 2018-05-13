package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 15:09
 */

@Configuration
public class ValidatorConfig {

    void setValidate(@PersonInfoContraint PersonInfo info){

    }

}
