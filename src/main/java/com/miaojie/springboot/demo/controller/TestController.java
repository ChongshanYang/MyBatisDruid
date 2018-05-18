package com.miaojie.springboot.demo.controller;

import com.miaojie.springboot.demo.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: miaojie
 * @date: 2018/05/17 17:31
 */
@RestController
public class TestController {

    @Log("执行方法一")
    @GetMapping("/one")
    public String methodOne(String name) {
        System.out.println("11111");
        return "index";
    }

    @Log("执行方法二")
    @GetMapping("/two")
    public void methodTwo() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Log("执行方法三")
    @GetMapping("/three")
    public void methodThree(String name, String age) {

    }
}
