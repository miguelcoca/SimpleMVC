package com.selftraining.springboot.MVCExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MVCSimpleController {

@RequestMapping(value = "/welcome")
@ResponseBody
public String Welcome(){
    return "Welcome to SpringMVC - Simple Controller Demo";
    }
}
