package utils;

import Model.Carrera;
import Model.Estudiante;
import Model.Matricula;
import Repositories.CarreraRepository;
import Repositories.EstudianteRepository;
import Repositories.MatriculaRepository;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;


@Component
public class CSVLoader {
    private EstudianteRepository estudianteRepository;
    private CarreraRepository carreraRepository;
    private MatriculaRepository matriculaRepository;

    public CSVLoader() {

    }


    public CSVParser getParser(String filePath) throws IOException {
        return CSVFormat.DEFAULT.withHeader().parse(new FileReader(filePath));
    }


    @Autowired
    public CSVLoader(EstudianteRepository estudianteRepository, CarreraRepository carreraRepository, MatriculaRepository matriculaRepository) {
        this.estudianteRepository = estudianteRepository;
        this.carreraRepository = carreraRepository;
        this.matriculaRepository = matriculaRepository;
    }

    public void loadEstudiantes(String filePath) throws IOException {
        CSVParser parser = this.getParser("src\\main\\java\\Resources\\estudiantes.csv");

        try {
            for (CSVRecord row : parser) {
                Estudiante estudiante = new Estudiante(
                        Integer.parseInt(row.get("DNI")),
                        row.get("nombre"),
                        row.get("apellido"),
                        Integer.parseInt(row.get("edad")),
                        row.get("genero"),
                        row.get("ciudad"), Integer.parseInt(row.get("LU")));

                estudianteRepository.save(estudiante);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadCarrera(String filePath) throws IOException {
        CSVParser parser = this.getParser("src\\main\\java\\Resources\\carreras.csv");
        try {
            for (CSVRecord row : parser) {
                Carrera carrera = new Carrera(row.get("carrera"), Integer.parseInt(row.get("duracion")));
                carreraRepository.save(carrera);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadEstudianteCarrera(String filePath) throws IOException {
        CSVParser parser = this.getParser("src\\main\\java\\Resources\\estudianteCarrera.csv");
        try {
            for (CSVRecord row : parser) {
                int idEstudiante = Integer.parseInt(row.get("id_estudiante"));
                int idCarrera = Integer.parseInt(row.get("id_carrera"));
               
                Optional<Estudiante> estudiante = estudianteRepository.findById(idEstudiante);
                Optional<Carrera> carrera = carreraRepository.findById(idCarrera);
                Carrera carreraObtenida = carrera.get();
                Estudiante estudianteObtenido = estudiante.get();
                matriculaRepository.save(new Matricula(estudianteObtenido, carreraObtenida, Integer.parseInt(row.get("inscripcion")),Integer.parseInt(row.get("graduacion")),Integer.parseInt(row.get("antiguedad"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }     
}
