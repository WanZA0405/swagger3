package com.example.swagger2021.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Created on 2021/8/17 16:46;
 *
 * @author Wan a
 */

@ApiModel
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @ApiModelProperty(value = "学生编号")
    private Long sid;
    @ApiModelProperty(value = "学生姓名")
    private String name;
    @ApiModelProperty(value = "学生性别")
    private Character sex;
    @ApiModelProperty(value = "出生日期")
    private Date birthday;
    @ApiModelProperty(value = "学生年龄")
    private Integer age;
    @ApiModelProperty(value = "学生介绍")
    private String info;
}
