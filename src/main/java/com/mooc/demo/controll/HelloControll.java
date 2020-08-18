package com.mooc.demo.controll;

import com.mooc.demo.Entity.Student;
import com.mooc.demo.Enums.ResultEnum;
import com.mooc.demo.Utils.ResultUtil;
import com.mooc.demo.exception.StudentException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//entity 接口实现（SP DATA JPA ,MYBATIS,REDIS）  service  control(导入service)

@Api
@RestController
public class HelloControll {

    @ApiOperation("Hello Spring Boot 方法")
    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/get/{age}")
    public void GetAge(@PathVariable("age") Integer age) {
        //if这些代码在service层的
        if (age < 10) {
            throw new StudentException(ResultEnum.LESS_ERROR);
        } else {
            Student student = new Student();
            student.setId("2");
            student.setName("3");
            student.setAge(4);
            System.out.println(ResultUtil.success(student));
        }
    }
}
