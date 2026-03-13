package com.example.uber.repository;
import java.util.ArrayList;
import java.util.List;
import com.example.uber.model.Conductor;

public class ConductorRepository {

    private List<Conductor> listaConductores = new ArrayList<>();

    public List<Conductor> obtenerConductores(){
        return listaConductores;
    }

    public Conductor guardarConductor(Conductor conductor){
        listaConductores.add(conductor);
        return conductor;
    }

    public Conductor buscarConductor(long id){
        for(Conductor c : listaConductores){
            if(c.getIdConductor() == id){
                return c;
            }
        }
        return null;
    }
}