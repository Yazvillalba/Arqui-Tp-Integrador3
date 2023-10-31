package com.arqintegrador3.integrador3.Repositories;


import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.CarreraDTO(c.nombre,c.duracion) FROM Carrera c" )
    List<CarreraDTO> findAllCarreras();


    @Query()
    CarreraDTO findCarreraByIdCarrera(int idCarrera);


}

