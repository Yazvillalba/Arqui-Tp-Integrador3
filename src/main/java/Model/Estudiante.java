package Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String ciudad;
}
