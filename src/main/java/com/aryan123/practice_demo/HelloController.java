package com.aryan123.practice_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {

   @GetMapping("/query")
    public String sayhello(@RequestParam String name)
   {
       return "Hello," +name+" from Bridgelabz";
   }

}
