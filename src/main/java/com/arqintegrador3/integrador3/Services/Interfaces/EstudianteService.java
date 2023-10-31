package com.arqintegrador3.integrador3.Services.Interfaces;

import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.Model.Estudiante;

import java.util.List;

public interface EstudianteService {
    void addEstudiante(Estudiante estudiante);

    List<EstudianteDTO> findAllEstudiantes();

    Estudiante findEstudianteByDni(int dni);

    Estudiante findEstudianteByNroLibreta(int nroLibreta);

    List<EstudianteDTO> findEstudianteByGenero(String genero);

    void deleteEstudiante(int idEstudiante);

    List<EstudianteDTO> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad);
}
