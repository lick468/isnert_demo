package com.nenu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nenu.dao")
public class InsertDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertDemoApplication.class, args);
	}

}

