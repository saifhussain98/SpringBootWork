package com.qa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldTestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "COYG";

    }
}