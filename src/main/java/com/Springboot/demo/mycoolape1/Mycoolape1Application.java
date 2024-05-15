package com.Springboot.demo.mycoolape1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Mycoolape1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mycoolape1Application.class, args);
		System.out.println("hello Spring.");
	}

}
