package org.java.web;

import lombok.extern.slf4j.Slf4j;
import org.java.entity.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Joker
 * @createTime: 2023-02-03 14:09
 */
@Slf4j
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 查询所有学生信息
     *
     * @return List集合
     */
    @GetMapping("/findAll")
    @ResponseBody
    public List<Student> findAll() {
        List<Student> studentList = studentService.findAll();
        for (Student student : studentList) {
            log.info(student.getStuName() + "\t" + student.getStuBirth());
        }
        return studentService.findAll();
    }

    @GetMapping("/addStudent")
    public String addStudent() {
        Student student = new Student(null, "萨科", "男", "2001-05-31", "S3", 59);
        studentService.addStudent(student);
        return "redirect:/findAll";
    }
}
