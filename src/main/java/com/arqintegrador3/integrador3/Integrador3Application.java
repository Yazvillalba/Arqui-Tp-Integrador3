package com.arqintegrador3.integrador3;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class Integrador3Application {


    @Autowired
    private CSVLoader load;
    public static void main(String[] args) {
        SpringApplication.run(Integrador3Application.class, args);
    }

    @PostConstruct
    public void init() throws Exception{


        load.loadEstudiantes("C:\\Users\\yaz\\Desktop\\Arqui-Tp-Integrador3\\src\\main\\java\\com\\arqintegrador3\\integrador3\\Resources\\estudiantes.csv");
        load.loadCarrera("C:\\Users\\yaz\\Desktop\\Arqui-Tp-Integrador3\\src\\main\\java\\com\\arqintegrador3\\integrador3\\Resources\\carreras.csv");
        load.loadEstudianteCarrera("C:\\Users\\yaz\\Desktop\\Arqui-Tp-Integrador3\\src\\main\\java\\com\\arqintegrador3\\integrador3\\Resources\\estudianteCarrera.csv");

    }

}
