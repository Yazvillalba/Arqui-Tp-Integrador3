package Services.Interfaces;

import DTO.EstudianteDTO;

import java.util.List;

public interface EstudianteService {
    void agregarEstudiante(EstudianteService estudiante);

    List<EstudianteDTO> findAllEstudiantes();

    EstudianteDTO findEstudianteByDni(int dni);

    EstudianteDTO findEstudianteBynroLibreta(int nroLibreta);

    List<EstudianteDTO> findEstudianteByGenero(String genero);

    void eliminarEstudiante(EstudianteService estudiante);

    List<EstudianteDTO> obtenerEstudiantePorCarreraYCiudad(CarreraService carrera, String ciudad);
}
