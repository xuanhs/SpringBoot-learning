package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/aaa")
    public String index() {
        return "Hello World";
    }

}