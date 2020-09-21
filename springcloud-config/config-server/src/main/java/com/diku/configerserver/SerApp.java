package com.diku.configerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author duanxu
 * @create 2020/9/21
 */
@SpringBootApplication
@EnableConfigServer
public class SerApp {
    public static void main(String[] args) {
        SpringApplication.run(SerApp.class,args);
    }
}
