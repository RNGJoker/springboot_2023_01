package org.java.service;

import org.java.entity.Student;

import java.util.List;

/**
 * @author: Joker
 * @createTime: 2023-02-03 13:56
 */
public interface StudentService {
    /**
     * 查询所有学生数据
     *
     * @return List集合
     */
    public List<Student> findAll();

    /**
     * 添加新的学生信息
     *
     * @param student 学生
     */
    public void addStudent(Student student);
}
