package com.arqintegrador3.integrador3.Services;


import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
import com.arqintegrador3.integrador3.Repositories.CarreraRepository;
import com.arqintegrador3.integrador3.Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arqintegrador3.integrador3.Model.Carrera;
import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService {
    @Autowired
    CarreraRepository cr;

    @Override
    public void addCarrera(Carrera carrera) {
        cr.save(carrera);
    }

    @Override
    public Carrera findCarreraById(int idCarrera) {
        return cr.findById(idCarrera).get();
    }

    @Override
    public List<CarreraDTO> findAllCarreras() {
        return cr.findAllCarreras();
    }

    @Override
    public List<CarreraConInscriptosDTO> obtenerPorCantInscriptos() {
        return cr.findByCantInscriptos();
    }

    @Override
    public void deleteCarrera(int idCarrera) {
        cr.deleteById(idCarrera);
    }

   // @Override
    //public List<ReporteDTO> generarReporteCarreras() {
      //  return cr.reporteCarreras();
   // }

}
