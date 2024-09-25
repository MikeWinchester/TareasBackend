package com.test.test.Models;

import java.sql.Date;

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
@Table(name = "proyecto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Proyecto {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private int idProyecto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fechainicio")
    private Date fechainicio;

    @Column(name = "fechafinalizacion")
    private Date fechafinalizacion;

    @ManyToOne
    @JoinColumn(name = "idEstado", referencedColumnName = "idEstado")
    private Estado estado;

    @ManyToOne()
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    private Usuario Administrador;


    
}
