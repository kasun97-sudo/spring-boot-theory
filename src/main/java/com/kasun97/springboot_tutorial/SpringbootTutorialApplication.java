package com.kasun97.springboot_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// 1:43
@SpringBootApplication
public class SpringbootTutorialApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringbootTutorialApplication.class, args);

//		MyFirstClass myFirstClass = context.getBean(MyFirstClass.class);
//		System.out.print(myFirstClass.sayHello());

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
	}
}
