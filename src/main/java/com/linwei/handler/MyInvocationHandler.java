package com.linwei.handler;

import com.linwei.util.MyUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @date 2021/3/1 15:11
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //获取目标对象执行的方法名
        String methodName = method.getName();

        //处理逻辑：
        // 如果调用的是doSome()----》执行前增加日志功能
        // 如果调用的是doOther()----》执行后增加事务功能
        Object res = null;
        if ("doSome".equals(methodName)) {
            MyUtil.doLog(); //执行前增加日志功能
            res = method.invoke(target, args); //执行目标对象方法
        }else{
            res = method.invoke(target, args); //执行目标对象方法
            MyUtil.doTransaction(); //执行后增加事务功能
        }
        return res;
    }
}
