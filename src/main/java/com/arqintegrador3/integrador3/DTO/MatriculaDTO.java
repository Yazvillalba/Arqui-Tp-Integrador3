package com.arqintegrador3.integrador3.DTO;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class MatriculaDTO implements Serializable {

    private int dni;
    private int nroLibreta;

    private int idCarrera;
    private int antiguedad;
    private int anioInscripcion;
    private int graduacion;



    public MatriculaDTO(int dni, int nroLibreta, int idCarrera, int antiguedad, int anioInscripcion, int graduacion) {

        this.dni = dni;
        this.nroLibreta = nroLibreta;
        this.idCarrera = idCarrera;
        this.antiguedad = antiguedad;
        this.anioInscripcion = anioInscripcion;
        this.graduacion = graduacion;
    }


    @JsonCreator
    public MatriculaDTO(@JsonProperty("dni") int dni,@JsonProperty("idCarrera") int idCarrera ) {
        this.dni = dni;
        this.idCarrera = idCarrera;
    }

}
