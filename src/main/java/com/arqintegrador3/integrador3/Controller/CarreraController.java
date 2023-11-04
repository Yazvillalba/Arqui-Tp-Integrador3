package com.arqintegrador3.integrador3.Controller;


import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
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
    public CarreraDTO carreraPorId(@PathVariable int id){
        return carreraService.findCarreraById(id);
    }
    @PostMapping("/agregar")
    public void agregarCarrera(@RequestBody Carrera carrera){
        carreraService.addCarrera(carrera);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCarrera(@PathVariable int id){
        carreraService.deleteCarrera(id);
    }

    @GetMapping("/porcantInscriptos")
    public List<CarreraConInscriptosDTO> obtenerPorCantInscriptos() {
       return carreraService.obtenerPorCantInscriptos();
    }

   // @GetMapping("/reporteCarrera")
   // public List<ReporteDTO> generarReporteCarreras() {
     //   return carreraService.generarReporteCarreras();
    //}
}
