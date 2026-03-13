package com.example.uber.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.uber.model.EstadoVehiculo;
import com.example.uber.model.TipoVehiculo;
import com.example.uber.model.Vehiculo;

public class VehiculoRepository {

    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public VehiculoRepository() {
        //agregar vehiculo
        Vehiculo vehiculoUno = new  Vehiculo(1,"toyota","swim","azul",1, TipoVehiculo.Auto, EstadoVehiculo.Ocupado );
        Vehiculo vehiculoDos = new  Vehiculo(2,"Chevrolet","4x4","rojo",1, TipoVehiculo.Auto, EstadoVehiculo.Disponible );
        listaVehiculos.add(vehiculoUno);
        listaVehiculos.add(vehiculoDos);
    }

    public List<Vehiculo> obtenerVehiculos(){
        return listaVehiculos;
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
        return vehiculo;
    }

    public Vehiculo buscarPorId(long id){
        for(Vehiculo v : listaVehiculos){
            if(v.getIdVehiculo() == id){
                return v;
            }
        }
        return null;
    }
}
