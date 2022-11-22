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
  `url` varchar(200) NOT NULL,
  PRIMARY KEY (`nro_foto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `foto` */

insert into `foto` (`nro_foto`,`formato`,`relacion_aspecto`,`descripcion`,`url`) values (1,'jpg','800x104','La mona lisa restaurada','https://upload.wikimedia.org/wikipedia/commons/\nthumb/9/99/Gioconda_%28copia_del_Museo_del_Prado\n_restaurada%29.jpg/800px-Gioconda_%28copia_del_\nMuseo_del_Prado_restaurada%29.jpg'),(2,'png','2560x63','Logo Duoc UC	','https://upload.wikimedia.org/wikipedi\na/commons/thumb/a/aa/Logo_DuocUC.svg/\n2560px-Logo_DuocUC.svg.png'),(3,'jpg','800x433','Sistema solar - Arte conceptual','https://concepto.de/wp-content/uploads/2\n018/02/Sistema-solar-e1518703607625.jpg');

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `nro_vid` int(7) NOT NULL,
  `horas` int(2) DEFAULT NULL,
  `minutos` int(2) DEFAULT NULL,
  `segundos` int(2) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `hd` double NOT NULL,
  `url` varchar(200) NOT NULL,
  PRIMARY KEY (`nro_vid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `video` */

insert into `video` (`nro_vid`,`horas`,`minutos`,`segundos`,`descripcion`,`hd`,`url`) values (1,NULL,12,4,'video 3 CRUD ventana eliminar',1,'https://www.youtube.com/watch?v=BcwEVmd1gv8'),(2,2,9,52,'Grandes Éxitos De Los 80s En Inglés. \n(Greatest Hits / Golden Oldies 80s)',1,'https://www.youtube.com/watch?v=FmoFipUYC8g'),(3,NULL,NULL,19,'Me at the zoo - primer video que se subio a youtube',0,'https://www.youtube.com/watch?v=jNQXAC9IVRw');
