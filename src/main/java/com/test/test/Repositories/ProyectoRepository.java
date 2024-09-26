package com.test.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.Models.Proyecto;

import java.util.List;


public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{

    List<Proyecto> findProyectoByEstadoIdEstado(int id_estado);
    
}
