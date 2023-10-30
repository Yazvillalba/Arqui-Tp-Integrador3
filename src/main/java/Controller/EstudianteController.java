package Controller;



import DTO.EstudianteDTO;
import Services.Interfaces.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/todos")
    public List<EstudianteDTO> getEstudiantes(){
        return estudianteService.findAllEstudiantes();
    }

    @GetMapping("/estudiante/{id}")
    public EstudianteDTO getEstudiantesByDni(@PathVariable int dni){
        return estudianteService.findEstudianteByDni(dni);
    }
}
