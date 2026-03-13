package com.example.uber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uber.model.Usuario;
import com.example.uber.repository.UsuarioRepository;

@Service
public class ServicesUsuario {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.obtenerUsuarios();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.guardarUsuario(usuario);
    }

}