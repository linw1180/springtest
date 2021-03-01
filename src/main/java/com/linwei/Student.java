package com.linwei;

/**
 * @date 2021/3/1 0:32
 */
public class Student {

    private String name;
    private int age;
    private School school;

    public Student() {
        // System.out.println("Student的无参构造执行！");
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }



    public void setName(String name) {
        // System.out.println("setName() ==============" + name);
        this.name = name;
    }

    public void setAge(int age) {
        // System.out.println("setAge() ==============" + age);
        this.age = age;
    }

    public void setEmail(String email){
        System.out.println("------" + email);
    }

    public void setSchool(School school) {

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
