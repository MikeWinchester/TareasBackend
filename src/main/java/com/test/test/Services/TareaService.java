package com.test.test.Services;

import java.util.List;
import com.test.test.Models.Tarea;

public interface TareaService {

    public Tarea save(Tarea tarea);

    public List<Tarea> filtrarPorProyecto(int idProyecto);

    public List<Tarea> buscarPorTitulo(String titulo);

    public String ActualizarTarea(int idTarea, Tarea tarea);
    
}
