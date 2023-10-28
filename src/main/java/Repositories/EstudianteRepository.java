package Repositories;

import Model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
