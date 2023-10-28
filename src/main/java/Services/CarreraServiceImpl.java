package Services;


import Repositories.CarreraRepository;
import Services.Interfaces.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraServiceImpl implements Carrera {
    @Autowired
    CarreraRepository cr;

}
