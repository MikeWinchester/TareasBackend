package com.test.test.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.Models.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer>{

    List<Tarea> findTareaByProyectoIdProyecto(int idProyecto);

    List<Tarea> findByTitulo(String titulo);
    
}
