package com.example.uber.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.uber.model.Vehiculo;
import com.example.uber.repository.VehiculoRepository;

@Service
public class ServicesVehiculo {

    private VehiculoRepository vehiculoRepository = new VehiculoRepository();

    public List<Vehiculo> obtenerVehiculos(){
        return vehiculoRepository.obtenerVehiculos();
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo){
        return vehiculoRepository.guardarVehiculo(vehiculo);
    }

    public Vehiculo buscarVehiculo(long id){
        return vehiculoRepository.buscarPorId(id);
    }
}
