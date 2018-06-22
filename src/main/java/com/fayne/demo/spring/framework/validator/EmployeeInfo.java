package com.fayne.demo.spring.framework.validator;


import javax.validation.constraints.NotNull;

public class EmployeeInfo {

    private Person person;


    @NotNull
    private String duty;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
