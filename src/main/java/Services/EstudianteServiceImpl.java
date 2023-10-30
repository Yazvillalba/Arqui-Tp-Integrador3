package Services;

import DTO.EstudianteDTO;
import Repositories.EstudianteRepository;
import Services.Interfaces.CarreraService;
import Services.Interfaces.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    EstudianteRepository er;

    @Override
    public void agregarEstudiante(EstudianteService estudiante) {

    }

    @Override
    public List<EstudianteDTO> findAllEstudiantes() {
        return null;
    }

    @Override
    public EstudianteDTO findEstudianteByDni(int dni) {
        return null;
    }

    @Override
    public EstudianteDTO findEstudianteBynroLibreta(int nroLibreta) {
        return null;
    }

    @Override
    public List<EstudianteDTO> findEstudianteByGenero(String genero) {
        return null;
    }

    @Override
    public void eliminarEstudiante(EstudianteService estudiante) {

    }

    @Override
    public List<EstudianteDTO> obtenerEstudiantePorCarreraYCiudad(CarreraService carrera, String ciudad) {
        return null;
    }
}
