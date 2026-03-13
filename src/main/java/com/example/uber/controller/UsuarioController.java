package com.example.uber.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.uber.model.Usuario;
import com.example.uber.services.ServicesUsuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private ServicesUsuario usuarioService = new ServicesUsuario();

    public UsuarioController(ServicesUsuario usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.guardarUsuario(usuario);
        return ResponseEntity.status(201).body(nuevoUsuario);
    }

}