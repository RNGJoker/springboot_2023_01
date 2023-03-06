package org.java.dao;

import org.java.entity.Student;

import java.util.List;

/**
 * @author: Joker
 * @createTime: 2023-02-03 13:53
 */
public interface StudentMapper {
    /**
     * 查询所有学生数据
     *
     * @return List集合
     */
    public List<Student> findAll();

    /**
     * 添加新的学生信息
     */
    public void addStudent(Student student);
}
