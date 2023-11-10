package com.arqintegrador3.integrador3.Controller;
import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<?> agregarCarrera(@RequestBody Carrera carrera){
        Map<String, Object> response = new HashMap<>();
        carreraService.addCarrera(carrera);
        
        response.put("mensaje", "Carrera creada con éxito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarCarrera(@PathVariable int id){
        Map<String, Object> response = new HashMap<>();
        carreraService.deleteCarrera(id);

        response.put("mensaje", "Carrera eliminada con éxito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @GetMapping("/porcantInscriptos")
    public List<CarreraConInscriptosDTO> obtenerPorCantInscriptos() {
       return carreraService.obtenerPorCantInscriptos();
    }

    @GetMapping("/reporteCarrera")
    public List<ReporteDTO> generarReporteCarreras() {
       return carreraService.generarReporteCarreras();
    }
}
