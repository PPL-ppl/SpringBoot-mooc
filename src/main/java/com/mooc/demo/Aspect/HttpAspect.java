package com.mooc.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

//拦截http请求
@Aspect
@Component
public class HttpAspect {
    public final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.mooc.demo.controll.UserControl.*(..))") //可以是某个方法
    public void log() {
    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //url
        request.getRequestURL();
        //method
        request.getMethod();
        //ip
        request.getRemoteAddr();
        //类方法
        joinPoint.getSignature().getDeclaringTypeName();//类名
        joinPoint.getSignature().getName();//方法名
        //参数
        joinPoint.getArgs();

        logger.info("111");
    }

    @After("log()")
    public void doAfter() {
        logger.info("111");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doA(Object object) {
        logger.info("response={}", object);
        //afterReturning(最终返回结果),afterThrowing(异常),around(环绕)
    }

}
