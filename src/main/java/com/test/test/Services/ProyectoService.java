package com.test.test.Services;

import java.util.List;

import com.test.test.Models.Proyecto;

public interface ProyectoService {
    
    public Proyecto save(Proyecto nuevoProyecto);

    public Double progreso(int idProyecto);

    public List<Proyecto> filtrarPorEstado(int idEstado);
}
