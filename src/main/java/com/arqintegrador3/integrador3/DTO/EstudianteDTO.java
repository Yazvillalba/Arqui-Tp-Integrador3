package com.arqintegrador3.integrador3.DTO;
import com.arqintegrador3.integrador3.Model.Estudiante;
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
    public EstudianteDTO(Estudiante estudiante) {
        this.dni = estudiante.getDni();
        this.nombre = estudiante.getNombre();
        this.apellido = estudiante.getApellido();
        this.edad = estudiante.getEdad();
        this.genero = estudiante.getGenero();
        this.ciudad = estudiante.getCiudad();
        this.nroLibreta = estudiante.getNroLibreta();
    }
    @Override
    public String toString(){
        return "Dni: " + dni +  " nombre: " + nombre +  " apellido: " + apellido + " edad: " + edad + " genero: " + genero + " ciudad: " + ciudad + "nroLibreta: " + nroLibreta;
    }

}
