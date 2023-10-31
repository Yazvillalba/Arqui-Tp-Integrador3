package com.arqintegrador3.integrador3.Controller;


import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carreras")

public class CarreraController {
    @Autowired
    CarreraService carreraService;

    @GetMapping("")
    public List<CarreraDTO> getCarreras(){

        return carreraService.findAllCarreras();
    }

    @GetMapping("/{id}")
    public Carrera carreraPorId(@PathVariable int id){
        return carreraService.findCarreraById(id);
    }
    @PostMapping("/agregar/{carrera}")
    public void agregarCarrera(@RequestBody Carrera carrera){
        carreraService.addCarrera(carrera);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCarrera(@PathVariable int id){
        carreraService.deleteCarrera(id);
    }
}
