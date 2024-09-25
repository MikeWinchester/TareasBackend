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

import lombok.Data;


@Data
@Entity
@Table(name = "usuarioxproyectoxrol")
public class UsuarioXProyectoXRol {

    @Id
    @Column(name = "id_usuario_proyecto_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioProyectoRol;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id_proyecto")
    private Proyecto proyecto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    private Rol rol;
}
