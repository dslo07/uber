package com.example.uber.model;

public class Usuario {
    private  long idUsuario;
    private  String nombreUsuario;
    private  String correoUsuario;
    private  String passUsuario;

    public Usuario(long idUsuario, String nombreUsuario, String correoUsuario, String passUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.passUsuario = passUsuario;
    }
    //getters
    public long getIdUsuario() {
        return idUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getCorreoUsuario() {
        return correoUsuario;
    }
    public String getPassUsuario() {
        return passUsuario;
    }
    //setters

    public  void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public  void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public  void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public  void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }
}
