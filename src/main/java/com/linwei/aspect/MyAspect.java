package com.linwei.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @date 2021/3/1 17:18
 */
@Aspect
public class MyAspect {

    //最完整的切入点表达式 execution(访问权限 返回值 方法声明(参数) 异常类型)
    //其中返回值和方法声明(参数) 这两部分必须有！
    @Before("execution(void com.linwei.service.impl.SomeServiceImpl.doSome(String, Integer))")
    public void aspect01() {

        System.out.println("1前置通知功能增强--------");
    }

    @Before("execution(* com.linwei.service.impl.SomeServiceImpl.doSome(String, Integer))")
    public void aspect02() {

        System.out.println("2前置通知功能增强--------");
    }

    @Before("execution(* *..SomeServiceImpl.doSome(String, Integer))")
    public void aspect03() {

        System.out.println("3前置通知功能增强--------");
    }

    @Before("execution(* *..doSome(String, Integer))")
    public void aspect04() {

        System.out.println("4前置通知功能增强--------");
    }

    @Before("execution(* *..do*(String, Integer))")
    public void aspect05() {

        System.out.println("5前置通知功能增强--------");
    }

    @Before("execution(* *..do*(..))") // 参数类型写的话一定不能写掉了
    public void aspect06() {

        System.out.println("6前置通知功能增强--------");
    }
}
