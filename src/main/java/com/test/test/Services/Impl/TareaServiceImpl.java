package com.test.test.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.Models.Tarea;
import com.test.test.Models.Usuario;
import com.test.test.Repositories.TareaRepository;
import com.test.test.Services.TareaService;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public Tarea save(Tarea tarea) {
        return this.tareaRepository.save(tarea);
    }

    @Override
    public List<Tarea> filtrarPorProyecto(int idProyecto) {
        return this.tareaRepository.findTareaByProyectoIdProyecto(idProyecto);
    }

    @Override
    public List<Tarea> buscarPorTitulo(String titulo) {
        return this.tareaRepository.findByTitulo(titulo);
    }

    @Override
    public String ActualizarTarea(int idTarea, Tarea nuevaTarea) {
        Tarea tareaUpdate = this.tareaRepository.findById(idTarea).get();
        if(tareaUpdate != null){
            tareaUpdate.setTitulo(nuevaTarea.getTitulo());
            tareaUpdate.setDescripcion(nuevaTarea.getDescripcion());
            tareaUpdate.setResponsable(nuevaTarea.getResponsable());
            tareaUpdate.setProyecto(nuevaTarea.getProyecto());
            tareaUpdate.setEstado(nuevaTarea.getEstado());
            return "Se ha actualizado la tarea: " + nuevaTarea.getTitulo();
        }
        return "No se encontro la tarea con id: " + nuevaTarea.getIdTarea();
    }
    
}
