package com.arqintegrador3.integrador3.Services.Interfaces;


import com.arqintegrador3.integrador3.DTO.MatriculaDTO;

import java.util.List;

public interface MatriculaService {

    List<MatriculaDTO> findAllMatriculas();

    void addMatricula(MatriculaDTO matricula) throws Exception;
}
