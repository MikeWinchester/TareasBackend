package com.test.test.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarioxtarea")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioXTarea {
    
    
    private int idUsuario;

    private int idTarea;
}
