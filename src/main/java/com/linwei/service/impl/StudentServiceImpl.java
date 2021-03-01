package com.linwei.service.impl;

import com.linwei.dao.StudentDao;
import com.linwei.domain.Student;
import com.linwei.service.StudentService;

import java.util.List;

/**
 * @date 2021/3/1 23:23
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    //set注入方式给属性赋值，所以需要添加set方法
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryAll() {
        List<Student> list = studentDao.selectAll();
        return list;
    }

    @Override
    public int addStudent(Student student) {
        int result = studentDao.insertStudent(student);
        return result;
    }
}
