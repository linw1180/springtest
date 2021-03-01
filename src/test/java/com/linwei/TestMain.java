package com.linwei;

import com.linwei.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2021/2/28 23:56
 */
public class TestMain {

    @Test
    public void test01(){

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从spring容器（Map）取目标对象（代理类对象）
        SomeService proxy = (SomeService) ac.getBean("someService");
        //通过代理类对象执行方法，实现功能增强
        proxy.doSome("test", 24);
    }
}
