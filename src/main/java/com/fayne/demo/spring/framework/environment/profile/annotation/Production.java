package com.fayne.demo.spring.framework.environment.profile.annotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 15:42
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Profile("production")
public @interface Production {

}
