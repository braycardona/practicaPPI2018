DROP DATABASE IF EXISTS practicaPPI;
CREATE DATABASE practicaPPI;
USE practicaPPI;


CREATE TABLE usuario(
    id_usuario INT AUTO_INCREMENT,
	id_persona INT NOT NULL,
    nombre_usuario VARCHAR(120) NOT NULL,
	contrasena VARCHAR(120) NOT NULL,
    PRIMARY KEY(id_usuario)
);

CREATE TABLE persona(
    cedula INT NOT NULL,
    nombre VARCHAR(120) NOT NULL,
	apellido_1 VARCHAR(120) NOT NULL,
	apellido_2 VARCHAR(120),
	telefono_1 INT NOT NULL,
	telefono_2 INT,
	correo VARCHAR(100) NOT NULL,
	direccion VARCHAR(150) NOT NULL,
	codigo_prog_academico VARCHAR(20) NOT NULL,
	codigo_cargo VARCHAR(20) NOT NULL,
    PRIMARY KEY(cedula)
);

CREATE TABLE programa_academico(
    codigo_academico VARCHAR(20) NOT NULL,
	nombre VARCHAR(120) NOT NULL,
    PRIMARY KEY(codigo_academico)
);

CREATE TABLE cargo(
    codigo_cargo VARCHAR(20) NOT NULL,
	nombre_cargo VARCHAR(120) NOT NULL,
    PRIMARY KEY(codigo_cargo)
);

CREATE TABLE practica_estudiante(
    id_practica INT AUTO_INCREMENT,
    id_hoja_vida INT NOT NULL,
	id_persona INT NOT NULL,
	id_empresa VARCHAR(80) NOT NULL,
	id_docente INT NOT NULL,
	PRIMARY KEY(id_practica)
);

CREATE TABLE hoja_vida(
    id_hoja_vida INT AUTO_INCREMENT,
	id_persona INT NOT NULL,
	id_prog_academico VARCHAR(20) NOT NULL,
	fecha_guardado INT NOT NULL,
	archivo_hoja_vida VARCHAR(400) NOT NULL,
	PRIMARY KEY(id_hoja_vida)
);

CREATE TABLE empresa(
    nit_empresa VARCHAR(80) NOT NULL,
	nombre_empresa VARCHAR(120) NOT NULL,
	direccion_empresa VARCHAR(150) NOT NULL,
	telefono_1_empresa INT NOT NULL,
	telefono_2_empresa INT,
	ciudad_empresa VARCHAR(120) NOT NULL,
	PRIMARY KEY(nit_empresa)
);

ALTER TABLE usuario ADD CONSTRAINT fk_id_persona FOREIGN KEY (id_persona) REFERENCES persona(cedula);

ALTER TABLE persona ADD CONSTRAINT fk_codigo_prog_academico FOREIGN KEY (codigo_prog_academico) REFERENCES programa_academico(codigo_academico);
ALTER TABLE persona ADD CONSTRAINT fk_codigo_cargo FOREIGN KEY (codigo_cargo) REFERENCES cargo(codigo_cargo);

ALTER TABLE practica_estudiante ADD CONSTRAINT fk_id_persona FOREIGN KEY (id_persona) REFERENCES persona(cedula);
ALTER TABLE practica_estudiante ADD CONSTRAINT fk_id_hoja_vida FOREIGN KEY (id_hoja_vida) REFERENCES hoja_vida(id_hoja_vida);
ALTER TABLE practica_estudiante ADD CONSTRAINT fk_id_empresa FOREIGN KEY (id_empresa) REFERENCES empresa(nit_empresa);

ALTER TABLE hoja_vida ADD CONSTRAINT fk_id_persona FOREIGN KEY (id_persona) REFERENCES persona(cedula);
ALTER TABLE hoja_vida ADD CONSTRAINT fk_id_prog_academico FOREIGN KEY (id_prog_academico) REFERENCES programa_academico(codigo_academico);
