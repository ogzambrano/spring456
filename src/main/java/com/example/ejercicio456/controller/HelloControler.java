package com.example.ejercicio456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!!";
    }
}
