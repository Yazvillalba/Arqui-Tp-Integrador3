package com.arqintegrador3.integrador3.Controller;



import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Estudiante;
import com.arqintegrador3.integrador3.Services.Interfaces.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("")
    public List<EstudianteDTO> getEstudiantes(){
        return estudianteService.findAllEstudiantes();
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<?> agregarEstudiante(@RequestBody Estudiante estudiante){
        Map<String, Object> response = new HashMap<>();        
        estudianteService.addEstudiante(estudiante);

        response.put("mensaje", "Estudiante creado con éxito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{dni}")
    public EstudianteDTO getEstudiantesByDni(@PathVariable int dni){
        return estudianteService.findEstudianteByDni(dni);
    }

    @GetMapping("/nroLibreta/{nroLibreta}")
    public EstudianteDTO getEstudiantesByNroLibreta(@PathVariable int nroLibreta){
        return estudianteService.findEstudianteByNroLibreta(nroLibreta);
    }

    @GetMapping("/genero/{genero}")
    public List<EstudianteDTO> getEstudiantesByNroLibreta(@PathVariable String genero){
        return estudianteService.findEstudianteByGenero(genero);
    }

    @GetMapping("/carreraycuidad/{nombre}/{ciudad}")
    public List<EstudianteDTO> getEstudiantesByCarreraAndCiudad(@PathVariable String nombre, @PathVariable String ciudad){
        return estudianteService.findEstudiantesByCarreraAndCiudad(nombre,ciudad);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarEstudiante(@PathVariable int id){

        Map<String, Object> response = new HashMap<>();
        estudianteService.deleteEstudiante(id);

        response.put("mensaje", "Estudiante eliminado con éxito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
