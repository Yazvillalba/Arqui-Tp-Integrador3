package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class CarreraConInscriptosDTO  extends DTO implements Serializable {


    private int id;
    private String nombre;
    private Long nroInscriptos;

    public CarreraConInscriptosDTO(int id, String nombre, Long nroInscriptos) {
        this.nombre = nombre;
        this.nroInscriptos = nroInscriptos;
    }
    @Override
    public String getCabeceraTabla(){
        return this.getNombreEspaciado("Nombre", 40)
                + this.getNombreEspaciado("Número de Inscriptos", 10);
    }

    @Override
    public String toString() {
        return this.getNombreEspaciado(nombre, 40)
                + this.getNombreEspaciado(nroInscriptos.toString(),10);
    }
}
