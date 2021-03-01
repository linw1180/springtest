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

        MyUtil.doLog();

        //执行目标对象方法
        Object res = method.invoke(target, args);

        MyUtil.doTransaction();

        return res;
    }
}
