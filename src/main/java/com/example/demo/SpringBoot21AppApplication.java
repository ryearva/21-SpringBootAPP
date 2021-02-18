package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot21AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBoot21AppApplication.class, args);
		//changes for HIS-134 Task
		run.close();
	}

}
