package com.arqintegrador3.integrador3.Services.Interfaces;

import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
import com.arqintegrador3.integrador3.Model.Carrera;


import java.util.List;

public interface CarreraService {
    void addCarrera(Carrera carrera);

    Carrera findCarreraById(int idCarrera);

    List<CarreraDTO> findAllCarreras();

    List<CarreraConInscriptosDTO> obtenerPorCantInscriptos(); //ordena por cantidad de inscriptos

    void deleteCarrera(int idCarrera);

  //  List<ReporteDTO> generarReporteCarreras();
}
