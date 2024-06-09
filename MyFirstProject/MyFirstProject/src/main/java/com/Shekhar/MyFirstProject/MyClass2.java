package com.Shekhar.MyFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass2 {

    @GetMapping("/awp")
    public String any() {
        return "Hello " + "This is second part of webpage";
    }

}
