package com.arqintegrador3.integrador3.Repositories;
import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
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


    @Query(nativeQuery = true, value = "WITH Inscripciones AS ( " +
                                    "SELECT ec.id_carrera, c.nombre, ec.anio_inscripcion AS anio, COUNT(ec.anio_inscripcion) AS inscriptos " +
                                    "FROM Matricula ec " +
                                    "JOIN Carrera c ON c.id_carrera = ec.id_carrera " +
                                    "GROUP BY ec.id_carrera, ec.anio_inscripcion), " +
                                    "Graduaciones AS ( " +
                                    "SELECT ec.id_carrera, c.nombre, NULLIF(ec.graduacion, 0) AS anio, COUNT(NULLIF(ec.graduacion, 0)) AS graduados " +
                                    "FROM Matricula ec " +
                                    "JOIN Carrera c ON c.id_carrera = ec.id_carrera " +
                                    "WHERE NULLIF(ec.graduacion, 0) IS NOT NULL " +
                                    "GROUP BY ec.id_carrera, ec.graduacion) " +
                                    "SELECT IF(i.nombre IS NOT NULL, i.nombre, g.nombre) AS carrera, " +
                                    "CAST(IF(i.nombre IS NOT NULL, i.anio, g.anio) AS UNSIGNED) AS anio, " +
                                    "CAST(COALESCE(i.inscriptos, 0) AS UNSIGNED) AS inscriptos, " +
                                    "CAST(COALESCE(g.graduados, 0) AS UNSIGNED) AS graduados " +
                                    "FROM Inscripciones i " +
                                    "LEFT JOIN (SELECT * FROM Graduaciones) g ON g.nombre = i.nombre AND g.anio = i.anio " +
                                    "UNION " +
                                    "SELECT IF(i.nombre IS NOT NULL, i.nombre, g.nombre) AS carrera, " +
                                    "CAST(IF(i.nombre IS NOT NULL, i.anio, g.anio) AS UNSIGNED) AS anio, " +
                                    "CAST(COALESCE(i.inscriptos, 0) AS UNSIGNED) AS inscriptos, " +
                                    "CAST(COALESCE(g.graduados, 0) AS UNSIGNED) AS graduados " +
                                    "FROM Inscripciones i " +
                                    "RIGHT JOIN (SELECT * FROM Graduaciones) g ON g.nombre = i.nombre AND g.anio = i.anio " +
                                    "ORDER BY carrera, anio ASC")

    List<Object[]>  reporteCarreras();

}

