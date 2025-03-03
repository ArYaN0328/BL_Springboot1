package com.aryan123.practice_demo;

import com.aryan123.practice_demo.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController4 {

    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
