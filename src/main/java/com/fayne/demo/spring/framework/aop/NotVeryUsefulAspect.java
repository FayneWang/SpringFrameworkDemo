package com.fayne.demo.spring.framework.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author: WangZezhou(301255)
 * @Date 2018/5/24 18:39
 */
@Aspect
public class NotVeryUsefulAspect {

    @Pointcut("")
    private void anyOldTransfer(){}
}
