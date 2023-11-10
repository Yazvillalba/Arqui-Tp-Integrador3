package com.arqintegrador3.integrador3.DTO;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class ReporteDTO  implements Serializable {

    private String nombreCarrera;
    private Long anio;
    private Long inscriptos;
    private Long graduados;


    public ReporteDTO(String nombreCarrera, Long anio, Long inscriptos, Long graduados) {
        this.nombreCarrera = nombreCarrera;
        this.anio = anio;
        this.inscriptos = inscriptos;
        this.graduados = graduados;
    }

    @Override
    public String toString() {
        return "nombreCarrera: " + nombreCarrera + " anio: " + anio + " inscriptos: " + inscriptos + " graduados: " + graduados;
    }

}
