package com.example.uber.model;

import com.example.uber.model.EstadoVehiculo;
import com.example.uber.model.TipoVehiculo;

public class Vehiculo {
    private long idVehiculo;
    private  long idUsuario;
    private String marca;
    private String modelo;
    private String color;
    private TipoVehiculo tipoVehiculo;
    private EstadoVehiculo estadoVehiculo;


    public Vehiculo () {}

    public Vehiculo (long idVehiculo, String marca, String modelo, String color, long idUsuario,TipoVehiculo tipoVehiculo,EstadoVehiculo estadoVehiculo) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.idUsuario = idUsuario;
        this.tipoVehiculo = tipoVehiculo;
        this.estadoVehiculo = estadoVehiculo;
    }
    //getters
    public long getIdVehiculo() {
        return idVehiculo;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public long getIdUsuario() {
        return idUsuario;
    }
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }
    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setIdVehiculo(long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

}
