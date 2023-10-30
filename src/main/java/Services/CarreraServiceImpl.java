package Services;


import DTO.CarreraDTO;
import Repositories.CarreraRepository;
import Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.Carrera;
import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService {
    @Autowired
    CarreraRepository cr;

    @Override
    public void addCarrera(Carrera carrera) {
        cr.save(carrera);
    }

    @Override
    public CarreraDTO findCarreraById(int idCarrera) {
        return null;
    }

    @Override
    public List<CarreraDTO> findAllCarreras() {
        return cr.findAllCarreras();
    }

    @Override
    public void deleteCarrera(int idCarrera) {
        cr.deleteById(idCarrera);
    }

}
