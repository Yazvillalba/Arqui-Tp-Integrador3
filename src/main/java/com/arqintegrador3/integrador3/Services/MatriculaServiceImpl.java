package com.arqintegrador3.integrador3.Services;

import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
import com.arqintegrador3.integrador3.DTO.MatriculacionDTO;
import com.arqintegrador3.integrador3.Model.Matricula;
import com.arqintegrador3.integrador3.Repositories.MatriculaRepository;
import com.arqintegrador3.integrador3.Services.Interfaces.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class  MatriculaServiceImpl implements MatriculaService {
    @Autowired
    MatriculaRepository mr;

    @Override
    public List<MatriculaDTO> findAllMatriculas() {
        return mr.findAllMatriculas();
    }

    @Override
    public void addMatricula(MatriculacionDTO matriculaDTO) {
        Matricula matricula = new Matricula(matriculaDTO.getDni(),matriculaDTO.getNroLibreta(),matriculaDTO.getIdCarrera(),matriculaDTO.getAntiguedad(),matriculaDTO.isGraduado(),matriculaDTO.getAnioInscripcion());

        matricula.setGraduado(matriculacionDTO.isGraduado());
        matricula.setAnioInscripcion(matriculacionDTO.getAnioInscripcion());

        mr.save(inscripcion);

    }
}
