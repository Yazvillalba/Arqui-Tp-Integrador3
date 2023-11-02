package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CarreraDTO implements Serializable {

    private String nombre;
    private int duracion;


    public CarreraDTO(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public CarreraDTO() {}


    @Override
    public String toString(){
       // return this.getNombreEspaciado(nombre, 40) + this.getNombreEspaciado(Integer.toString(duracion), 20);
        return "Nombre:" + nombre + "Duracion: " + duracion;
    }

}
