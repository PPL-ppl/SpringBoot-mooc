package com.mooc.demo.Entity;

import lombok.Data;

//返回实体类型
@Data
public class Result<T> {

    //错误码
    private Integer code;
    //提示信息
    private String message;
    //返回对象
    private T data;


}
