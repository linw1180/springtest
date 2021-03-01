package com.linwei;

import com.linwei.domain.Student;
import com.linwei.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @date 2021/3/1 23:40
 */
public class MyTest {

    @Test
    public void test1() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService service = (StudentService) ac.getBean("studentService");

        /*List<Student> list = service.queryAll();
        for (Student stu : list) {
            System.out.println(stu);
        }*/
        Student stu = new Student(1010, "lw", "lw@qq.com", 24);
        int result = service.addStudent(stu);
        System.out.println("==============>" + result);
    }
}
