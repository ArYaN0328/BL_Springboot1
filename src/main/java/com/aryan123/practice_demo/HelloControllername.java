package com.aryan123.practice_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")

public class HelloControllername {

    @GetMapping("/control/{name}")
    public String sayHello(@PathVariable String name)
    {
        return "hello"+name+" from BridgeLabz";
    }


}
