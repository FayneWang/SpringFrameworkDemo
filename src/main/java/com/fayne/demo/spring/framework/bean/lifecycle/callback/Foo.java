package com.fayne.demo.spring.framework.bean.lifecycle.callback;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 10:45
 */
public class Foo {

    // 调用 applicationContext.removeBeanDefinition("foo") 来验证调用。
    public void cleanup(){
        System.out.print(this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath()+"Foo.cleanup()");
    }

}
