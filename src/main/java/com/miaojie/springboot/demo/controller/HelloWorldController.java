package com.miaojie.springboot.demo.controller;

import com.miaojie.springboot.demo.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: miaojie
 * @date: 2018/05/17 22:55
 */
@RestController
public class HelloWorldController {

    @Log("Hello World!")
    @RequestMapping("/home")
    public String home() {
        return "Hello World!";
    }

}
