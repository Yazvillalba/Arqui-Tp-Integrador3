package com.arqintegrador3.integrador3.DTO;

public abstract class DTO {

    public abstract String getCabeceraTabla();

    protected String getNombreEspaciado(String name, Integer size){
        if(name.length() < size){
            int missing = size - name.length();
            name += " ".repeat(missing);
        }
        return name;
    }
}