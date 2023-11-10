package com.arqintegrador3.integrador3.Repositories;
import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Estudiante;
import com.arqintegrador3.integrador3.Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository("MatriculaRepository")
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
    @Query(value = "SELECT NEW com.arqintegrador3.integrador3.DTO.MatriculaDTO( m.estudiante.dni, m.estudiante.nroLibreta, m.carrera.idCarrera, m.anioInscripcion, m.antiguedad, m.graduacion) FROM Matricula m")
    List<MatriculaDTO> findAllMatriculas();

    boolean existsByEstudianteAndCarrera(Estudiante estudiante, Carrera carrera);
}
