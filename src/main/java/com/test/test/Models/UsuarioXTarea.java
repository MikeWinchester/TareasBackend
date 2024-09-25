package com.test.test.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @Id
    @Column(name = "id_usuario_tarea")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioXTarea;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tarea")
    private Tarea tarea;
}
