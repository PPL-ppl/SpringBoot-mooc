package com.mooc.demo.exception;


import com.mooc.demo.Enums.ResultEnum;

//自定义异常
public class StudentException extends RuntimeException {
    private Integer code;

    public StudentException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
