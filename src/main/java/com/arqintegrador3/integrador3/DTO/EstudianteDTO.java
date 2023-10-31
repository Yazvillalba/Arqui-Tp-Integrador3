package com.arqintegrador3.integrador3.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class EstudianteDTO extends DTO implements Serializable {
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
    public String getCabeceraTabla() {
        return this.getNombreEspaciado("dni", 15) +this.getNombreEspaciado("nombre", 20) +this.getNombreEspaciado("apellido", 20) +this.getNombreEspaciado("edad", 15)+this.getNombreEspaciado("genero", 20)+this.getNombreEspaciado("ciudad", 20) +this.getNombreEspaciado("nroLibreta", 10);
    }
    @Override
    public String toString(){
        return this.getNombreEspaciado(Integer.toString(dni), 15) + this.getNombreEspaciado(nombre, 20) + this.getNombreEspaciado(apellido, 20) + this.getNombreEspaciado(Integer.toString(edad), 15)+this.getNombreEspaciado(genero, 20) + this.getNombreEspaciado(ciudad, 20) + this.getNombreEspaciado(Integer.toString(nroLibreta), 15) ;
    }

}
