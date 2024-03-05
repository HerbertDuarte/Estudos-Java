package com.calc.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MathController {
 

 @RequestMapping("/hello")
 public String requestMethodName() {
     return "Hello world";
 }
}
