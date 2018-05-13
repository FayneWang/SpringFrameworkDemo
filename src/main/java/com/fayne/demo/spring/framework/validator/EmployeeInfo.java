package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class EmployeeInfo {

    @PersonInfoContraint
    private PersonInfo personInfo;


    @NotNull
    private String duty;


    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
