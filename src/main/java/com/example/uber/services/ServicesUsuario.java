package com.example.uber.services;

import com.example.uber.model.Usuario;
import com.example.uber.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesUsuario {
    private UsuarioRepository UsuarioRepository = new UsuarioRepository();

    public List<Usuario> obtenerUsuarios(){
        return UsuarioRepository.obtenerUsuarios();
    }

    public Usuario guardarUsuario(Usuario usuario){
        return UsuarioRepository.guardarUsuario(usuario);
    }

    public Usuario buscarUsuario(long id){
        return UsuarioRepository.buscarPorId(id);
    }
}
