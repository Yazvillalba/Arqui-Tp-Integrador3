package DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CarreraDTO extends DTO implements Serializable {

    private String nombre;
    private int duracion;


    public CarreraDTO(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public CarreraDTO() {}

    @Override
    public String getCabeceraTabla() {
        return this.getNombreEspaciado("Nombre", 40) + this.getNombreEspaciado("Duracion", 10);
    }

    @Override
    public String toString(){
        return this.getNombreEspaciado(nombre, 40) + this.getNombreEspaciado(Integer.toString(duracion), 20);
    }

}
