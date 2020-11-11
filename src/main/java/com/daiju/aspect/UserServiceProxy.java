package com.daiju.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author WDY
 * @Date 2020-11-11 21:41
 * @Description TODO
 */
@Component
@Aspect
public class UserServiceProxy {

    @Pointcut(value = "execution(* com.daiju.aspect.UserService.add(..))")
    public void common(){}

    @Before(value = "common()")
    public void before(){
        System.out.println("前置通知");
    }
    @AfterReturning(value = "common()")
    public void after(){
        System.out.println("后置通知(返回通知)");
    }
    @After(value = "common()")
    public void finaly(){
        System.out.println("最终通知");
    }
    @AfterThrowing(value = "common()")
    public void exception(){
        System.out.println("异常通知");
    }
    @Around(value = "common()")
    public void aroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
