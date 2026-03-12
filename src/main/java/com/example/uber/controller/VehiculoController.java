package com.example.uber.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.uber.model.Vehiculo;
import com.example.uber.services.ServicesVehiculo;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    private ServicesVehiculo vehiculoService = new ServicesVehiculo();

    @GetMapping
    public List<Vehiculo> listarVehiculos(){
        return vehiculoService.obtenerVehiculos();
    }

    @PostMapping
    public ResponseEntity<Vehiculo> crearVehiculo(@RequestBody Vehiculo vehiculo){
        Vehiculo nuevoVehiculo = vehiculoService.guardarVehiculo(vehiculo);
        return ResponseEntity.status(201).body(nuevoVehiculo);
    }
}
