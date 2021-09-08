package com.example.swagger2021.controller;

import com.example.swagger2021.model.Student;
import com.example.swagger2021.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2021/8/17 16:47;
 *
 * @author Wan a
 */

@Api(tags = "学生控制层")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @ApiOperation(httpMethod = "GET",value = "查询所有学生信息")
    @GetMapping("/list")
    public List<Student> list(){
        return studentService.listAll();
    }

    @ApiOperation(httpMethod = "GET",value = "根据学生编号查询学生信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "学生编号",required = true,paramType = "path",dataType = "Long")})
    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable Long id){
        return studentService.findById(id);
    }
}
