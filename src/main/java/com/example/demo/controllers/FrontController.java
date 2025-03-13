package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FrontController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/endpoint1")
    public List<Usuario> endpoint1() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/endpoint2")
    public Map<String, String> endpoint2() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Respuesta del endpoint 2");
        return response;
    }
}