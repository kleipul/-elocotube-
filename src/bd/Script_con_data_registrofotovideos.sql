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

/*Table structure for table `foto` */

DROP TABLE IF EXISTS `foto`;

CREATE TABLE `foto` (
  `nro_foto` int(7) NOT NULL,
  `formato` varchar(6) NOT NULL,
  `relacion_aspecto` varchar(7) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  PRIMARY KEY (`nro_foto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `foto` */

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `nro_vid` int(7) NOT NULL,
  `horas` int(2) NOT NULL,
  `minutos` int(2) NOT NULL,
  `segundos` int(2) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `hd` double NOT NULL,
  PRIMARY KEY (`nro_vid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `video` */
