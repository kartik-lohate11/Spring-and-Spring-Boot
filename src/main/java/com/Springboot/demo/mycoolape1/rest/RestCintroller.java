package com.Springboot.demo.mycoolape1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCintroller {
    @GetMapping("/")
        public String hello(){
        return "Hello Rest Con.uuu.";
        }

        @GetMapping("/hello")
    public String name(){
        return "kartik Lohate";
        }
}
