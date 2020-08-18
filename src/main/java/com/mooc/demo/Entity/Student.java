package com.mooc.demo.Entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    String id;
    String name;
    Integer age;
}
