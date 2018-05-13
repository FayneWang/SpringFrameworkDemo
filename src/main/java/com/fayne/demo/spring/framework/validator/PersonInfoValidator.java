package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PersonInfoValidator implements ConstraintValidator<PersonInfoContraint,PersonInfo> {

    public void initialize(PersonInfoContraint constraintAnnotation) {


    }

    public boolean isValid(PersonInfo value, ConstraintValidatorContext context) {
        return false;
    }
}
