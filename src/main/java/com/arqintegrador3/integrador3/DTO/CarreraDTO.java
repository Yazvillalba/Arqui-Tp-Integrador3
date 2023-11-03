package com.arqintegrador3.integrador3.DTO;

import com.arqintegrador3.integrador3.Model.Carrera;
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

    public CarreraDTO(Carrera carrera) {
        this.nombre = carrera.getNombre();
        this.duracion = carrera.getDuracion();
    }


    @Override
    public String toString(){
       // return this.getNombreEspaciado(nombre, 40) + this.getNombreEspaciado(Integer.toString(duracion), 20);
        return "Nombre:" + nombre + "Duracion: " + duracion;
    }

}
