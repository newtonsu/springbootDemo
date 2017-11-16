package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		//项目入口
		SpringApplication.run(DemoApplication.class, args);
	}
}
