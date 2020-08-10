package com.mooc.demo.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "mooc") //不填写就是将类名小写成表名
public class MongoStudent {
    @Id
    private String id;
    @Field(value = "student_age")
    private Integer age;
    @Field(value = "student_name")
    private String name;
}
