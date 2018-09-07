package com.fayne.demo.spring.framework.validator;


import org.springframework.web.bind.annotation.*;

import com.fayne.demo.javax.validation.Person;

@RestController
@RequestMapping("validator")
public class ValidatorController {

    @PostMapping("/employee")
    public void getEmployee(@RequestBody EmployeeInfo employeeInfo){

    }

    // 必须使用 @Valid， Person中的约束注解才起作用。
    @PostMapping("/persion")
    public Person getPersion(@RequestBody Person person){
        return null;
    }
}
