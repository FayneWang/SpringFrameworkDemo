package com.fayne.demo.spring.framework.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","学生姓名不能为空");
        Student student = (Student) target;
        if (student.getAge() < 7){

        }else if (student.getAge() > 12){

        }
    }
}
