package com.linwei;

import com.linwei.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2021/3/1 19:20
 */
public class MyTest {

    @Test
    public void test01(){

        //获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取目标类的代理对象
        SomeService proxy = (SomeService) ac.getBean("someService");

        proxy.doSome("jack", 23);
    }

    @Test
    public void test02(){

        //获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取目标类的代理对象
        SomeService proxy = (SomeService) ac.getBean("someService");

        Integer i = proxy.doFirst(10, 20);
        System.out.println(i);
    }

    @Test
    public void test03(){

        //获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取目标类的代理对象
        SomeService proxy = (SomeService) ac.getBean("someService");
        // System.out.println(proxy.getClass().getName());

        String i = proxy.doLast("jj", 33);
        System.out.println(i);
    }
}
