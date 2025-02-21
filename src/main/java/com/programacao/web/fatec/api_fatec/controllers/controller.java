package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class controller {

    @GetMapping("{name}")
    public String HelloWorld(@PathVariable String name){
        return name;
    }
}
