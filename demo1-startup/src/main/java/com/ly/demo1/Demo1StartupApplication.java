package com.ly.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.ly.demo1.dal.dao")
public class Demo1StartupApplication {

    @Resource
    private Environment evn;


    public static void main(String[] args) {
        SpringApplication.run(Demo1StartupApplication.class, args);
    }

}
