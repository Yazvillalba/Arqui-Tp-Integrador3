package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class MatriculacionDTO implements Serializable {

    private int dni;
    private int nroLibreta;

    private int idCarrera;
    private int antiguedad;
    private int anioInscripcion;
    private boolean graduado;

    public MatriculacionDTO(int dni, int nroLibreta, int idCarrera) {
        this.dni = dni;
        this.nroLibreta = nroLibreta;
        this.idCarrera = idCarrera;
        this.antiguedad = 0;
        this.anioInscripcion = java.time.LocalDate.now().getYear();
        this.graduado = false;
    }

}
