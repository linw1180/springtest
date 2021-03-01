package com.linwei;

import com.linwei.handler.MyInvocationHandler;
import com.linwei.service.SomeService;
import com.linwei.service.impl.SomeServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @date 2021/2/28 23:56
 */
public class TestMain {

    @Test
    public void test01(){

        //目标对象
        SomeService target = new SomeServiceImpl();
        //InvocationHandler接口实现类
        InvocationHandler handler = new MyInvocationHandler(target);
        //动态代理方式获取代理对象
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);

        //使用代理对象调用方法，实现功能增强
        proxy.doSome();
        // proxy.doOther();
    }
}
