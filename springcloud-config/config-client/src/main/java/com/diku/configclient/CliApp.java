package com.diku.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author duanxu
 * @create 2020/9/21
 */
@SpringBootApplication
@RestController
public class CliApp {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @GetMapping("/hello")
    public String hello() {

        return "username: " +username+"------------> password: "+password;
    }


    public static void main(String[] args) {
        SpringApplication.run(CliApp.class,args);
    }
}
