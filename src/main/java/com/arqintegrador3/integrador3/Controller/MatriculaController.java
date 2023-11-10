package com.arqintegrador3.integrador3.Controller;


import com.arqintegrador3.integrador3.DTO.MatriculaDTO;

import com.arqintegrador3.integrador3.Services.Interfaces.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/matricular")
    public ResponseEntity<?> agregarMatricula(@RequestBody MatriculaDTO matricula) throws Exception {
        Map<String, Object> response = new HashMap<>();
        this.matriculaService.addMatricula(matricula);
        response.put("mensaje", "Inscripcion exitosa");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
}
