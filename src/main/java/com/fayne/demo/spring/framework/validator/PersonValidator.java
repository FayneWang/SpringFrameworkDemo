//package com.fayne.demo.spring.framework.validator;
//
//
//import javax.validation.Validator;
//
//public class PersonValidator implements Validator {
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return Person.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
//        Person p = (Person) target;
//        if (p.getAge() < 0){
//            errors.rejectValue("age","age is not negative!");
//        }else if (p.getAge() > 160){
//            errors.rejectValue("age","man is too old!");
//        }
//    }
//}
