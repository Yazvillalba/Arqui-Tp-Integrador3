package Controller;


import Services.Interfaces.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carreras")

public class CarreraController {
    @Autowired
    Carrera carreraService;
}
