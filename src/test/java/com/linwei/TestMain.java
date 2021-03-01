package com.linwei;

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

        //从容器中获取student对象
        Student student = (Student) ac.getBean("student");
        System.out.println(student);

    }
}
