package com.arqintegrador3.integrador3.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private int idCarrera;
    private String nombre;
    private int duracion;

    @OneToMany(mappedBy = "carrera")
    private List<Matricula> estudiantes;

    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Carrera(){}

    public void addEstudiante(Matricula m){
        estudiantes.add(m);
    }
}
