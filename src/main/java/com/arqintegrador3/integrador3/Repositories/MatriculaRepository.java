package com.arqintegrador3.integrador3.Repositories;


import com.arqintegrador3.integrador3.Model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MatriculaRepository")
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
