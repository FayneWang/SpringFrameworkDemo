package com.fayne.demo.spring.framework.validator.annotation;

import com.fayne.demo.spring.framework.validator.PersonInfoValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=PersonInfoValidator.class)
public @interface PersonInfoContraint {
}
