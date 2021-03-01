package com.linwei.ba01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @date 2021/3/1 11:28
 */

@Component("myStudent")
// @Component
public class Student {

    @Value("lisi")
    private String name;

    @Value("24")
    private int age;

    @Autowired
    @Qualifier("mySchool")
    private School school;

    public Student() {
        System.out.println("=====无参构造");
    }

    public Student(String name, int age, School school) {
        System.out.println("=====有参构造");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
