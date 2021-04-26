package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping(value="/hello")
   public String hello() {

       System.out.println("Environment Variables");
       Map<String, String> enviorntmentVars  = System.getenv();
       String test = enviorntmentVars.get("hello");
       System.out.println(test);
       return test;
   }
   
}
