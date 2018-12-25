# AplicacionVentas
Características:
- Base de datos: *MySQL*
- Nombre de la base de datos: *dbjava*
#Creacion de la base de datos
CREATE DATABASE DBJAVA;
USE DBJAVA;
CREATE TABLE USUARIOS (
  ID INT (5) PRIMARY KEY AUTO_INCREMENT,
  USERNAME VARCHAR (45),
  PASSWORD VARCHAR (45)
);

