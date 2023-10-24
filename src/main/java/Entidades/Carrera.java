package Entidades;

import java.io.Serializable;

public class Carrera implements Serializable {
    private String nombre;
    private int duracion,id;

    public Carrera(String nombre, int duracion, int id) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
