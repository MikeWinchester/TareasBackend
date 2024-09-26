package com.test.test.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.Models.Proyecto;
import com.test.test.Models.Tarea;
import com.test.test.Repositories.ProyectoRepository;
import com.test.test.Services.ProyectoService;

@Service
public class ProyectoServiceImpl implements ProyectoService{

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public Proyecto save(Proyecto nuevoProyecto) {
        return this.proyectoRepository.save(nuevoProyecto);
    }

    @Override
    public Double progreso(int idProyecto) {

        return 123.3;
    }

    @Override
    public List<Proyecto> filtrarPorEstado(int idEstado) {
        return this.proyectoRepository.findProyectoByEstadoIdEstado(idEstado);
    }
    
    
}
