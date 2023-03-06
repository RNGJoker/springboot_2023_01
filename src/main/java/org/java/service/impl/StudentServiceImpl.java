package org.java.service.impl;

import org.java.dao.StudentMapper;
import org.java.entity.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Joker
 * @createTime: 2023-02-03 13:56
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Transactional
    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
        //int a = 2 / 0;
    }
}
