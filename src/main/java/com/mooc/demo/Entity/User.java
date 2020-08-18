package com.mooc.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Data
@Entity
//@Table(name ="t_user")//自定义表名
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    @Min(value = 18,message = "未满十八岁")
    private Integer age;

}
