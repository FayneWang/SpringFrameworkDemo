package com.fayne.demo.spring.framework.validator;

import org.springframework.format.annotation.NumberFormat;

import com.fayne.demo.javax.validation.Person;
import javax.validation.constraints.NotNull;

public class EmployeeInfo {

    private Person person;

    double salary;

    @NumberFormat(pattern = "#.##")
    public double getSalary() {
        return salary;
    }

    public void setSalary( double salary) {
        this.salary = salary;
    }


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
