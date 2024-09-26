package com.test.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.Models.Proyecto;

import com.test.test.Services.Impl.ProyectoServiceImpl;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    
    @Autowired
    private ProyectoServiceImpl proyectoServiceImpl;

    @PostMapping("/proyecto")
    public Proyecto crearProyecto(Proyecto nuevoProyecto){
        return this.proyectoServiceImpl.save(nuevoProyecto);
    } 
}
