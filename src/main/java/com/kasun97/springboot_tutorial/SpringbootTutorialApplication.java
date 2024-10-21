package com.kasun97.springboot_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// 5:34
@SpringBootApplication
public class SpringbootTutorialApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringbootTutorialApplication.class, args);

	}
}
