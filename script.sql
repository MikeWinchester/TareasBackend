CREATE DATABASE GESTIONPROYECTOS;

USE GESTIONPROYECTOS;


CREATE TABLE rol(
    idrol int AUTO_INCREMENT PRIMARY KEY ,
    descripcion varchar(50)
);

CREATE TABLE tipousuario(
    idtipousuario int AUTO_INCREMENT PRIMARY KEY ,
    descripcion varchar(200)
);

CREATE TABLE usuario(
    idusuario int AUTO_INCREMENT PRIMARY KEY ,
    nombre varchar(50),
    apellido varchar(50),
    correo varchar(100),
    contrasena varchar (100),
    idrol int,
    idtipousuario int,
    foreign key (idrol) references rol (idrol),
    foreign key (idtipousuario) references tipousuario(idtipousuario)
);

CREATE TABLE estado(
    idestado int AUTO_INCREMENT PRIMARY KEY ,
    descripcion varchar(50)
);

CREATE TABLE proyecto(
    idproyecto int AUTO_INCREMENT PRIMARY KEY ,
    nombre varchar(50),
    descripcion varchar(200),
    fechainicio date,
    fechafinalizacion date,
    idestado int,
    administrador int,
    foreign key(idestado) references estado(idestado),
    foreign key(administrador) references usuario(idusuario)
);

CREATE TABLE tarea(
    idtarea int AUTO_INCREMENT PRIMARY KEY,
    titulo varchar (100),
    descripcion varchar(200),
    responsable int,
    idproyecto int,
    idestado int,
    foreign key(responsable) references usuario(idusuario),
    foreign key(idproyecto) references proyecto(idproyecto),
    foreign key(idestado) references estado(idestado)
);

CREATE TABLE usuarioxproyecto(
    idusuario int,
    idproyecto int,
    PRIMARY KEY(idusuario, idproyecto),
    foreign key (idusuario) references usuario(idusuario),
    foreign key (idproyecto) references proyecto(idproyecto)
);