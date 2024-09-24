CREATE DATABASE GESTIONPROYECTOS;

USE GESTIONPROYECTOS;

CREATE TABLE rol(
    idrol int AUTO_INCREMENT PRIMARY KEY ,
    descripcion varchar(50)
);

CREATE TABLE usuario(
    idusuario int AUTO_INCREMENT PRIMARY KEY ,
    nombre varchar(50),
    apellido varchar(50),
    correo varchar(100),
    contrasena varchar (100)
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

CREATE TABLE usuarioxproyectoxrol(
    idusuario int,
    idproyecto int,
    idrolUsuario int,
    PRIMARY KEY(idusuario, idproyecto, idrolUsuario),
    foreign key (idusuario) references usuario(idusuario),
    foreign key (idproyecto) references proyecto(idproyecto),
    foreign key (idrolUsuario) references rol(idrol)
);