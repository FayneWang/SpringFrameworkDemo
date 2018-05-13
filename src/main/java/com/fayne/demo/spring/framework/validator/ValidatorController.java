package com.fayne.demo.spring.framework.validator;

import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validator")
public class ValidatorController {

    @GetMapping("/persion")
    public PersonInfo getPersion(@PersonInfoContraint PersonInfo personInfo){
        return personInfo;
    }
}
