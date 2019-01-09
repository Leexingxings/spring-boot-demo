package com.jason.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 *
 * @author jason
 */
@SpringBootApplication()
@MapperScan("com.jason.demo.mapper")
@ComponentScan(basePackages = {
        "com.jason.demo.config",
        "com.jason.demo.controller",
        "com.jason.demo.service"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
