package com.spring.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
//@RestController
public class RestApp {
    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring";
    }
    * 
    * */
    public static void main (String[] args) {
        SpringApplication.run(RestApp.class, args);
    }
}