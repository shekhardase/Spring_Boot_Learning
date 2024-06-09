package com.Shekhar.MyFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("/lol")
    public String sayHello() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Hello Page</title>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; background-color: #ececec; text-align: center; padding: 50px; }" +
                "h1 { color: #333; }" +
                "p { color: #666; }" +
                ".container { background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<h1>Hello, World!</h1>" +
                "<p>Welcome to my first Spring Boot web application.</p>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}
