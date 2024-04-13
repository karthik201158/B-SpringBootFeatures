package com.annotations.Annotations.autowired;

import com.annotations.Annotations.autowired.fields.usecase1.MyServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AutowiredApplication {


	public static void main(String[] args) {
		SpringApplication.run(AutowiredApplication.class, args);
		MyServiceImpl myService = new MyServiceImpl();
		myService.convertDTO1ToDTO2();

	}

}
