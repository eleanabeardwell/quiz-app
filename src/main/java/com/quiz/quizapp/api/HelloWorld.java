package com.quiz.quizapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/HelloWorld")

public class HelloWorld {
    @GetMapping
    public String getHelloWorld(){
        return "Hello World";
    }
    @GetMapping("/{name}/{surname}")
    public String getHelloName(@PathVariable String name, @PathVariable String surname){
        return "Hello " + name + surname;
    }
}
