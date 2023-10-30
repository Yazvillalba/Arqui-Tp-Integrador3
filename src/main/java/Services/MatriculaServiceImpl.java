package Services;

import Repositories.MatriculaRepository;
import Services.Interfaces.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    MatriculaRepository mr;
}
