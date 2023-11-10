package com.arqintegrador3.integrador3.Services;
import com.arqintegrador3.integrador3.DTO.MatriculaDTO;
import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Estudiante;
import com.arqintegrador3.integrador3.Model.Matricula;
import com.arqintegrador3.integrador3.Repositories.CarreraRepository;
import com.arqintegrador3.integrador3.Repositories.EstudianteRepository;
import com.arqintegrador3.integrador3.Repositories.MatriculaRepository;
import com.arqintegrador3.integrador3.Services.Interfaces.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;


@Service
public class  MatriculaServiceImpl implements MatriculaService {
    @Autowired
    MatriculaRepository mr;

    @Autowired
    private CarreraRepository carreraRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;
    @Override
    public List<MatriculaDTO> findAllMatriculas() {
        return mr.findAllMatriculas();
    }

   @Override
    public void addMatricula(MatriculaDTO matricula) throws Exception {

        if(this.estudianteRepository.existsById(matricula.getDni()) && this.carreraRepository.existsById(matricula.getIdCarrera())){

            Estudiante est = this.estudianteRepository.findById(matricula.getDni()).get();
            Carrera car = this.carreraRepository.findById(matricula.getIdCarrera()).get();
            if(!mr.existsByEstudianteAndCarrera(est, car)){

                Matricula matriculaNueva = new Matricula();
                matriculaNueva.setAnioInscripcion(LocalDate.now().getYear());
                matriculaNueva.setAntiguedad(0);
                matriculaNueva.setGraduacion(0);
                matriculaNueva.setCarrera(car);
                matriculaNueva.setEstudiante(est);
                this.mr.save(matriculaNueva);
                est.addCarrera(matriculaNueva);
                this.estudianteRepository.save(est);
                car.addEstudiante(matriculaNueva);
                this.carreraRepository.save(car);
            } else {
                throw new Exception("Error");
            }

        } else {
            throw new Exception("Error no existe estudiante o carrera");
        }

    }


}
