package top.mengtech.springbootblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping
    public String hello(){
        return "Hello Spring boot";
    }
}
