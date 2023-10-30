package Services.Interfaces;

import DTO.CarreraDTO;
import Model.Carrera;


import java.util.List;

public interface CarreraService {
    void addCarrera(Carrera carrera);

    CarreraDTO findCarreraById(int idCarrera);

    List<CarreraDTO> findAllCarreras();

    //List<CarreraConInscriptosDTO> obtenerPorCantInscriptos(); //ordena por cantidad de inscriptos

    void deleteCarrera(int idCarrera);

    //List<ReporteDTO> generarReporteCarreras();
}
