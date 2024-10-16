package com.kasun97.springboot_tutorial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/hello")
    public String sayHello(){
        return "hello from my first controller";
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "request accepted and message is "+message;
    }

    @PostMapping("/post-order")
    public String post(
            @RequestBody Order order
    ){
        return "request accepted and order is "+order.toString();
    }

    @PostMapping("/post-order-record")
    public String postRecord(
            @RequestBody OrderRecord order
    ){
        return "request accepted and order is "+order.toString();
    }
}
