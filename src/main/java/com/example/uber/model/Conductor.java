package com.example.uber.model;
import com.example.uber.model.EstadoActivo;

public class Conductor {
    private long idConductor;
    private String nombre;
    private String apellido;
    private int numLicencia;
    private EstadoActivo estadoLicencia;

    public Conductor(long idConductor, String nombre, String apellido, int numLicencia, EstadoActivo estadoLicencia) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLicencia = numLicencia;
        this.estadoLicencia = estadoLicencia;
    }
    //getters
    public long getIdConductor() {
        return this.idConductor;
    }

    public String getNombre() {
        return  this.nombre;
    }

    public String getApellido() {
        return  this.apellido;
    }

    public int getNumLicencia() {
        return this.numLicencia;
    }
    public EstadoActivo getEstadoLicencia() {
        return this.estadoLicencia;
    }

    //setters
    public void setNumLicencia(int numLicencia) {
        this.numLicencia = this.numLicencia;
    }

    public void  setEstadoLicencia(EstadoActivo estadoLicencia) {
        this.estadoLicencia = this.estadoLicencia;
    }

    public void setIdConductor(long idConductor) {
        this.idConductor = idConductor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
