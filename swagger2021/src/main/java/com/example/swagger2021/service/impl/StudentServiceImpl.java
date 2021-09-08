package com.example.swagger2021.service.impl;

import com.example.swagger2021.model.Student;
import com.example.swagger2021.service.StudentService;
import com.sun.deploy.net.MessageHeader;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2021/8/17 16:47;
 *
 * @author Wan a
 */
@Service
public class StudentServiceImpl implements StudentService {
    static List<Student> list = new ArrayList<Student>();

    static {
        Student student1 = new Student(152265L, "张三", '男', new Date(), 18, "我叫张三来自湖南");
        Student student2 = new Student(152266L, "李四", '男', new Date(), 19, "我叫李四来自湖南");
        Student student3 = new Student(152267L, "安娜", '女', new Date(), 17, "我叫安娜来自浙江");
        Student student4 = new Student(152268L, "琪琪", '女', new Date(), 18, "我叫琪琪来自浙江");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

    }

    @Override
    public List<Student> listAll() {
        return list;
    }

    @Override
    public Student findById(Long sid) {
        for (Student student : list) {
            if (sid.equals(student.getSid())){
                return student;
            }
        }
        return null;
    }
}
