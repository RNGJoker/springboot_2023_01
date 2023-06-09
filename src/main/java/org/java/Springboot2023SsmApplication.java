package org.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "org.java.dao")
@SpringBootApplication
public class Springboot2023SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2023SsmApplication.class, args);
    }

}
