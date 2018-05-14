package com.fayne.demo.spring.framework.validator;


import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonInfo {

    @NotNull(message = "姓名不能为空")
    private String name;

    @Min(value = 1,message = "年龄最大小能小于1")
    @Max(value=100,message = "年瞈最大不能超过100")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
