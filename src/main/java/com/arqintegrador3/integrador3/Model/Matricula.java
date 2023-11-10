package com.arqintegrador3.integrador3.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    @Column(name="anio_inscripcion")
    private int anioInscripcion;
    private int graduacion;
    private int antiguedad;

    public Matricula( Estudiante estudiante, Carrera carrera, int anioInscripcion, int graduacion, int antiguedad) {

        this.estudiante = estudiante;
        this.carrera = carrera;
        this.anioInscripcion = anioInscripcion;
        this.graduacion = graduacion;
        this.antiguedad = antiguedad;
    }
    public Matricula(){}


    public Matricula(Estudiante estudiante, Carrera carrera, int anioInscripcion, int graduacion) {
        this.estudiante = estudiante;
        this.carrera = carrera;
        this.anioInscripcion = anioInscripcion;
        this.graduacion = graduacion;
    }
}
