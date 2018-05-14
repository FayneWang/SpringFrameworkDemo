package com.fayne.demo.spring.framework.validator;


import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("validator")
public class ValidatorController {



    @PostMapping("/persion")
    public PersonInfo getPersion(@RequestBody @PersonInfoContraint PersonInfo personInfo, BindingResult result){
        return null;
    }
}
