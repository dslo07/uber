package com.example.uber.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.uber.model.EstadoVehiculo;
import com.example.uber.model.TipoVehiculo;
import com.example.uber.model.Usuario;
import com.example.uber.model.Vehiculo;

public class UsuarioRepository {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    public UsuarioRepository(){
        Usuario userUno = new Usuario(1,"Santiago Lopez","SantiagoLopez@duocuc.cl","qwerty777");
        Usuario userDos = new Usuario(2,"Santiago Lopez","ClaudioCastillo@duocuc.cl","qwerty777");
        listaUsuarios.add(userUno);
        listaUsuarios.add(userDos);
    }



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