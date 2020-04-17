package net.idt.learning.dockerapp.controller;

import net.idt.learning.dockerapp.constraint.UpperCaseName;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Docker!!!";
    }

    @GetMapping("/hi")
    public String sayPersonalizedHello(@UpperCaseName @RequestParam(defaultValue = "Anonymous") String name) {
        return "I'm glad to see you, " + name + "!";
    }

}
