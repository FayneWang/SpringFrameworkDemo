package com.fayne.demo.spring.framework.validator;

// import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import com.fayne.demo.spring.framework.validator.annotation.PersonInfoContraint;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("validator")
public class ValidatorController {

    @PostMapping("/persion")
    public void getPersion(@PersonInfoContraint @RequestBody PersonInfo personInfo){

    }
}
