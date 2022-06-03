CREATE DATABASE IF NOT EXISTS Integrasoft DEFAULT CHARACTER SET utf8;

USE Integrasoft;

CREATE TABLE IF NOT EXISTS caso_prueba(
id_caso_prueba BIGINT  NOT NULL,
caso_uso VARCHAR (30) NOT NULL,
modulo_sistema VARCHAR (30) NOT NULL,
version_ejecucion VARCHAR (30) NOT NULL,
fecha_ejecucion VARCHAR (30) NOT NULL,
descripcion_caso_prueba VARCHAR (1000) NOT NULL,
precondiciones VARCHAR (1000)NOT NULL,
pasos_prueba VARCHAR (1000) NOT NULL,
post_condiciones VARCHAR (1000) NOT NULL,
defectos_desviaciones VARCHAR (1000) NOT NULL,
veredicto VARCHAR (10) NOT NULL,
observaciones VARCHAR (1000) NOT NULL,
probador VARCHAR (20) NOT NULL,
nombre VARCHAR (20) NOT NULL,
firma VARCHAR (20) NOT NULL,
fecha VARCHAR (10) NOT NULL,
PRIMARY KEY (id_caso_prueba)
);

CREATE TABLE IF NOT  EXISTS datosEntrada(
id_dato_entrada BIGINT NOT NULL AUTO_INCREMENT,    
id_caso_prueba BIGINT NOT NULL, 
campo VARCHAR (30) NOT NULL,
valor VARCHAR (30) NOT NULL,
tipo_escenario VARCHAR (30) NOT NULL,
respuesta_aplicacion VARCHAR  (1000) NOT NULL,
coincide VARCHAR (10) NOT NULL,
respuesta_sistema VARCHAR (1000) NOT NULL,
PRIMARY KEY (id_dato_entrada)
);
