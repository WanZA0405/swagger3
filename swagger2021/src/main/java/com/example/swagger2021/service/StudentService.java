package com.example.swagger2021.service;

import com.example.swagger2021.model.Student;

import java.util.List;

/**
 * Created on 2021/8/17 16:47;
 *
 * @author Wan a
 */
public interface StudentService {

    List<Student> listAll();

    Student findById(Long sid);
}
