package com.linwei.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @date 2021/3/1 20:15
 */
@Aspect
@Component("myAspect")
public class MyAspect {

    //前置通知
    @Before("execution(* *..impl.SomeServiceImpl.doSome(..))")
    public void myBefore(JoinPoint jp) {

        System.out.println("前置通知------------");
        System.out.println("可获取方法相关信息：" + jp.getSignature());

    }

    //后置通知
    @AfterReturning(value = "execution(* *..Some*.doFirst(..))", returning = "res")
    public void myAfterReturning(JoinPoint jp, Object res) {
        System.out.println(jp.toString() + "处理中----");
        System.out.println("后置通知" + res);
    }


    //环绕通知
    @Around("execution(* *..impl.Some*.doLast(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前-----");
        Object res = pjp.proceed();
        System.out.println("后-----");
        res = "modify";
        return res;
    }


}
