package com.kasun97.springboot_tutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    // primary can added
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("this is the first bean");
    }

    @Bean
    @Qualifier("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("this is the second bean");
    }
}
