package com.queroserdev.meuprimeiroprojeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @RequestMapping("/")
    public String teste(){
        return "Olá mundo!";
    }
}
