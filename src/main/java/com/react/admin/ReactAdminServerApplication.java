package com.react.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.react.admin.mapper")
public class ReactAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactAdminServerApplication.class, args);
    }

}
