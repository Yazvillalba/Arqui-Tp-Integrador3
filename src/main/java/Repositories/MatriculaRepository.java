package Repositories;


import Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MatriculaRepository")
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
