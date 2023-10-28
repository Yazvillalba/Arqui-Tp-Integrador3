package DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class MatriculaDTO implements Serializable {
    private int anioInscripcion;
    private int graduacion;
    private int antiguedad;
    public MatriculaDTO(int anioInscripcion, int graduacion, int antiguedad) {
        this.anioInscripcion = anioInscripcion;
        this.graduacion = graduacion;
        this.antiguedad = antiguedad;
    }

}
