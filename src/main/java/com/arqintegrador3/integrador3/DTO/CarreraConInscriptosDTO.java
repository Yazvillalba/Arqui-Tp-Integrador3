package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class CarreraConInscriptosDTO implements Serializable {

    private int id;
    private String nombre;
    private Long nroInscriptos;

    public CarreraConInscriptosDTO(int id, String nombre, Long nroInscriptos) {
        this.nombre = nombre;
        this.nroInscriptos = nroInscriptos;
    }
    @Override
    public String toString() {
        return "Id: " + id + " nombre: " + nombre + " nroInscriptos: " + nroInscriptos;
    }
}
