package com.arqintegrador3.integrador3.Services;
import com.arqintegrador3.integrador3.DTO.EstudianteDTO;
import com.arqintegrador3.integrador3.Model.Estudiante;
import com.arqintegrador3.integrador3.Repositories.EstudianteRepository;
import com.arqintegrador3.integrador3.Services.Interfaces.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    EstudianteRepository er;

    @Override
    public void addEstudiante(Estudiante estudiante) {
        er.save(estudiante);
    }

    @Override
    public List<EstudianteDTO> findAllEstudiantes() {
        return er.findAllEstudiantes();
    }

    @Override
    public EstudianteDTO findEstudianteByDni(int dni) {
        return this.er.findById(dni).map(EstudianteDTO::new).orElse(null);

    }

    @Override
    public EstudianteDTO findEstudianteByNroLibreta(int nroLibreta) {
        return this.er.findEstudianteByNroLibreta(nroLibreta);
    }

    @Override
    public List<EstudianteDTO> findEstudianteByGenero(String genero) {
        return er.findEstudianteByGenero(genero);
    }

    @Override
    public void deleteEstudiante(int idEstudiante) {
        er.deleteById(idEstudiante);
    }

    @Override
    public List<EstudianteDTO> findEstudiantesByCarreraAndCiudad(String carrera, String ciudad) {
        return er.findEstudiantesByCarrerasAndCiudad(carrera, ciudad);
    }
}
