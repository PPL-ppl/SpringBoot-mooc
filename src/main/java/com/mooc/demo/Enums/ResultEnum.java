package com.mooc.demo.Enums;

public enum ResultEnum {
    UNKONW_ERROR(-1, "未知错误1"),
    LESS_ERROR(-2, "未知错误2"),
    LARGE_ERROR(-3, "未知错误3"),
    ;
    private Integer code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
