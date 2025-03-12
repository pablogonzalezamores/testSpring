package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FrontController {

    @GetMapping("/endpoint1")
    public Map<String, String> endpoint1() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Respuesta del endpoint 1");
        return response;
    }

    @GetMapping("/endpoint2")
    public Map<String, String> endpoint2() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Respuesta del endpoint 2");
        return response;
    }
}