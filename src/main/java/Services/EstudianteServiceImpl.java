package Services;

import Repositories.EstudianteRepository;
import Services.Interfaces.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements Estudiante {
    @Autowired
    EstudianteRepository er;
}
