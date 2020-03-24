package com.study.yoe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@MapperScan("com.study.yoe.mapper")
@SpringBootApplication
public class YoeApplication {
    //开始的地方
    public static void main(String[] args) {
        SpringApplication.run(YoeApplication.class, args);
    }

}
