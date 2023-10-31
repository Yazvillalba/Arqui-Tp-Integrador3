package com.arqintegrador3.integrador3.Repositories;

import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.Model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.EstudianteDTO(e.dni, e.nombre,e.apellido,e.edad,e.genero,e.ciudad,e.nroLibreta) FROM Estudiante e")
    List<EstudianteDTO> findAllEstudiantes();


    Estudiante findEstudianteByNroLibreta(@Param("nro_libreta") int nroLibreta);


    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.EstudianteDTO(e.dni, e.nombre,e.apellido,e.edad,e.genero,e.ciudad,e.nroLibreta) FROM Estudiante e  WHERE e.genero = :genero" )

    List<EstudianteDTO> findEstudianteByGenero(@Param("genero") String genero);


    @Query(value = "SELECT e FROM Matricula ec JOIN ec.estudiante e JOIN ec.carrera c WHERE c.nombre = :nombreCarrera AND e.ciudad = :ciudad")
    List<EstudianteDTO> findEstudiantesByCarrerasAndCiudad(@Param("nombre") String carrera, @Param("ciudad") String ciudad);
}
