package com.arqintegrador3.integrador3.Services.Interfaces;


import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
import com.arqintegrador3.integrador3.DTO.MatriculacionDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Matricula;

import java.util.List;

public interface MatriculaService {

    List<MatriculaDTO> findAllMatriculas();

    void addMatricula(MatriculacionDTO matricula);
}
