package com.arqintegrador3.integrador3.DTO;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ReporteDTO extends DTO implements Serializable {

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
    public String getCabeceraTabla(){
        return this.getNombreEspaciado("Carrera", 40) + this.getNombreEspaciado("Año", 20)
                + this.getNombreEspaciado("Inscriptos", 20) + this.getNombreEspaciado("Graduados", 20) ;
    }

    @Override
    public String toString() {
        return this.getNombreEspaciado(nombreCarrera, 40) + this.getNombreEspaciado(anio.toString(), 20)
                + this.getNombreEspaciado(inscriptos.toString(),20) + this.getNombreEspaciado(graduados.toString(), 20) ;
    }

}
