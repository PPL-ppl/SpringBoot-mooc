package com.mooc.demo.controll;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class FirstControl {

    @ApiOperation("Hello Spring Boot 方法")
    @GetMapping("/hello1")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
