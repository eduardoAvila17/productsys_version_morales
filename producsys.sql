/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.5.62-log : Database - producsys
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`producsys` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `producsys`;

/*Table structure for table `aper_cierre` */

DROP TABLE IF EXISTS `aper_cierre`;

CREATE TABLE `aper_cierre` (
  `id` int(11) NOT NULL,
  `fecha_aper` date NOT NULL,
  `hora_aper` time NOT NULL,
  `id_caja` int(11) NOT NULL,
  `monto_aper` int(11) NOT NULL,
  `monto_cierre` int(11) NOT NULL,
  `usu_cod` int(11) NOT NULL,
  `sucu_cod` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  `fecha_cierre` date DEFAULT NULL,
  `hora_cierre` time DEFAULT NULL,
  PRIMARY KEY (`id`,`fecha_aper`,`hora_aper`,`id_caja`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `aper_cierre` */

insert  into `aper_cierre`(`id`,`fecha_aper`,`hora_aper`,`id_caja`,`monto_aper`,`monto_cierre`,`usu_cod`,`sucu_cod`,`estado`,`fecha_cierre`,`hora_cierre`) values 
(1,'2020-01-16','14:10:46',1,50000,0,1,1,3,'2020-01-16','17:08:00'),
(2,'2020-01-16','14:11:06',2,200000,0,1,1,3,'2020-01-16','17:08:40'),
(3,'2020-01-16','17:34:39',1,1000000,0,1,1,3,'2020-01-17','10:53:12'),
(4,'2020-01-17','10:53:53',2,500000,0,1,1,3,'2020-01-17','12:25:40'),
(5,'2020-01-17','12:08:06',1,200000,0,1,1,3,'2020-02-12','09:24:15'),
(6,'2020-02-12','10:22:45',1,500000,150000,1,1,3,'2020-02-12','11:24:11'),
(7,'2020-02-12','13:21:04',2,500000,660000,1,1,4,'2020-02-15','07:23:56'),
(8,'2020-02-15','09:28:11',1,500000,169500,1,1,4,'2020-02-15','09:30:20'),
(9,'2020-02-15','09:28:41',2,250000,345000,1,1,4,'2020-02-15','15:01:04'),
(10,'2020-02-17','14:57:33',1,250000,50000,1,1,3,'2020-02-17','15:04:42'),
(11,'2020-02-17','15:05:14',1,300000,165000,1,1,3,'2020-02-17','15:16:14'),
(12,'2020-02-17','15:32:30',1,30000,80000,1,1,4,'2020-02-17','20:01:07'),
(13,'2020-02-17','19:56:06',2,500000,712000,1,1,4,'2020-02-17','20:26:26'),
(14,'2020-02-17','20:22:07',1,500000,637000,1,1,3,'2020-02-18','13:03:55'),
(15,'2020-02-17','20:26:49',2,500000,1045500,1,1,4,'2020-02-20','21:19:37'),
(16,'2020-02-18','13:04:07',1,500000,62500,1,1,4,'2020-02-20','21:19:22'),
(17,'2020-02-20','21:21:40',1,500000,11000,1,1,3,'2020-02-20','21:39:23'),
(18,'2020-02-20','21:49:34',1,500000,0,2,1,3,NULL,NULL),
(19,'2020-02-21','07:29:13',2,500000,0,2,1,3,NULL,NULL),
(20,'2020-02-21','07:46:37',1,250000,82500,6,1,3,'2020-02-21','07:56:49'),
(21,'2020-02-21','07:48:41',2,500000,5500,1,1,4,'2020-02-21','07:55:28'),
(22,'2020-02-21','07:57:25',1,500000,27500,6,1,4,'2020-02-21','15:50:12'),
(23,'2020-02-21','08:04:06',2,50000,863500,1,1,4,'2020-02-21','15:47:25'),
(24,'2020-02-21','16:29:53',1,500000,151000,1,1,4,'2020-02-22','08:55:10'),
(25,'2020-02-22','10:06:43',3,500000,0,1,1,2,NULL,NULL);

/*Table structure for table `arqueo` */

DROP TABLE IF EXISTS `arqueo`;

CREATE TABLE `arqueo` (
  `id` int(11) NOT NULL,
  `aper_cod` int(11) NOT NULL,
  `caja_cod` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `efectivo` bigint(20) NOT NULL,
  `usu_cod` int(11) NOT NULL,
  `sucu_cod` int(11) NOT NULL,
  PRIMARY KEY (`id`,`aper_cod`,`caja_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `arqueo` */

insert  into `arqueo`(`id`,`aper_cod`,`caja_cod`,`fecha`,`hora`,`efectivo`,`usu_cod`,`sucu_cod`) values 
(1,8,1,'2020-02-15','10:00:24',800000,1,1),
(2,7,2,'2020-02-12','10:00:46',250000,1,1),
(3,9,2,'2020-02-15','15:01:19',350000,1,1),
(4,12,1,'2020-02-17','20:01:18',70000,1,1),
(5,15,2,'2020-02-17','21:19:47',85000,1,1),
(6,16,1,'2020-02-18','21:21:09',1250000,1,1),
(7,13,2,'2020-02-17','21:27:26',850000,1,1),
(8,22,1,'2020-02-21','15:53:08',250000,6,1),
(9,23,2,'2020-02-21','15:53:23',750000,1,1),
(10,21,2,'2020-02-21','15:53:37',650000,1,1),
(11,24,1,'2020-02-21','08:55:16',50000,1,1);

/*Table structure for table `cabec_ajustes` */

DROP TABLE IF EXISTS `cabec_ajustes`;

CREATE TABLE `cabec_ajustes` (
  `ajus_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `mot_cod` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `ajus_fecha` date NOT NULL,
  `estado` varchar(10) NOT NULL,
  PRIMARY KEY (`ajus_cod`),
  KEY `cabec_ajustes_FKIndex3` (`suc_cod`),
  KEY `depo_cod` (`depo_cod`),
  KEY `mot_cod` (`mot_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `cabec_ajustes_ibfk_1` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabec_ajustes_ibfk_2` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabec_ajustes_ibfk_3` FOREIGN KEY (`mot_cod`) REFERENCES `motivos` (`mot_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabec_ajustes_ibfk_4` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabec_ajustes` */

/*Table structure for table `cabecera_apertura_cierre` */

DROP TABLE IF EXISTS `cabecera_apertura_cierre`;

CREATE TABLE `cabecera_apertura_cierre` (
  `id` int(11) NOT NULL,
  `id_caja` int(11) NOT NULL,
  `fecha_aper` date NOT NULL,
  `hora_aper` time NOT NULL,
  `fecha_cierre` date DEFAULT NULL,
  `hora_cierre` time DEFAULT NULL,
  `usuario` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  `sucursal` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_apertura_cierre` */

/*Table structure for table `cabecera_compras` */

DROP TABLE IF EXISTS `cabecera_compras`;

CREATE TABLE `cabecera_compras` (
  `id` int(11) NOT NULL,
  `fecha` varchar(30) DEFAULT NULL,
  `hora` varchar(30) DEFAULT NULL,
  `nro_factura` varchar(30) DEFAULT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  `total_factura` bigint(20) DEFAULT NULL,
  `condicion` int(1) DEFAULT NULL,
  `usu_cod` int(11) DEFAULT NULL,
  `suc_cod` int(11) DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_compras` */

insert  into `cabecera_compras`(`id`,`fecha`,`hora`,`nro_factura`,`id_proveedor`,`total_factura`,`condicion`,`usu_cod`,`suc_cod`,`estado`) values 
(1,'18/01/2020','10:55:01','1',2,1895000,1,1,1,1),
(2,'18/01/2020','11:13:27','1',2,980000,1,1,1,1),
(3,'12/02/2020','09:23:06','1',2,50000,1,1,1,1),
(4,'12/02/2020','10:21:27','1',2,1500000,1,1,1,1),
(5,'15/02/2020','07:51:37','1',2,3800000,1,1,1,1),
(6,'17/02/2020','19:51:51','1121',2,900000,1,1,1,1),
(7,'17/02/2020','20:14:01','121',2,40000000,1,1,1,1),
(8,'18/02/2020','12:56:47','122',2,500000,1,1,1,1),
(9,'22/02/2020','10:08:21','1',1,150325000,1,1,1,1);

/*Table structure for table `cabecera_oc` */

DROP TABLE IF EXISTS `cabecera_oc`;

CREATE TABLE `cabecera_oc` (
  `oc_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `provee_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `pedi_cod` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `oc_est` varchar(10) NOT NULL,
  `montotal` int(10) unsigned NOT NULL,
  PRIMARY KEY (`oc_cod`),
  KEY `cabecera_oc_FKIndex1` (`pedi_cod`),
  KEY `cabecera_oc_FKIndex2` (`suc_cod`),
  KEY `cabecera_oc_FKIndex4` (`provee_cod`),
  KEY `depo_cod` (`depo_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `cabecera_oc_ibfk_1` FOREIGN KEY (`pedi_cod`) REFERENCES `cabecera_pedidos` (`pedi_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_oc_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_oc_ibfk_3` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_oc_ibfk_4` FOREIGN KEY (`provee_cod`) REFERENCES `proveedor` (`provee_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_oc_ibfk_5` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_oc` */

/*Table structure for table `cabecera_pedidos` */

DROP TABLE IF EXISTS `cabecera_pedidos`;

CREATE TABLE `cabecera_pedidos` (
  `pedi_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `provee_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `pedi_est` varchar(10) NOT NULL,
  PRIMARY KEY (`pedi_cod`),
  KEY `suc_cod` (`suc_cod`),
  KEY `provee_cod` (`provee_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `cabecera_pedidos_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_pedidos_ibfk_2` FOREIGN KEY (`provee_cod`) REFERENCES `proveedor` (`provee_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_pedidos_ibfk_3` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_pedidos` */

/*Table structure for table `cabecera_precios` */

DROP TABLE IF EXISTS `cabecera_precios`;

CREATE TABLE `cabecera_precios` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_precios` */

insert  into `cabecera_precios`(`id`,`fecha`,`hora`,`usuario`,`estado`) values 
(1,'2019-09-13','10:53:01','eduardo',1),
(2,'2019-09-13','10:53:01','eduardo',1),
(3,'2019-09-13','10:53:01','eduardo',1),
(4,'2019-09-13','10:53:01','eduardo',1),
(5,'2019-09-13','10:53:01','eduardo',1),
(6,'2019-09-13','10:53:01','eduardo',1),
(7,'2019-09-13','10:53:01','eduardo',1),
(8,'2020-02-15','10:34:24','ADMIN',1),
(9,'2020-02-17','11:20:33','ADMIN',1),
(10,'2020-02-17','11:23:03','ADMIN',1),
(11,'2020-02-17','19:49:01','ADMIN',1),
(12,'2020-02-18','08:27:26','ADMIN',1),
(13,'2020-02-18','08:30:32','ADMIN',1),
(14,'2020-02-18','08:30:33','ADMIN',1),
(15,'2020-02-18','08:30:35','ADMIN',1),
(16,'2020-02-18','08:30:35','ADMIN',1),
(17,'2020-02-18','08:30:35','ADMIN',1),
(18,'2020-02-18','08:30:36','ADMIN',1),
(19,'2020-02-18','08:30:36','ADMIN',1),
(20,'2020-02-18','08:30:36','ADMIN',1),
(21,'2020-02-18','08:30:36','ADMIN',1),
(22,'2020-02-18','08:30:36','ADMIN',1),
(23,'2020-02-18','08:33:01','ADMIN',1),
(24,'2020-02-18','08:36:35','ADMIN',1),
(25,'2020-02-18','08:40:34','ADMIN',1),
(26,'2020-02-18','08:40:37','ADMIN',1),
(27,'2020-02-18','08:40:38','ADMIN',1),
(28,'2020-02-18','08:40:38','ADMIN',1),
(29,'2020-02-18','08:41:23','ADMIN',1),
(30,'2020-02-18','08:44:27','ADMIN',1),
(31,'2020-02-18','08:44:30','ADMIN',1),
(32,'2020-02-18','08:44:30','ADMIN',1),
(33,'2020-02-18','08:44:30','ADMIN',1),
(34,'2020-02-18','08:44:30','ADMIN',1),
(35,'2020-02-18','08:44:31','ADMIN',1),
(36,'2020-02-18','08:44:31','ADMIN',1),
(37,'2020-02-18','08:44:31','ADMIN',1),
(38,'2020-02-18','08:44:31','ADMIN',1),
(39,'2020-02-18','08:44:31','ADMIN',1),
(40,'2020-02-18','08:44:32','ADMIN',1),
(41,'2020-02-18','08:44:32','ADMIN',1),
(42,'2020-02-18','08:45:13','ADMIN',1),
(43,'2020-02-18','08:47:11','ADMIN',1),
(44,'2020-02-18','12:25:02','ADMIN',1),
(45,'2020-02-18','12:27:24','ADMIN',1),
(46,'2020-02-18','12:32:44','ADMIN',1),
(47,'2020-02-18','12:33:31','ADMIN',1),
(48,'2020-02-18','12:33:34','ADMIN',1),
(49,'2020-02-18','12:34:45','',1),
(50,'2020-02-18','12:39:38','ADMIN',1),
(51,'2020-02-18','12:45:36','ADMIN',1),
(52,'2020-02-18','14:28:39','ADMIN',1),
(53,'2020-02-20','21:19:01','ADMIN',1),
(54,'2020-02-21','16:29:30','ADMIN',1);

/*Table structure for table `cabecera_recet` */

DROP TABLE IF EXISTS `cabecera_recet`;

CREATE TABLE `cabecera_recet` (
  `rece_cod` int(11) NOT NULL,
  `rece_desc` varchar(50) NOT NULL,
  `rece_est` varchar(50) NOT NULL,
  `rece_fecha` date NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  PRIMARY KEY (`rece_cod`),
  KEY `sucursal_FKIndex1` (`suc_cod`),
  KEY `funcionario_FKIndex2` (`func_cod`),
  CONSTRAINT `cabecera_recet_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_recet_ibfk_2` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_recet` */

insert  into `cabecera_recet`(`rece_cod`,`rece_desc`,`rece_est`,`rece_fecha`,`suc_cod`,`func_cod`) values 
(1,'fideo','pendiente','2015-12-16',1,1),
(2,'papa frita','pendiente','2015-12-16',1,1),
(3,'pp','pendiente','2015-12-16',1,1),
(4,'asado','pendiente','2015-12-17',1,1);

/*Table structure for table `cabecera_reg_fact` */

DROP TABLE IF EXISTS `cabecera_reg_fact`;

CREATE TABLE `cabecera_reg_fact` (
  `rg_fac_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `provee_cod` int(11) NOT NULL,
  `oc_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `fact_num` int(11) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `total_iva` int(11) NOT NULL,
  `montotal` int(11) NOT NULL,
  `tipo_factu` varchar(15) NOT NULL,
  `cancuo` int(11) NOT NULL,
  `intervalo` int(11) NOT NULL,
  PRIMARY KEY (`rg_fac_cod`),
  KEY `cabecera_reg_fact_FKIndex2` (`suc_cod`),
  KEY `oc_cod` (`oc_cod`),
  KEY `provee_cod` (`provee_cod`),
  KEY `depo_cod` (`depo_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `cabecera_reg_fact_ibfk_1` FOREIGN KEY (`oc_cod`) REFERENCES `cabecera_oc` (`oc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_reg_fact_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_reg_fact_ibfk_3` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_reg_fact_ibfk_4` FOREIGN KEY (`provee_cod`) REFERENCES `proveedor` (`provee_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_reg_fact_ibfk_5` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_reg_fact` */

/*Table structure for table `cabecera_snc` */

DROP TABLE IF EXISTS `cabecera_snc`;

CREATE TABLE `cabecera_snc` (
  `snc_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `motivo` varchar(15) NOT NULL,
  `rg_fac_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` varchar(10) NOT NULL,
  `total` int(10) unsigned NOT NULL,
  `totaliva` int(10) unsigned NOT NULL,
  PRIMARY KEY (`snc_cod`),
  KEY `cabecera_snc_FKIndex1` (`suc_cod`),
  KEY `cabecera_snc_FKIndex3` (`rg_fac_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `cabecera_snc_ibfk_1` FOREIGN KEY (`rg_fac_cod`) REFERENCES `cabecera_reg_fact` (`rg_fac_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_snc_ibfk_2` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_snc_ibfk_3` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_snc` */

/*Table structure for table `cabecera_transf` */

DROP TABLE IF EXISTS `cabecera_transf`;

CREATE TABLE `cabecera_transf` (
  `transf_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `trans_fech` date NOT NULL,
  `trans_hora` time NOT NULL,
  `destino` varchar(200) NOT NULL,
  `tipo_trans` varchar(90) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `trans_estado` varchar(30) NOT NULL,
  PRIMARY KEY (`transf_cod`),
  KEY `cabecera_transf_FKIndex2` (`suc_cod`),
  KEY `cabecera_transf_FKIndex3` (`func_cod`),
  CONSTRAINT `cabecera_transf_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `cabecera_transf_ibfk_2` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_transf` */

insert  into `cabecera_transf`(`transf_cod`,`suc_cod`,`trans_fech`,`trans_hora`,`destino`,`tipo_trans`,`func_cod`,`trans_estado`) values 
(1,1,'2015-12-16','00:22:21','CAPIATA','por traslado',1,'pendiente'),
(2,1,'2015-12-16','00:55:36','SAN LORENZO','por traslado',1,'pendiente');

/*Table structure for table `cabecera_ventas` */

DROP TABLE IF EXISTS `cabecera_ventas`;

CREATE TABLE `cabecera_ventas` (
  `id` int(11) NOT NULL,
  `id_local` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `fecha` varchar(30) NOT NULL,
  `hora` varchar(30) NOT NULL,
  `venta_total` int(11) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `estado` int(11) NOT NULL,
  `numero_caja` int(11) NOT NULL,
  `aper_cod` int(11) NOT NULL,
  `id_condicion` int(11) NOT NULL,
  `nro_factura` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cabecera_ventas` (`aper_cod`),
  CONSTRAINT `FK_cabecera_ventas` FOREIGN KEY (`aper_cod`) REFERENCES `aper_cierre` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cabecera_ventas` */

insert  into `cabecera_ventas`(`id`,`id_local`,`id_cliente`,`fecha`,`hora`,`venta_total`,`usuario`,`estado`,`numero_caja`,`aper_cod`,`id_condicion`,`nro_factura`) values 
(1,1,1,'0000-00-00','',1395000,'1',1,1,5,1,'-2'),
(2,1,1,'2020-01-17','12:56:44',1265000,'1',1,1,5,1,'-2'),
(3,1,1,'2020-01-17','15:36:34',120000,'1',1,1,5,1,'-2'),
(4,1,1,'2020-01-18','11:24:31',11865000,'1',1,1,5,1,'-2'),
(5,1,1,'2020-01-18','11:31:12',4855000,'1',1,1,5,1,'-2'),
(6,1,1,'2020-01-18','11:35:24',2950000,'1',1,1,5,1,'-2'),
(7,1,1,'2020-01-18','11:36:37',3180000,'1',1,1,5,1,'-2'),
(8,1,1,'2020-01-18','11:41:45',3180000,'1',1,1,5,1,'-2'),
(9,1,1,'2020-01-18','11:50:11',390000,'1',1,1,5,1,'-2'),
(10,1,1,'2020-02-12','10:23:29',150000,'1',1,1,6,1,'-2'),
(11,1,1,'2020-02-13','14:20:06',600000,'1',1,2,7,1,'-2'),
(12,1,1,'2020-02-15','07:23:32',60000,'1',1,2,7,1,'-2'),
(13,1,1,'2020-02-15','09:29:21',345000,'1',1,2,9,1,'-2'),
(14,1,1,'2020-02-15','09:30:06',169500,'1',1,1,8,1,'-2'),
(15,1,1,'2020-02-17','15:04:07',50000,'1',1,1,10,1,'-2'),
(16,1,1,'2020-02-17','15:07:57',150000,'1',1,1,11,1,'-2'),
(17,1,1,'2020-02-17','15:16:00',15000,'1',1,1,11,1,'-2'),
(18,1,1,'2020-02-17','19:58:04',20000,'1',1,1,12,1,'-2'),
(19,1,1,'2020-02-17','19:58:52',60000,'1',1,1,12,1,'-2'),
(20,1,1,'2020-02-17','20:09:34',200000,'1',1,2,13,1,'-2'),
(21,1,1,'2020-02-17','20:22:54',240000,'1',1,2,13,1,'-2'),
(22,1,1,'2020-02-17','20:23:56',272000,'1',1,2,13,1,'-2'),
(23,1,1,'2020-02-17','20:29:12',36000,'1',1,1,14,1,'-2'),
(24,1,1,'2020-02-17','20:32:17',8000,'1',1,1,14,1,'-2'),
(25,1,1,'2020-02-17','23:09:36',4000,'1',1,1,14,1,'-2'),
(26,1,1,'2020-02-17','23:14:18',40000,'1',1,1,14,1,'-2'),
(27,1,1,'2020-02-18','12:46:50',31000,'1',1,1,14,1,'-2'),
(28,1,1,'2020-02-18','12:48:48',64000,'1',1,1,14,1,'-2'),
(29,1,1,'2020-02-18','12:51:46',64000,'1',1,1,14,1,'-2'),
(30,1,1,'2020-02-18','12:58:47',390000,'1',1,1,14,1,'-2'),
(31,1,1,'2020-02-18','14:02:36',814000,'1',1,2,15,1,'-2'),
(32,1,1,'2020-02-18','14:12:41',95000,'1',1,2,15,1,'-2'),
(33,1,1,'2020-02-18','14:26:20',41000,'1',1,2,15,1,'-2'),
(34,1,1,'2020-02-20','20:13:51',40500,'1',1,2,15,1,'-2'),
(35,1,1,'2020-02-20','20:36:06',10000,'1',1,2,15,1,'-2'),
(36,1,1,'2020-02-20','20:36:38',10000,'1',1,1,16,1,'-2'),
(37,1,1,'2020-02-20','21:01:56',17500,'1',1,1,16,1,'-2'),
(38,1,1,'2020-02-20','21:02:19',25000,'1',1,1,16,1,'-2'),
(39,1,1,'2020-02-20','21:02:57',10000,'1',1,1,16,1,'-2'),
(40,1,1,'2020-02-20','21:08:09',5000,'1',1,2,15,1,'-2'),
(41,1,1,'2020-02-20','21:11:56',35000,'1',1,2,15,1,'-2'),
(42,1,1,'2020-02-20','21:18:42',5000,'1',1,2,15,1,'-2'),
(43,1,1,'2020-02-20','21:29:08',11000,'1',1,1,17,1,'-2'),
(44,1,1,'2020-02-21','07:47:43',27500,'6',1,1,20,1,'-2'),
(45,1,1,'2020-02-21','07:54:34',5500,'1',1,2,21,1,'-2'),
(46,1,1,'2020-02-21','07:56:23',55000,'6',1,1,20,1,'-2'),
(47,1,1,'2020-02-21','11:43:29',40000,'1',1,2,23,1,'-2'),
(48,1,1,'2020-02-21','11:44:56',27500,'1',1,2,23,1,'-2'),
(49,1,1,'2020-02-21','11:51:12',27500,'1',1,2,23,1,'-2'),
(50,1,1,'2020-02-21','11:51:27',5500,'1',1,2,23,1,'-2'),
(51,1,1,'2020-02-21','11:52:00',20000,'1',1,2,23,1,'-2'),
(52,1,1,'2020-02-21','12:19:39',5500,'1',1,2,23,1,'-2'),
(53,1,1,'2020-02-21','12:20:06',20000,'1',1,2,23,1,'-2'),
(54,1,1,'2020-02-21','13:20:03',27500,'1',1,2,23,1,'-2'),
(55,1,1,'2020-02-21','13:28:08',120000,'1',1,2,23,1,'-2'),
(56,1,1,'2020-02-21','13:28:34',27500,'1',1,2,23,1,'-2'),
(57,1,1,'2020-02-21','14:17:12',11000,'1',1,2,23,1,'-2'),
(58,1,1,'2020-02-21','14:48:07',44000,'1',1,2,23,1,'-2'),
(59,1,1,'2020-02-21','14:55:53',487500,'1',1,2,23,1,'-2'),
(60,1,1,'2020-02-21','15:49:50',27500,'6',1,1,22,1,'-2'),
(61,1,1,'2020-02-21','16:30:12',18000,'1',1,1,24,1,'-2'),
(62,1,1,'2020-02-21','16:30:27',15000,'1',1,1,24,1,'-2'),
(63,1,1,'2020-02-21','16:45:44',15000,'1',1,1,24,1,'-2'),
(64,1,1,'2020-02-21','16:48:55',100000,'1',1,1,24,1,'-2'),
(65,1,1,'2020-02-22','08:54:52',3000,'1',1,1,24,1,'-2'),
(66,1,1,'2020-02-22','10:07:26',115000,'1',1,3,25,1,'-2');

/*Table structure for table `cajas` */

DROP TABLE IF EXISTS `cajas`;

CREATE TABLE `cajas` (
  `id` int(11) NOT NULL,
  `id_timbrado` int(11) NOT NULL,
  `description` varchar(30) NOT NULL,
  `cod_establecimiento` varchar(3) NOT NULL,
  `punto_expedicion` varchar(3) NOT NULL,
  `nro_fact_actual` varchar(30) NOT NULL,
  `nro_fact_inicial` varchar(30) NOT NULL,
  `nro_fact_final` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cajas` (`id_timbrado`),
  CONSTRAINT `FK_cajas` FOREIGN KEY (`id_timbrado`) REFERENCES `timbrado` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cajas` */

insert  into `cajas`(`id`,`id_timbrado`,`description`,`cod_establecimiento`,`punto_expedicion`,`nro_fact_actual`,`nro_fact_inicial`,`nro_fact_final`,`estado`) values 
(1,1,'1','1','1','1','1','2000',1),
(2,1,'2','1','2','1','1','2000',1),
(3,1,'3','1','1','2000','2000','2000',2);

/*Table structure for table `cargo` */

DROP TABLE IF EXISTS `cargo`;

CREATE TABLE `cargo` (
  `carg_cod` int(11) NOT NULL,
  `carg_desc` varchar(40) NOT NULL,
  `carg_est` varchar(10) NOT NULL,
  PRIMARY KEY (`carg_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cargo` */

insert  into `cargo`(`carg_cod`,`carg_desc`,`carg_est`) values 
(1,'ADMINISTRADOR','ACTIVO'),
(2,'CAJERO','ACTIVO');

/*Table structure for table `ciudad` */

DROP TABLE IF EXISTS `ciudad`;

CREATE TABLE `ciudad` (
  `ciu_cod` int(11) NOT NULL,
  `ciu_desc` varchar(30) NOT NULL,
  `ciu_est` int(1) NOT NULL,
  PRIMARY KEY (`ciu_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ciudad` */

insert  into `ciudad`(`ciu_cod`,`ciu_desc`,`ciu_est`) values 
(1,'ASUNCION',1),
(2,'CAPIATA',1),
(3,'SAN LORENZO',1),
(4,'FERNANDO DE LA MORA',1),
(5,'PEDRO JUAN CABALLERO',1),
(6,'CIUDAD DEL ESTE',1),
(7,'ENCARNACION',1);

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `ciu_cod` int(11) NOT NULL,
  `ci` int(11) NOT NULL,
  `ruc` varchar(15) NOT NULL DEFAULT '',
  `nombre` varchar(25) NOT NULL DEFAULT '',
  `apellido` varchar(30) NOT NULL DEFAULT '',
  `direccion` varchar(100) NOT NULL DEFAULT '',
  `telefono` varchar(15) NOT NULL DEFAULT '',
  `mail` varchar(60) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `cliente_FKIndex1` (`ciu_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `ci` int(11) DEFAULT NULL,
  `ruc` varchar(20) DEFAULT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `linea_cred` int(11) NOT NULL,
  `cred_disp` int(11) NOT NULL,
  `tipo_cli` varchar(1) NOT NULL,
  `estado` int(1) NOT NULL,
  `ciu_cod` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_clientes` (`ciu_cod`),
  CONSTRAINT `FK_clientes` FOREIGN KEY (`ciu_cod`) REFERENCES `ciudad` (`ciu_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clientes` */

insert  into `clientes`(`id`,`ci`,`ruc`,`nombres`,`apellidos`,`direccion`,`telefono`,`mail`,`linea_cred`,`cred_disp`,`tipo_cli`,`estado`,`ciu_cod`) values 
(1,4505343,'4505343-0','EDUARDO','AVILA','RUTA MCAL ESTIGARRIBIA KM 23/5 BARRIO FATIMA','0985517685','eduavila25@gmail.com',2000000,2000000,'A',1,1),
(2,4505350,'4505999-1','RPNALDIÑO','GAUCHO','MCAL LOPEZ BARRIO PERUPI ','0985517222','ronaldinho10@gmail.com',2000000,2000000,'A',1,1),
(3,1,'0000000-0','CLIENTE','CASUAL','NN','1','NN',1,1,'A',1,1);

/*Table structure for table `condicion_venta` */

DROP TABLE IF EXISTS `condicion_venta`;

CREATE TABLE `condicion_venta` (
  `id` int(11) NOT NULL,
  `DESCRIPCION` varchar(30) NOT NULL,
  `ESTADO` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `condicion_venta` */

insert  into `condicion_venta`(`id`,`DESCRIPCION`,`ESTADO`) values 
(1,'CONTADO',1),
(2,'CREDITO',1);

/*Table structure for table `control_calidad` */

DROP TABLE IF EXISTS `control_calidad`;

CREATE TABLE `control_calidad` (
  `cont_cod` int(11) NOT NULL,
  `cont_fecha` date NOT NULL,
  `cont_hora` time NOT NULL,
  `cont_estado` varchar(30) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `or_pro_cod` int(11) NOT NULL,
  PRIMARY KEY (`cont_cod`),
  KEY `control_calidad_FKIndex1` (`func_cod`),
  KEY `control_calidad_FKIndex2` (`suc_cod`),
  KEY `control_calidad_FKIndex3` (`or_pro_cod`),
  CONSTRAINT `control_calidad_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `control_calidad_ibfk_2` FOREIGN KEY (`or_pro_cod`) REFERENCES `orden_produccion` (`or_pro_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `control_calidad_ibfk_3` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `control_calidad` */

/*Table structure for table `control_etapas` */

DROP TABLE IF EXISTS `control_etapas`;

CREATE TABLE `control_etapas` (
  `etap_cod` int(11) NOT NULL,
  `rece_cod` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `etap_desc` varchar(200) NOT NULL,
  `estado` varchar(30) NOT NULL,
  PRIMARY KEY (`etap_cod`,`rece_cod`,`item`),
  KEY `cabecera_recet_FKIndex1` (`rece_cod`),
  CONSTRAINT `control_etapas_ibfk_1` FOREIGN KEY (`rece_cod`) REFERENCES `cabecera_recet` (`rece_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `control_etapas` */

insert  into `control_etapas`(`etap_cod`,`rece_cod`,`item`,`etap_desc`,`estado`) values 
(1,1,3,'coccion','pendiente'),
(1,4,3,'coccion','pendiente'),
(2,1,4,'refrigeracion','pendiente'),
(3,3,5,'coccion','pendiente');

/*Table structure for table `cuentas_a_pagar` */

DROP TABLE IF EXISTS `cuentas_a_pagar`;

CREATE TABLE `cuentas_a_pagar` (
  `cuent_cod` int(11) NOT NULL,
  `rg_fac_cod` int(11) NOT NULL,
  `monto` int(11) NOT NULL,
  `vencim` date NOT NULL,
  `estado` varchar(10) NOT NULL,
  PRIMARY KEY (`cuent_cod`,`rg_fac_cod`),
  KEY `rg_fac_cod` (`rg_fac_cod`),
  CONSTRAINT `cuentas_a_pagar_ibfk_1` FOREIGN KEY (`rg_fac_cod`) REFERENCES `cabecera_reg_fact` (`rg_fac_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cuentas_a_pagar` */

/*Table structure for table `deposito` */

DROP TABLE IF EXISTS `deposito`;

CREATE TABLE `deposito` (
  `depo_cod` int(11) NOT NULL,
  `depo_desc` varchar(60) NOT NULL,
  `depo_est` varchar(10) NOT NULL,
  PRIMARY KEY (`depo_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deposito` */

/*Table structure for table `det_control_cantidad` */

DROP TABLE IF EXISTS `det_control_cantidad`;

CREATE TABLE `det_control_cantidad` (
  `cont_cod` int(11) NOT NULL,
  `rece_cod` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `calidad` varchar(200) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`cont_cod`,`rece_cod`,`item`),
  KEY `rece_cod` (`rece_cod`),
  CONSTRAINT `det_control_cantidad_ibfk_1` FOREIGN KEY (`rece_cod`) REFERENCES `cabecera_recet` (`rece_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `det_control_cantidad_ibfk_2` FOREIGN KEY (`cont_cod`) REFERENCES `control_calidad` (`cont_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `det_control_cantidad` */

/*Table structure for table `det_reg_fact` */

DROP TABLE IF EXISTS `det_reg_fact`;

CREATE TABLE `det_reg_fact` (
  `rg_fac_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `catidad` int(10) unsigned NOT NULL,
  `grava5` int(11) NOT NULL,
  `grava10` int(10) unsigned NOT NULL,
  `exenta` int(10) unsigned NOT NULL,
  `prd_costo` int(10) unsigned NOT NULL,
  PRIMARY KEY (`rg_fac_cod`,`prd_cod`),
  KEY `det_reg_fact_FKIndex1` (`prd_cod`),
  KEY `det_reg_fact_FKIndex2` (`rg_fac_cod`),
  CONSTRAINT `det_reg_fact_ibfk_1` FOREIGN KEY (`rg_fac_cod`) REFERENCES `cabecera_reg_fact` (`rg_fac_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `det_reg_fact_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `det_reg_fact` */

/*Table structure for table `detalle_ajustes` */

DROP TABLE IF EXISTS `detalle_ajustes`;

CREATE TABLE `detalle_ajustes` (
  `ajus_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`ajus_cod`,`prd_cod`),
  KEY `detalle_ajustes_FKIndex1` (`prd_cod`),
  KEY `detalle_ajustes_FKIndex2` (`ajus_cod`),
  CONSTRAINT `detalle_ajustes_ibfk_1` FOREIGN KEY (`ajus_cod`) REFERENCES `cabec_ajustes` (`ajus_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_ajustes_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_ajustes` */

/*Table structure for table `detalle_compras` */

DROP TABLE IF EXISTS `detalle_compras`;

CREATE TABLE `detalle_compras` (
  `id` int(11) NOT NULL,
  `id_cabecera` int(11) NOT NULL,
  `item` varchar(30) NOT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `barra_producto` varchar(15) DEFAULT NULL,
  `precio` bigint(20) DEFAULT NULL,
  `cantidad` bigint(20) DEFAULT NULL,
  `total` bigint(20) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cabecera_detalle` (`id_cabecera`),
  CONSTRAINT `cabecera_detalle` FOREIGN KEY (`id_cabecera`) REFERENCES `cabecera_compras` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_compras` */

insert  into `detalle_compras`(`id`,`id_cabecera`,`item`,`id_producto`,`barra_producto`,`precio`,`cantidad`,`total`,`estado`) values 
(1,1,'1',1,'784005200336',6000,50,300000,1),
(2,1,'2',2,'784005800325',5000,303,1515000,1),
(3,1,'3',3,'784002000012',200,400,80000,1),
(4,2,'1',1,'784005200336',5000,100,500000,1),
(5,2,'2',2,'784005800325',3200,100,320000,1),
(6,2,'3',3,'784002000012',3200,50,160000,1),
(7,3,'1',2,'784005800325',5000,10,50000,1),
(8,4,'1',4,'7840029101042',50000,30,1500000,1),
(9,5,'1',2,'784005800325',20000,120,2400000,1),
(10,5,'2',4,'7840029101042',5600,250,1400000,1),
(11,6,'1',2,'784005800325',9000,100,900000,1),
(12,7,'1',6,'123',5000,8000,40000000,1),
(13,8,'1',6,'123',5000,100,500000,1),
(14,9,'3',6,'123',3500,50,175000,1);

/*Table structure for table `detalle_oc` */

DROP TABLE IF EXISTS `detalle_oc`;

CREATE TABLE `detalle_oc` (
  `oc_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `cantid` int(11) NOT NULL,
  `prd_costo` int(10) unsigned NOT NULL,
  PRIMARY KEY (`oc_cod`,`prd_cod`),
  KEY `detalle_oc_FKIndex1` (`oc_cod`),
  KEY `detalle_oc_FKIndex2` (`prd_cod`),
  CONSTRAINT `detalle_oc_ibfk_1` FOREIGN KEY (`oc_cod`) REFERENCES `cabecera_oc` (`oc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_oc_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_oc` */

/*Table structure for table `detalle_orden_produccion` */

DROP TABLE IF EXISTS `detalle_orden_produccion`;

CREATE TABLE `detalle_orden_produccion` (
  `or_pro_cod` int(11) NOT NULL,
  `det_item` int(7) NOT NULL,
  `rece_cod` int(11) NOT NULL,
  `cantidad` int(7) NOT NULL,
  `actividad_realizar` varchar(200) NOT NULL,
  `or_estado` varchar(30) NOT NULL,
  PRIMARY KEY (`or_pro_cod`,`det_item`,`rece_cod`),
  KEY `detalle_orden_produccion_FKIndex1` (`or_pro_cod`),
  KEY `detalle_orden_produccion_FKIndex2` (`rece_cod`),
  CONSTRAINT `detalle_orden_produccion_ibfk_1` FOREIGN KEY (`rece_cod`) REFERENCES `cabecera_recet` (`rece_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_orden_produccion_ibfk_2` FOREIGN KEY (`or_pro_cod`) REFERENCES `orden_produccion` (`or_pro_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_orden_produccion` */

/*Table structure for table `detalle_pedido` */

DROP TABLE IF EXISTS `detalle_pedido`;

CREATE TABLE `detalle_pedido` (
  `pedi_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `canti` int(11) NOT NULL,
  PRIMARY KEY (`pedi_cod`,`prd_cod`),
  KEY `detalle_pedido_FKIndex1` (`pedi_cod`),
  KEY `detalle_pedido_FKIndex2` (`prd_cod`),
  KEY `depo_cod` (`depo_cod`),
  KEY `depo_cod_2` (`depo_cod`,`prd_cod`),
  CONSTRAINT `detalle_pedido_ibfk_1` FOREIGN KEY (`pedi_cod`) REFERENCES `cabecera_pedidos` (`pedi_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_pedido_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_pedido_ibfk_3` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_pedido_ibfk_4` FOREIGN KEY (`depo_cod`, `prd_cod`) REFERENCES `stock` (`depo_cod`, `prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_pedido` */

/*Table structure for table `detalle_precios` */

DROP TABLE IF EXISTS `detalle_precios`;

CREATE TABLE `detalle_precios` (
  `id_cabecera` int(11) NOT NULL,
  `plu` decimal(20,0) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `costo` int(11) NOT NULL,
  `prec_actual` int(11) NOT NULL,
  `prec_nuevo` int(11) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id_cabecera`,`plu`),
  CONSTRAINT `FK_detalle_precios` FOREIGN KEY (`id_cabecera`) REFERENCES `cabecera_precios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_precios` */

insert  into `detalle_precios`(`id_cabecera`,`plu`,`descripcion`,`costo`,`prec_actual`,`prec_nuevo`,`estado`) values 
(2,784005200336,'PANHAL HUGGIES XXXL X 18',1000,5000,60000,1),
(2,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,60000,1),
(3,784005200336,'PANHAL HUGGIES XXXL X 18',1000,5000,60000,1),
(3,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,60000,1),
(4,784002000012,'DULCE DE LECHE LIGHT',2500,0,6500,1),
(5,784005200336,'PANHAL HUGGIES XXXL X 18',1000,60000,5000,1),
(6,784005200336,'PANHAL HUGGIES XXXL X 18',1000,5000,55000,1),
(7,784005200336,'PANHAL HUGGIES XXXL X 18',1000,55000,60000,1),
(8,784005800123,'JABON EN POLVO OMO 500 GR',12000,16500,15000,1),
(9,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,60000,5000,1),
(10,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,60000,5000,1),
(11,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,5000,4000,1),
(11,7840029101042,'CAFE BELEN CLASICO 100 GS',11000,15000,16000,1),
(12,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,4000,6000,1),
(13,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(14,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(15,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(16,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(17,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(18,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(19,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(20,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(21,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(22,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(23,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,7000,6000,1),
(24,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(25,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,7000,6000,1),
(26,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,7000,6000,1),
(27,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,7000,6000,1),
(28,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,7000,6000,1),
(29,123,'durrr',5000,7500,6000,1),
(30,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(31,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(32,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(33,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(34,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(35,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(36,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(37,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(38,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(39,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(40,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(41,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,6500,1),
(42,123,'durrr',5000,6000,6000,1),
(43,123,'durrr',5000,6000,6500,1),
(44,123,'durrr',5000,6500,7000,1),
(45,123,'durrr',5000,7000,6500,1),
(46,123,'durrr',5000,6500,7000,1),
(47,123,'durrr',5000,7000,6000,1),
(48,123,'durrr',5000,7000,6000,1),
(49,123,'durrr',5000,6000,6000,1),
(49,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6500,5000,1),
(50,123,'durrr',5000,6000,3000,1),
(50,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,5000,6000,1),
(51,123,'durrr',5000,3000,5000,1),
(51,784005800325,'ACEITE DE GIRASOL NATURA 900 ML',1000,6000,7000,1),
(52,123,'durrr',5000,5000,5000,1),
(53,123,'durrr',5000,5000,5500,1),
(54,123,'durrr',5000,5500,3000,1);

/*Table structure for table `detalle_proceso_etapa` */

DROP TABLE IF EXISTS `detalle_proceso_etapa`;

CREATE TABLE `detalle_proceso_etapa` (
  `proces_cod` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `rece_cod` int(11) NOT NULL,
  `etap_cod` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `obs` varchar(200) NOT NULL,
  PRIMARY KEY (`proces_cod`,`item`,`rece_cod`,`etap_cod`),
  KEY `detalle_proceso_etapa_FKIndex1` (`proces_cod`),
  KEY `etap_cod` (`etap_cod`,`rece_cod`,`item`),
  KEY `rece_cod` (`rece_cod`,`proces_cod`,`item`),
  CONSTRAINT `detalle_proceso_etapa_ibfk_2` FOREIGN KEY (`etap_cod`, `rece_cod`, `item`) REFERENCES `control_etapas` (`etap_cod`, `rece_cod`, `item`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_proceso_etapa_ibfk_4` FOREIGN KEY (`proces_cod`) REFERENCES `procesos_produccion` (`proces_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_proceso_etapa` */

/*Table structure for table `detalle_procesos_prod` */

DROP TABLE IF EXISTS `detalle_procesos_prod`;

CREATE TABLE `detalle_procesos_prod` (
  `rece_cod` int(11) NOT NULL,
  `proces_cod` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  PRIMARY KEY (`rece_cod`,`proces_cod`,`item`),
  KEY `detalle_procesos_prod_FKIndex1` (`prd_cod`),
  KEY `detalle_procesos_prod_FKIndex3` (`rece_cod`),
  KEY `detalle_procesos_produccion_FKIndex5` (`depo_cod`),
  KEY `proces_cod` (`proces_cod`),
  KEY `depo_cod` (`depo_cod`,`prd_cod`),
  CONSTRAINT `detalle_procesos_prod_ibfk_1` FOREIGN KEY (`rece_cod`) REFERENCES `cabecera_recet` (`rece_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_procesos_prod_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_procesos_prod_ibfk_3` FOREIGN KEY (`proces_cod`) REFERENCES `procesos_produccion` (`proces_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_procesos_prod_ibfk_4` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_procesos_prod_ibfk_5` FOREIGN KEY (`depo_cod`, `prd_cod`) REFERENCES `stock` (`depo_cod`, `prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_procesos_prod` */

/*Table structure for table `detalle_recetas` */

DROP TABLE IF EXISTS `detalle_recetas`;

CREATE TABLE `detalle_recetas` (
  `rece_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `det_item` int(7) NOT NULL,
  `unid_cod` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  PRIMARY KEY (`rece_cod`,`prd_cod`,`det_item`),
  KEY `detalle_recetas_FKIndex1` (`prd_cod`),
  KEY `detalle_recetas_FKIndex2` (`rece_cod`),
  KEY `detalle_recetas_FKIndex3` (`unid_cod`),
  KEY `detalle_recetas_FKIndex4` (`depo_cod`),
  KEY `depo_cod` (`depo_cod`,`prd_cod`),
  CONSTRAINT `detalle_recetas_ibfk_1` FOREIGN KEY (`rece_cod`) REFERENCES `cabecera_recet` (`rece_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_recetas_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_recetas_ibfk_3` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_recetas_ibfk_4` FOREIGN KEY (`depo_cod`, `prd_cod`) REFERENCES `stock` (`depo_cod`, `prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_recetas_ibfk_5` FOREIGN KEY (`unid_cod`) REFERENCES `unidad_medida` (`unid_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_recetas` */

/*Table structure for table `detalle_remision` */

DROP TABLE IF EXISTS `detalle_remision`;

CREATE TABLE `detalle_remision` (
  `cod_remi` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `item` int(7) unsigned NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`cod_remi`,`prd_cod`,`item`),
  KEY `detalle_remision_FKIndex1` (`prd_cod`),
  KEY `detalle_remision_FKIndex2` (`cod_remi`),
  KEY `depo_cod` (`depo_cod`),
  CONSTRAINT `detalle_remision_ibfk_1` FOREIGN KEY (`cod_remi`) REFERENCES `nota_remision` (`cod_remi`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_remision_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_remision_ibfk_3` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_remision` */

/*Table structure for table `detalle_snc` */

DROP TABLE IF EXISTS `detalle_snc`;

CREATE TABLE `detalle_snc` (
  `snc_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `cant` int(11) NOT NULL,
  `prd_costo` int(10) unsigned NOT NULL,
  `grava5` int(10) unsigned NOT NULL,
  `grava10` int(10) unsigned NOT NULL,
  `exento` int(10) unsigned NOT NULL,
  PRIMARY KEY (`snc_cod`,`prd_cod`),
  KEY `detalle_SNC_FKIndex1` (`prd_cod`),
  KEY `detalle_SNC_FKIndex2` (`snc_cod`),
  CONSTRAINT `detalle_snc_ibfk_1` FOREIGN KEY (`snc_cod`) REFERENCES `cabecera_snc` (`snc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_snc_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_snc` */

/*Table structure for table `detalle_trasnf` */

DROP TABLE IF EXISTS `detalle_trasnf`;

CREATE TABLE `detalle_trasnf` (
  `transf_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `det_item` int(7) NOT NULL,
  `cant_trans` int(11) NOT NULL,
  `depo_cod` int(11) NOT NULL,
  `unid_cod` int(11) NOT NULL,
  PRIMARY KEY (`transf_cod`,`prd_cod`,`det_item`),
  KEY `detalle_trasnf_FKIndex1` (`prd_cod`),
  KEY `detalle_trasnf_FKIndex2` (`transf_cod`),
  KEY `detalle_trasnf_FKIndex3` (`depo_cod`),
  KEY `detalle_trasnf_FKIndex4` (`unid_cod`),
  KEY `depo_cod` (`depo_cod`,`prd_cod`),
  CONSTRAINT `detalle_trasnf_ibfk_1` FOREIGN KEY (`transf_cod`) REFERENCES `cabecera_transf` (`transf_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_trasnf_ibfk_2` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_trasnf_ibfk_3` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_trasnf_ibfk_4` FOREIGN KEY (`depo_cod`, `prd_cod`) REFERENCES `stock` (`depo_cod`, `prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `detalle_trasnf_ibfk_5` FOREIGN KEY (`unid_cod`) REFERENCES `unidad_medida` (`unid_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_trasnf` */

/*Table structure for table `detalle_ventas` */

DROP TABLE IF EXISTS `detalle_ventas`;

CREATE TABLE `detalle_ventas` (
  `id` int(11) NOT NULL,
  `id_cabecera` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `barra_producto` bigint(11) NOT NULL,
  `item` int(11) NOT NULL,
  `cantidad` float NOT NULL,
  `precio_unit` int(11) NOT NULL,
  `importe_bruto` int(11) NOT NULL,
  `unidad_medida` int(11) NOT NULL,
  PRIMARY KEY (`id`,`id_cabecera`,`id_producto`,`barra_producto`,`item`),
  KEY `FK_detalle_venta` (`id_cabecera`),
  CONSTRAINT `FK_detalle_venta` FOREIGN KEY (`id_cabecera`) REFERENCES `cabecera_ventas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalle_ventas` */

insert  into `detalle_ventas`(`id`,`id_cabecera`,`id_producto`,`barra_producto`,`item`,`cantidad`,`precio_unit`,`importe_bruto`,`unidad_medida`) values 
(1,1,1,784005200336,1,10,60000,600000,1),
(2,1,2,784005800325,2,10,60000,600000,1),
(3,1,3,784002000012,3,30,6500,195000,1),
(4,2,1,784005200336,1,10,60000,600000,1),
(5,2,2,784005800325,2,10,60000,600000,1),
(6,2,3,784002000012,3,10,6500,65000,1),
(7,3,2,784005800325,1,2,60000,120000,1),
(8,4,1,784005200336,1,78,55000,4290000,1),
(9,4,2,784005800325,2,75,60000,4500000,1),
(10,4,1,784005200336,3,50,55000,2750000,1),
(11,4,3,784002000012,4,50,6500,325000,1),
(12,5,1,784005200336,1,20,55000,1100000,1),
(13,5,1,784005200336,2,10,55000,550000,1),
(14,5,2,784005800325,3,48,60000,2880000,1),
(15,5,3,784002000012,4,50,6500,325000,1),
(16,6,1,784005200336,1,10,55000,550000,1),
(17,6,2,784005800325,2,40,60000,2400000,1),
(18,7,1,784005200336,3,2,55000,110000,1),
(19,7,2,784005800325,4,2,60000,120000,1),
(20,9,1,784005200336,1,1,55000,55000,1),
(21,9,2,784005800325,2,1,60000,60000,1),
(22,9,1,784005200336,3,5,55000,275000,1),
(23,10,4,7840029101042,1,10,15000,150000,1),
(24,11,2,784005800325,1,10,60000,600000,1),
(25,12,2,784005800325,1,1,60000,60000,1),
(26,13,5,784005800123,1,10,16500,165000,1),
(27,13,2,784005800325,2,3,60000,180000,1),
(28,14,2,784005800325,1,2,60000,120000,1),
(29,14,5,784005800123,2,3,16500,49500,1),
(30,15,2,784005800325,1,10,5000,50000,1),
(31,16,4,7840029101042,1,10,15000,150000,1),
(32,17,2,784005800325,1,3,5000,15000,1),
(33,18,2,784005800325,1,2,4000,8000,1),
(34,18,2,784005800325,2,3,4000,12000,1),
(35,19,2,784005800325,3,10,4000,40000,1),
(36,20,2,784005800325,1,60,3000,180000,1),
(37,20,2,784005800325,2,5,4000,20000,1),
(38,21,2,784005800325,1,60,4000,240000,1),
(39,22,2,784005800325,2,8,4000,32000,1),
(40,23,2,784005800325,1,6,4000,24000,1),
(41,23,2,784005800325,2,3,4000,12000,1),
(42,24,2,784005800325,1,2,4000,8000,1),
(43,25,2,784005800325,1,1,4000,4000,1),
(44,26,2,784005800325,1,10,4000,40000,1),
(45,27,6,123,1,2,5000,10000,1),
(46,27,2,784005800325,2,3,7000,21000,1),
(47,28,6,123,1,10,5000,50000,1),
(48,28,2,784005800325,2,2,7000,14000,1),
(49,29,6,123,1,10,5000,50000,1),
(50,29,2,784005800325,2,2,7000,14000,1),
(51,30,6,123,1,78,5000,390000,1),
(52,31,2,784005800325,1,2,7000,14000,1),
(53,31,4,7840029101042,2,50,16000,800000,1),
(54,32,6,123,3,2,5000,10000,1),
(55,33,6,123,4,5,5000,25000,1),
(56,33,4,7840029101042,5,1,16000,16000,1),
(57,34,8,7840073125018,1,1,7500,7500,1),
(58,34,9,7840001001001,2,2,5000,10000,1),
(59,34,10,7804920002587,3,1,11000,11000,1),
(60,34,11,7840508017055,4,1,12000,12000,1),
(61,35,6,123,2,2,5000,10000,1),
(62,36,6,123,1,2,5000,10000,1),
(63,37,6,123,1,2,5000,10000,1),
(64,37,8,7840073125018,2,1,7500,7500,1),
(65,38,6,123,3,5,5000,25000,1),
(66,39,6,123,4,2,5000,10000,1),
(67,40,6,123,1,1,5000,5000,1),
(68,41,6,123,1,1,5000,5000,1),
(69,41,5,784005800123,2,2,15000,30000,1),
(70,42,6,123,1,1,5000,5000,1),
(71,43,6,123,1,2,5500,11000,1),
(72,44,6,123,1,5,5500,27500,1),
(73,45,6,123,1,1,5500,5500,1),
(74,46,6,123,1,10,5500,55000,1),
(75,47,7,1234,1,2,20000,40000,1),
(76,48,6,123,3,5,5500,27500,1),
(77,49,6,123,1,5,5500,27500,1),
(78,50,6,123,2,1,5500,5500,1),
(79,51,7,1234,3,1,20000,20000,1),
(80,52,6,123,2,1,5500,5500,1),
(81,53,7,1234,3,1,20000,20000,1),
(82,54,6,123,1,5,5500,27500,1),
(83,55,1,784005200336,1,2,60000,120000,1),
(84,56,6,123,2,5,5500,27500,1),
(85,57,6,123,1,2,5500,11000,1),
(86,58,6,123,2,8,5500,44000,1),
(87,59,8,7840073125018,1,65,7500,487500,1),
(88,60,6,123,1,5,5500,27500,1),
(89,61,6,123,1,6,3000,18000,1),
(90,62,6,123,2,5,3000,15000,1),
(91,63,6,123,1,5,3000,15000,1),
(92,64,7,1234,1,5,20000,100000,1),
(93,65,6,123,1,1,3000,3000,1),
(94,66,6,123,1,5,3000,15000,1),
(95,66,7,1234,2,5,20000,100000,1);

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `func_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `carg_cod` int(11) NOT NULL,
  `func_nom` varchar(30) NOT NULL,
  `func_ape` varchar(50) NOT NULL,
  `func_dir` varchar(100) NOT NULL,
  `func_tel` varchar(20) NOT NULL,
  `func_ci` int(11) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`func_cod`),
  KEY `funcionario_FKIndex1` (`carg_cod`),
  KEY `funcionario_FKIndex2` (`suc_cod`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`carg_cod`) REFERENCES `cargo` (`carg_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`func_cod`,`suc_cod`,`carg_cod`,`func_nom`,`func_ape`,`func_dir`,`func_tel`,`func_ci`,`estado`) values 
(1,1,1,'EDUARDO ','AVILA','CAPIATA','02136544',1,0),
(2,1,1,'EDUARDO RAMON','AVILA GONZALEZ','CAPIATA RUTA 2','0985517685',4505343,1);

/*Table structure for table `impuesto` */

DROP TABLE IF EXISTS `impuesto`;

CREATE TABLE `impuesto` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `impuesto` */

insert  into `impuesto`(`id`,`descripcion`,`estado`) values 
(1,'IVA 5%',0),
(2,'IVA 10%',0),
(3,'EXENTO',0);

/*Table structure for table `marcas` */

DROP TABLE IF EXISTS `marcas`;

CREATE TABLE `marcas` (
  `mar_cod` int(11) NOT NULL,
  `mar_desc` varchar(30) NOT NULL,
  `mar_est` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`mar_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `marcas` */

insert  into `marcas`(`mar_cod`,`mar_desc`,`mar_est`) values 
(1,'KURUPI','1'),
(2,'PINO LECHE','0');

/*Table structure for table `medio_pago` */

DROP TABLE IF EXISTS `medio_pago`;

CREATE TABLE `medio_pago` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(60) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `medio_pago` */

insert  into `medio_pago`(`id`,`descripcion`,`estado`) values 
(1,'EFECTIVO',1),
(2,'TARJETA',1),
(3,'CHEQUE',1),
(4,'VALES',1);

/*Table structure for table `moneda` */

DROP TABLE IF EXISTS `moneda`;

CREATE TABLE `moneda` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `moneda` */

/*Table structure for table `motivos` */

DROP TABLE IF EXISTS `motivos`;

CREATE TABLE `motivos` (
  `mot_cod` int(11) NOT NULL,
  `mot_desc` varchar(60) NOT NULL,
  `mot_est` varchar(10) NOT NULL,
  `mot_tipo` varchar(40) NOT NULL,
  PRIMARY KEY (`mot_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `motivos` */

insert  into `motivos`(`mot_cod`,`mot_desc`,`mot_est`,`mot_tipo`) values 
(1,'por traslado','ACTIVO ','por nota remision'),
(2,'por compra','ACTIVO','por nota remision'),
(3,'por envio','ACTIVO','por nota remision');

/*Table structure for table `nota_remision` */

DROP TABLE IF EXISTS `nota_remision`;

CREATE TABLE `nota_remision` (
  `cod_remi` int(11) NOT NULL,
  `mot_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `vehi_cod` int(11) NOT NULL,
  `fecha_salida` date NOT NULL,
  `fecha_entreg` date NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `estado` varchar(10) NOT NULL,
  `hora_final` time DEFAULT NULL,
  `destino` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cod_remi`),
  KEY `nota_remision_FKIndex1` (`mot_cod`),
  KEY `nota_remision_FKIndex2` (`vehi_cod`),
  KEY `nota_remision_FKIndex4` (`suc_cod`),
  KEY `func_cod` (`func_cod`),
  CONSTRAINT `nota_remision_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `nota_remision_ibfk_2` FOREIGN KEY (`mot_cod`) REFERENCES `motivos` (`mot_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `nota_remision_ibfk_3` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `nota_remision_ibfk_4` FOREIGN KEY (`vehi_cod`) REFERENCES `vehiculo` (`vehi_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nota_remision` */

/*Table structure for table `presentacion` */

DROP TABLE IF EXISTS `presentacion`;

CREATE TABLE `presentacion` (
  `presen_cod` int(11) NOT NULL,
  `presen_des` varchar(30) NOT NULL,
  `prese_est` varchar(10) NOT NULL,
  PRIMARY KEY (`presen_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `presentacion` */

insert  into `presentacion`(`presen_cod`,`presen_des`,`prese_est`) values 
(1,'CAJA','ACTIVO'),
(2,'BOTELLA','ACTIVO');

/*Table structure for table `procesos_produccion` */

DROP TABLE IF EXISTS `procesos_produccion`;

CREATE TABLE `procesos_produccion` (
  `proces_cod` int(11) NOT NULL,
  `suc_cod` int(11) NOT NULL,
  `or_pro_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `proce_est` varchar(10) NOT NULL,
  `proces_fech` date NOT NULL,
  `hora_terminada` time NOT NULL,
  PRIMARY KEY (`proces_cod`),
  KEY `procesos_produccion_FKIndex2` (`or_pro_cod`),
  KEY `procesos_produccion_FKIndex4` (`suc_cod`),
  KEY `procesos_produccion_FKIndex1` (`func_cod`),
  CONSTRAINT `procesos_produccion_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `procesos_produccion_ibfk_2` FOREIGN KEY (`or_pro_cod`) REFERENCES `orden_produccion` (`or_pro_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `procesos_produccion_ibfk_3` FOREIGN KEY (`suc_cod`) REFERENCES `sucursal` (`suc_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `procesos_produccion` */

/*Table structure for table `producto` */

DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `prd_cod` int(11) NOT NULL,
  `tip_prd_cod` int(11) NOT NULL,
  `presen_cod` int(11) NOT NULL,
  `mar_cod` int(11) NOT NULL,
  `unid_cod` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL DEFAULT '',
  `costo` int(11) NOT NULL,
  `iva` int(11) NOT NULL,
  `estado` int(1) NOT NULL,
  `barra` varchar(20) NOT NULL,
  `precio_venta` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`prd_cod`),
  KEY `producto_FKIndex1` (`mar_cod`),
  KEY `producto_FKIndex2` (`unid_cod`),
  KEY `producto_FKIndex3` (`presen_cod`),
  KEY `producto_FKIndex4` (`tip_prd_cod`),
  CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`mar_cod`) REFERENCES `marcas` (`mar_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `producto_ibfk_3` FOREIGN KEY (`presen_cod`) REFERENCES `presentacion` (`presen_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `producto_ibfk_4` FOREIGN KEY (`tip_prd_cod`) REFERENCES `tipo_producto` (`tip_prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `producto_ibfk_5` FOREIGN KEY (`unid_cod`) REFERENCES `unidad_medida` (`unid_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `producto` */

insert  into `producto`(`prd_cod`,`tip_prd_cod`,`presen_cod`,`mar_cod`,`unid_cod`,`descripcion`,`costo`,`iva`,`estado`,`barra`,`precio_venta`) values 
(1,1,1,1,1,'PANHAL HUGGIES XXXL X 18',1000,2,1,'784005200336',60000),
(2,1,1,1,1,'ACEITE DE GIRASOL NATURA 900 ML',1000,1,1,'784005800325',7000),
(3,1,1,1,1,'DULCE DE LECHE LIGHT',2500,3,1,'784002000012',6500),
(4,1,1,1,1,'CAFE BELEN CLASICO 100 GS',11000,1,1,'7840029101042',16000),
(5,1,1,1,1,'JABON EN POLVO OMO 500 GR',12000,1,1,'784005800123',15000),
(6,1,1,1,1,'durrr',5000,1,1,'123',3000),
(7,1,1,1,1,'HUEVO PLANCHA 36 UND',15000,1,1,'1234',20000),
(8,1,1,1,1,'TALCO POLYANA 125 GR',4500,1,1,'7840073125018',7500),
(9,1,1,1,1,'ESPIRAL MATIRIS TRADICIONAL 12 UND',2500,1,1,'7840001001001',5000),
(10,1,1,1,1,'ACONDICIONADOR BALLERINA PALTA 750 ML',6000,1,1,'7804920002587',11000),
(11,1,1,1,1,'ACEITE CAREY ALMENDRAS 60 ML',8000,1,1,'7840508017055',12000),
(12,1,1,1,1,'AZUCAR BOSLA 5 KG',15000,1,1,'1',20000);

/*Table structure for table `proveedor` */

DROP TABLE IF EXISTS `proveedor`;

CREATE TABLE `proveedor` (
  `provee_cod` int(11) NOT NULL,
  `ciu_cod` int(11) NOT NULL,
  `provee_nom` varchar(40) NOT NULL,
  `provee_ruc` varchar(15) NOT NULL,
  `provee_dir` varchar(100) NOT NULL,
  `provee_tel` varchar(15) NOT NULL,
  `prove_mail` varchar(60) NOT NULL,
  `prove_est` varchar(10) NOT NULL,
  PRIMARY KEY (`provee_cod`),
  KEY `proveedor_FKIndex1` (`ciu_cod`),
  CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`ciu_cod`) REFERENCES `ciudad` (`ciu_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `proveedor` */

insert  into `proveedor`(`provee_cod`,`ciu_cod`,`provee_nom`,`provee_ruc`,`provee_dir`,`provee_tel`,`prove_mail`,`prove_est`) values 
(1,1,'UNILEVER DE PARAGUAY','80016093-7','PERUPI','021123456','edu@avila.com.py','1'),
(2,1,'ESTANDAR','80016093-7','PERUPI','021123456','edu@avila.com.py','1');

/*Table structure for table `proveedores` */

DROP TABLE IF EXISTS `proveedores`;

CREATE TABLE `proveedores` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `ruc` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `proveedores` */

insert  into `proveedores`(`id`,`descripcion`,`direccion`,`ruc`,`telefono`,`estado`) values 
(1,'PROVEEDOR GENERICO','NN','0','0',1);

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `depo_cod` int(11) NOT NULL,
  `prd_cod` int(11) NOT NULL,
  `stock_min` int(11) NOT NULL,
  `stock_max` int(11) NOT NULL,
  `stock_cant` int(11) NOT NULL,
  PRIMARY KEY (`depo_cod`,`prd_cod`),
  KEY `stock_FKIndex2` (`prd_cod`),
  CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`depo_cod`) REFERENCES `deposito` (`depo_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`prd_cod`) REFERENCES `producto` (`prd_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

/*Table structure for table `stock_productos` */

DROP TABLE IF EXISTS `stock_productos`;

CREATE TABLE `stock_productos` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `plu_producto` varchar(14) NOT NULL,
  `disponible` bigint(20) NOT NULL,
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`id`,`id_producto`,`plu_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock_productos` */

insert  into `stock_productos`(`id`,`id_producto`,`plu_producto`,`disponible`,`estado`) values 
(1,1,'784005200336',0,1),
(2,2,'784005800325',29,1),
(3,3,'784002000012',0,1),
(4,5,'5',-15,1),
(5,6,'6',7950,1),
(6,7,'7',-14,1),
(7,8,'8',-67,1),
(8,9,'9',-2,1),
(9,10,'10',-1,1),
(10,11,'11',-1,1),
(11,12,'12',0,1),
(12,12,'12',0,1);

/*Table structure for table `sucursal` */

DROP TABLE IF EXISTS `sucursal`;

CREATE TABLE `sucursal` (
  `suc_cod` int(11) NOT NULL,
  `suc_desc` varchar(60) NOT NULL,
  `suc_est` varchar(10) NOT NULL,
  PRIMARY KEY (`suc_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sucursal` */

insert  into `sucursal`(`suc_cod`,`suc_desc`,`suc_est`) values 
(1,'CENTRAL','1'),
(2,'ASUNCION','1'),
(3,'SAN LORENZO','1');

/*Table structure for table `timbrado` */

DROP TABLE IF EXISTS `timbrado`;

CREATE TABLE `timbrado` (
  `id` int(11) NOT NULL,
  `nro_timbrado` varchar(30) NOT NULL,
  `inicio_timbrado` date NOT NULL,
  `vencim_timbrado` date NOT NULL,
  `id_sucursal` int(11) NOT NULL,
  `canti_fact_hab` int(11) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `timbrado` */

insert  into `timbrado`(`id`,`nro_timbrado`,`inicio_timbrado`,`vencim_timbrado`,`id_sucursal`,`canti_fact_hab`,`estado`) values 
(1,'12983586','2019-09-24','2020-09-24',1,2000,1);

/*Table structure for table `tipo_producto` */

DROP TABLE IF EXISTS `tipo_producto`;

CREATE TABLE `tipo_producto` (
  `tip_prd_cod` int(11) NOT NULL,
  `tip_prd_dec` varchar(60) NOT NULL,
  `tip_prd_est` varchar(10) NOT NULL,
  PRIMARY KEY (`tip_prd_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_producto` */

insert  into `tipo_producto`(`tip_prd_cod`,`tip_prd_dec`,`tip_prd_est`) values 
(1,'PARA VENTA','0'),
(2,'INSUMOS','1'),
(3,'ERE EREA','1'),
(4,'LO QUE SEA','1');

/*Table structure for table `tipo_venta` */

DROP TABLE IF EXISTS `tipo_venta`;

CREATE TABLE `tipo_venta` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_venta` */

/*Table structure for table `unidad_medida` */

DROP TABLE IF EXISTS `unidad_medida`;

CREATE TABLE `unidad_medida` (
  `unid_cod` int(11) NOT NULL,
  `unid_desc` varchar(20) NOT NULL,
  `unid_est` varchar(10) NOT NULL,
  PRIMARY KEY (`unid_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unidad_medida` */

insert  into `unidad_medida`(`unid_cod`,`unid_desc`,`unid_est`) values 
(1,'UNIDAD','ACTIVO'),
(2,'LITROS','ACTIVO'),
(3,'GRAMO','ACTIVO');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `usu_cod` int(11) NOT NULL,
  `func_cod` int(11) NOT NULL,
  `usu_nomb` varchar(20) NOT NULL,
  `usu_pass` varchar(20) NOT NULL,
  `usu_nivel` varchar(1) NOT NULL,
  `usu_estado` int(20) NOT NULL DEFAULT '1',
  PRIMARY KEY (`usu_cod`),
  KEY `usuario_FKIndex1` (`func_cod`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`usu_cod`,`func_cod`,`usu_nomb`,`usu_pass`,`usu_nivel`,`usu_estado`) values 
(1,1,'ADMIN','123','1',1),
(6,2,'EAVILA','123456','2',1);

/*Table structure for table `usuario_sucursal` */

DROP TABLE IF EXISTS `usuario_sucursal`;

CREATE TABLE `usuario_sucursal` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_sucursal` int(11) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario_sucursal` */

insert  into `usuario_sucursal`(`id`,`id_usuario`,`id_sucursal`,`estado`) values 
(1,1,1,1),
(2,1,2,2);

/*Table structure for table `vehiculo` */

DROP TABLE IF EXISTS `vehiculo`;

CREATE TABLE `vehiculo` (
  `vehi_cod` int(11) NOT NULL,
  `mar_cod` int(11) NOT NULL,
  `chapa` varchar(12) NOT NULL,
  `nro_motor` varchar(20) NOT NULL,
  `chasis` varchar(20) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `nro_vehi` int(10) unsigned NOT NULL,
  `modelo` varchar(20) NOT NULL,
  PRIMARY KEY (`vehi_cod`),
  KEY `mar_cod` (`mar_cod`),
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`mar_cod`) REFERENCES `marcas` (`mar_cod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vehiculo` */

/* Trigger structure for table `detalle_compras` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `ACTUALIZA_COMPRAS` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `ACTUALIZA_COMPRAS` AFTER INSERT ON `detalle_compras` FOR EACH ROW BEGIN
    
  UPDATE STOCK_PRODUCTOS
  SET STOCK_PRODUCTOS.DISPONIBLE = STOCK_PRODUCTOS.DISPONIBLE + NEW.CANTIDAD
  WHERE STOCK_PRODUCTOS.ID_PRODUCTO = NEW.ID_PRODUCTO;

    END */$$


DELIMITER ;

/* Trigger structure for table `detalle_ventas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `ACTUALIZA_STOCK` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `ACTUALIZA_STOCK` AFTER INSERT ON `detalle_ventas` FOR EACH ROW BEGIN
    
  Update STOCK_PRODUCTOS
  set STOCK_PRODUCTOS.DISPONIBLE = STOCK_PRODUCTOS.DISPONIBLE - NEW.CANTIDAD
  where STOCK_PRODUCTOS.ID_PRODUCTO = NEW.ID_PRODUCTO;

    END */$$


DELIMITER ;

/* Procedure structure for procedure `P_cuotas` */

/*!50003 DROP PROCEDURE IF EXISTS  `P_cuotas` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `P_cuotas`(IN cancuo INT, IN nro INT,IN monto INT,IN interva INT,IN fecha DATE)
BEGIN

       DECLARE vcto DATE;

       DECLARE cant INT;

       DECLARE mcuota INT;

    

       SET vcto = fecha ;

       SET cant   = 1;

       SET mcuota = monto / cancuo;

       WHILE cant <= cancuo DO

     IF interva = 30 THEN

         SELECT DATE_ADD(vcto,INTERVAL 1 MONTH)  INTO vcto;

     ELSE

        SELECT DATE_ADD(vcto,INTERVAL interva DAY)  INTO vcto;

     END IF;

    

    INSERT INTO cuentas_a_pagar(cuent_cod,rg_fac_cod,monto,vencim,estado) VALUES(cant,nro,mcuota,vcto,'pendiente');

    

     SET cant = cant  + 1 ;

       END WHILE;

    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
