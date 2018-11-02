package com.jerry.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/2 16:49
 */
@ComponentScan(basePackages={"com.jerry.sso"})
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
