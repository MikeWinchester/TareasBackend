CREATE DATABASE gestion_proyectos;

USE gestion_proyectos;
 

CREATE TABLE rol(
    id_rol int AUTO_INCREMENT PRIMARY KEY ,
    descripcion varchar(50)
);

CREATE TABLE usuario(
    id_usuario int AUTO_INCREMENT PRIMARY KEY ,
    nombre varchar(50),
    apellido varchar(50),
    correo varchar(100),
    contrasenia varchar (100)
);

CREATE TABLE estado(
    id_estado int AUTO_INCREMENT PRIMARY key,
    descripcion varchar(50)
);

CREATE TABLE proyecto(
    id_proyecto int AUTO_INCREMENT PRIMARY KEY ,
    nombre varchar(50),
    descripcion varchar(200),
    fechainicio date,
    fechafinalizacion date,
    id_estado int,
    administrador int,
    foreign key(id_estado) references estado(id_estado),
    foreign key(administrador) references usuario(id_usuario)
);

CREATE TABLE tarea(
    id_tarea int AUTO_INCREMENT PRIMARY KEY,
    titulo varchar (100),
    descripcion varchar(200),
    responsable int,
    id_proyecto int,
    id_estado int,
    foreign key(responsable) references usuario(id_usuario),
    foreign key(id_proyecto) references proyecto(id_proyecto),
    foreign key(id_estado) references estado(id_estado)
);

CREATE TABLE usuarioxproyectoxrol(
    id_usuario int,
    id_proyecto int,
    id_rol int,
    PRIMARY KEY(id_usuario, id_proyecto, id_rol),
    foreign key (id_usuario) references usuario(id_usuario),
    foreign key (id_proyecto) references proyecto(id_proyecto),
    foreign key (id_rol) references rol(id_rol)
);


CREATE TABLE usuarioxtarea(
    id_usuario int,
    id_tarea int,
    PRIMARY KEY(id_usuario, id_tarea),
    foreign key (id_usuario) references usuario(id_usuario),
    foreign key (id_tarea) references tarea(id_tarea)
);