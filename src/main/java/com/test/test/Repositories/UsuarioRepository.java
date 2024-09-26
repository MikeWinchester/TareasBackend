package com.test.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Usuario findByCorreo (String correo);
    
}
