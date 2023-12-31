package com.arqintegrador3.integrador3.Services;
import com.arqintegrador3.integrador3.DTO.CarreraConInscriptosDTO;
import com.arqintegrador3.integrador3.DTO.CarreraDTO;
import com.arqintegrador3.integrador3.DTO.ReporteDTO;
import com.arqintegrador3.integrador3.Repositories.CarreraRepository;
import com.arqintegrador3.integrador3.Services.Interfaces.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arqintegrador3.integrador3.Model.Carrera;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarreraServiceImpl implements CarreraService {
    @Autowired
    CarreraRepository cr;

    @Override
    public void addCarrera(Carrera carrera) {
        cr.save(carrera);
    }

    public CarreraDTO findCarreraById(int id){
        return this.cr.findById(id).map(CarreraDTO::new).orElse(null);
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


    @Override
    @Transactional(readOnly = true)
    public List<ReporteDTO> generarReporteCarreras() {
        List<Object[]> results = cr.reporteCarreras();
        List<ReporteDTO> reporte = new ArrayList<>();

        for (Object[] r : results) {
            reporte.add(new ReporteDTO((String) r[0], (Long) r[1], (Long) r[2], (Long) r[3]));
        }

        return reporte;
    }
}
