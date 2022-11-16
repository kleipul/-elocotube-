/*
SQLyog - Free MySQL GUI v5.11
Host - 5.5.24-log : Database - bd
*********************************************************************
Server version : 5.5.24-log
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `bd`;

USE `bd`;

/*Table structure for table `canal` */

DROP TABLE IF EXISTS `canal`;

CREATE TABLE `canal` (
  `nro_canal` int(6) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cantidad_videos` int(2) NOT NULL,
  `suscripciones` int(2) NOT NULL,
  PRIMARY KEY (`nro_canal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `canal` */

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `id_vid` int(6) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `horas` int(2) NOT NULL,
  `minutos` int(2) NOT NULL,
  `segundos` int(2) NOT NULL,
  `categoria` varchar(15) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `reproducciones` int(20) NOT NULL,
  `hd` double NOT NULL,
  `nro_canal` int(6) NOT NULL,
  PRIMARY KEY (`id_vid`),
  KEY `video_canal_FK` (`nro_canal`),
  CONSTRAINT `video_canal_FK` FOREIGN KEY (`nro_canal`) REFERENCES `canal` (`nro_canal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `video` */
