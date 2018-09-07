package com.fayne.demo.javax.validation;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("validation")
public class ValidationController {

    // 必须使用 @Valid， Person中的约束注解才起作用。
    @PostMapping("/persion")
    public Person getPersion(@Valid @RequestBody Person person){
        return null;
    }
}
