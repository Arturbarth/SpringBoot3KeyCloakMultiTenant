package com.arturbarth.springboot3keycloakmultitenant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "Você está autenticado!";
    }


}