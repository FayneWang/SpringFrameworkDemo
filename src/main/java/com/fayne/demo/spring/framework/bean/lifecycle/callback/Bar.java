package com.fayne.demo.spring.framework.bean.lifecycle.callback;

/**
 * @Author: Fayne.Wang
 * @Date 2018/5/2 10:45
 */
public class Bar {

    public void init(){
        System.out.print(this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath()+"Bar.init()");
    }

}
