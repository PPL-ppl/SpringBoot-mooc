package com.mooc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mooc.demo.mapper") //如果我们不使用 @MapperScan 这个注解，
                    // 那么就需要在每个 Mapper 接口上加上 @Mapper，这样显然比较麻烦。
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
