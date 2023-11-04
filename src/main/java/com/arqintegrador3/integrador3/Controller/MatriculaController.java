package com.arqintegrador3.integrador3.Controller;


import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
import com.arqintegrador3.integrador3.DTO.MatriculacionDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Matricula;
import com.arqintegrador3.integrador3.Services.Interfaces.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    MatriculaService matriculaService;

    @GetMapping("")
    public List<MatriculaDTO> getMatriculas(){
        return matriculaService.findAllMatriculas();
    }

    @GetMapping("/matricular/")
    public ResponseEntity<?> agregarMatricula(@RequestBody MatriculacionDTO matricula){
        Map<String, Object> response = new HashMap<>();
        matriculaService.addMatricula(matricula);

        response.put("mensaje", "Matricula creada con éxito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

}
