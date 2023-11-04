package com.arqintegrador3.integrador3.Repositories;


import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.CarreraDTO(c.idCarrera, c.nombre,c.duracion) FROM Carrera c" )
    List<CarreraDTO> findAllCarreras();



    CarreraDTO findCarreraByIdCarrera(int idCarrera);


    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO(c.idCarrera, c.nombre, COUNT(*)) FROM Carrera c JOIN c.estudiantes e GROUP BY c.nombre, c.idCarrera ORDER BY COUNT(*) DESC")
    List<CarreraConInscriptosDTO> findByCantInscriptos();

   // List<ReporteDTO> reporteCarreras();
}

