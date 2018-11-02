package com.jerry.sso.client2;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.jerry.sso"})
@EnableCasClient // 开启CAS支持
@SpringBootApplication
public class Client2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}

}
