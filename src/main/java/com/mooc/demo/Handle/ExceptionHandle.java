package com.mooc.demo.Handle;

import com.mooc.demo.Entity.Result;
import com.mooc.demo.Utils.ResultUtil;
import com.mooc.demo.exception.StudentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    //捕获异常
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof StudentException) {
            StudentException studentException = (StudentException) e;
            return ResultUtil.error(((StudentException) e).getCode(), e.getMessage());
        } else {
            logger.error("[系统异常]：", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
