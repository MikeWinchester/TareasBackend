package com.test.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.Models.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{
    
}
