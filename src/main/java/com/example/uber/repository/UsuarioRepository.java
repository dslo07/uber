package com.example.uber.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.uber.model.Usuario;

public class UsuarioRepository {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    public List<Usuario> obtenerUsuarios(){
        return listaUsuarios;
    }

    public Usuario guardarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        return usuario;
    }

    public Usuario buscarPorId(long id){
        for(Usuario user : listaUsuarios){
            if(user.getIdUsuario() == id){
                return user;
            }
        }
        return null;
    }
}