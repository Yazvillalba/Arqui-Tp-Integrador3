package com.arqintegrador3.integrador3.Controller;



import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Estudiante;
import com.arqintegrador3.integrador3.Services.Interfaces.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("")
    public List<EstudianteDTO> getEstudiantes(){
        return estudianteService.findAllEstudiantes();
    }
    @PostMapping("/agregar/{estudiante}")
    public void agregarEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.addEstudiante(estudiante);
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
    public void eliminarEstudiante(@PathVariable int id){
        estudianteService.deleteEstudiante(id);
    }
}
