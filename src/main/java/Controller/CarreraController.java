package Controller;


import DTO.CarreraDTO;
import Model.Carrera;
import Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carreras")

public class CarreraController {
    @Autowired
    CarreraService carreraService;

    @GetMapping("/todas")
    public List<CarreraDTO> getCarreras(){

        return carreraService.findAllCarreras();
    }

    @GetMapping("/carrera/{id}")
    public CarreraDTO carreraPorId(@PathVariable int id){

        return carreraService.findCarreraById(id);
    }
    @PostMapping("/agregar/{carrera}")
    public void agregarCarrera(@RequestBody Carrera carrera){

        carreraService.addCarrera(carrera);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCarrera(@PathVariable int id){
        carreraService.deleteCarrera(id);
    }
}
