package Services;

import Repositories.MatriculaRepository;
import Services.Interfaces.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MatriculaServiceImpl implements Matricula {
    @Autowired
    MatriculaRepository mr;
}