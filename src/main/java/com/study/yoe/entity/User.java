package com.study.yoe.entity;/*
 *   created by why on 2020/3/23
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import java.util.Date;

@Data
//自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法
public class User {
    Integer id;
    @Email(message = "邮箱格式不正确")     //使用数据校验
    String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    Date createdtime;
}
