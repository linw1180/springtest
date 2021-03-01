package com.linwei.dao;

import com.linwei.domain.Student;

import java.util.List;

/**
 * @date 2021/3/1 23:14
 */
public interface StudentDao {

    List<Student> selectAll();

    int insertStudent(Student student);
}
