package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kai
 * @date 2022/10/25 15:32
 */
@RestController
@RequestMapping("test")
public class HelloController {
    @GetMapping("/a")
    public String test(){
        return "你好世界！";
    }
}
