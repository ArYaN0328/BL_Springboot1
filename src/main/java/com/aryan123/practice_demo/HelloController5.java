package com.aryan123.practice_demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController5 {

    @PutMapping("/param/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello"+firstName+" "+lastName+" from Bridgelabz";
    }

}
