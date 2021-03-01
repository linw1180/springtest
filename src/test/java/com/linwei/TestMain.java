package com.linwei;

import com.linwei.ba01.Student;
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

        //从容器获取对象
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);

    }
}
