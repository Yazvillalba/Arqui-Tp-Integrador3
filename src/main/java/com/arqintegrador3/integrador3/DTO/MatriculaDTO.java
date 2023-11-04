package com.arqintegrador3.integrador3.DTO;

import com.arqintegrador3.integrador3.Model.Carrera;
import com.arqintegrador3.integrador3.Model.Estudiante;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class MatriculaDTO implements Serializable {
    private int anioInscripcion;
    private int graduacion;
    private int antiguedad;
    private Estudiante estudiante;
    private Carrera carrera;
    public MatriculaDTO(int anioInscripcion, int graduacion, int antiguedad, Estudiante estudiante, Carrera carrera) {
        this.anioInscripcion = anioInscripcion;
        this.graduacion = graduacion;
        this.antiguedad = antiguedad;
        this.estudiante = estudiante;
        this.carrera = carrera;
    }

}
