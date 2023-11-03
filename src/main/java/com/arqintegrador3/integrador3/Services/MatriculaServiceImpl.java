package com.arqintegrador3.integrador3.Services;

import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
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
}
