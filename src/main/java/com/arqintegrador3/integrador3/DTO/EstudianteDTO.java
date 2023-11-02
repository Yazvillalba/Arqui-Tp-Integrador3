package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class EstudianteDTO implements Serializable {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String ciudad;

    private int nroLibreta;

    public EstudianteDTO(int dni, String nombre, String apellido, int edad, String genero, String ciudad,
                         int nroLibreta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.ciudad = ciudad;
        this.nroLibreta = nroLibreta;
    }

    @Override
    public String toString(){
        return "Dni: " + dni +  " nombre: " + nombre +  " apellido: " + apellido + " edad: " + edad + " genero: " + genero + " ciudad: " + ciudad + "nroLibreta: " + nroLibreta;
    }

}
