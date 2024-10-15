package com.kasun97.springboot_tutorial;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class MyFirstClass {

    private String comment;

    public MyFirstClass(String comment) {
        this.comment = comment;
    }

    public String sayHello(){
        return "first comment ==>"+this.comment;
    }
}
