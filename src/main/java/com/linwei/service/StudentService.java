package com.linwei.service;

import com.linwei.domain.Student;

import java.util.List;

/**
 * @date 2021/3/1 23:21
 */
public interface StudentService {

    List<Student> queryAll();

    int addStudent(Student student);
}
