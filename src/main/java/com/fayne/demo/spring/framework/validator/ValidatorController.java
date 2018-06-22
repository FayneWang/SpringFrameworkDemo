package com.fayne.demo.spring.framework.validator;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("validator")
public class ValidatorController {

    @PostMapping("/persion")
    public void getPersion(@Valid @RequestBody Person person){

    }
}
