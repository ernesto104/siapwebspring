-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: siap_psgi_dev
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `demarcacion`
--

DROP TABLE IF EXISTS `demarcacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `demarcacion` (
  `id_demarcacion` bigint NOT NULL AUTO_INCREMENT,
  `dt_fecha_creacion` varchar(255) DEFAULT NULL,
  `dt_fecha_fin_vigencia` varchar(255) DEFAULT NULL,
  `dt_fecha_inicio_vigencia` varchar(255) DEFAULT NULL,
  `in_estado` varchar(255) DEFAULT NULL,
  `vc_codigo` varchar(255) DEFAULT NULL,
  `vc_descripcion` varchar(255) DEFAULT NULL,
  `vc_usuario_creacion` varchar(255) DEFAULT NULL,
  `vc_usuario_modificacion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_demarcacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demarcacion`
--

LOCK TABLES `demarcacion` WRITE;
/*!40000 ALTER TABLE `demarcacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `demarcacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `division`
--

DROP TABLE IF EXISTS `division`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `division` (
  `limite_maximo` int NOT NULL,
  `limite_minimo` int NOT NULL,
  `codigo_division` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_division`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `division`
--

LOCK TABLES `division` WRITE;
/*!40000 ALTER TABLE `division` DISABLE KEYS */;
/*!40000 ALTER TABLE `division` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_miembro`
--

DROP TABLE IF EXISTS `estado_miembro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_miembro` (
  `codigo_estado` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `tipo_estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_estado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_miembro`
--

LOCK TABLES `estado_miembro` WRITE;
/*!40000 ALTER TABLE `estado_miembro` DISABLE KEYS */;
/*!40000 ALTER TABLE `estado_miembro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingre_salida`
--

DROP TABLE IF EXISTS `ingre_salida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingre_salida` (
  `codigo_insal` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `tipo_estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_insal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingre_salida`
--

LOCK TABLES `ingre_salida` WRITE;
/*!40000 ALTER TABLE `ingre_salida` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingre_salida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maestro_psgi`
--

DROP TABLE IF EXISTS `maestro_psgi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maestro_psgi` (
  `id_persona` int DEFAULT NULL,
  `vc_ape_paterno` text,
  `vc_ape_materno` text,
  `vc_nombres` text,
  `id_dg_sexo` bigint DEFAULT NULL,
  `id_dg_tipo_documento` bigint DEFAULT NULL,
  `vc_nro_documento` text,
  `dt_fecha_nacimiento` datetime(6) DEFAULT NULL,
  `vc_centro_trabajo` text,
  `vc_direccion_trabajo` text,
  `vc_telefono_trabajo` text,
  `vc_celular_trabajo` text,
  `id_pais` bigint DEFAULT NULL,
  `vc_lugar_nacimiento` text,
  `id_dg_estado_civil` bigint DEFAULT NULL,
  `dt_fecha_matrimonio` datetime(6) DEFAULT NULL,
  `id_dg_grado_instruccion` bigint DEFAULT NULL,
  `id_profesion` bigint DEFAULT NULL,
  `vc_nombre_completo` text,
  `vc_telefono` text,
  `vc_celular` text,
  `vc_email` text,
  `vc_codigo` text,
  `dt_fecha_fallecimiento` datetime(6) DEFAULT NULL,
  `bt_fallecimiento` int DEFAULT NULL,
  `in_estado` int DEFAULT NULL,
  `vc_usuario_creacion` text,
  `dt_fecha_creacion` datetime(6) DEFAULT NULL,
  `vc_usuario_modificacion` text,
  `dt_fecha_modificacion` datetime(6) DEFAULT NULL,
  `vc_nro_tipodocumento` varchar(255) DEFAULT NULL,
  `id_dg_tipodocumento` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maestro_psgi`
--

LOCK TABLES `maestro_psgi` WRITE;
/*!40000 ALTER TABLE `maestro_psgi` DISABLE KEYS */;
INSERT INTO `maestro_psgi` VALUES (1,'SIN TITULAR','SIN TITULAR','SIN TITULAR',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'SIN TITULAR SIN TITULAR, SIN TITULAR',NULL,NULL,NULL,'ST000',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),(2,'RESPONSABLE','PAIS','PERU',1,16,'',NULL,'','','','',1,'',29,NULL,36,NULL,'RESPONSABLE PAIS, PERU','','','',NULL,NULL,0,1,NULL,NULL,'CC','2013-06-10 09:19:16.780000',NULL,NULL),(3,'ASIN','RUEDA DE ESPINOZA','ALBERTA FORTUNATA',0,NULL,'','1941-04-28 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'ASIN RUEDA DE ESPINOZA, ALBERTA FORTUNATA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.083000','GCI','2015-09-13 10:30:31.210000',NULL,NULL),(4,'ATOCHE','DE CORNEJO','GLADYS GUILLERMINA',NULL,NULL,'','1900-01-01 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,NULL,'1900-01-01 00:00:00.000000',NULL,NULL,'ATOCHE DE CORNEJO, GLADYS GUILLERMINA','','',NULL,NULL,NULL,0,0,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:45:43.430000',NULL,NULL),(5,'CAMACHO','GUILLEN','AURELIO',0,16,'25512470','1949-01-21 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',34,0,'CAMACHO GUILLEN, AURELIO','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:49:42.577000',NULL,NULL),(6,'CRUZ','RODRIGUEZ','MERCEDES',0,16,'25589529','1933-04-03 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'CRUZ RODRIGUEZ, MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-07-07 19:47:43.187000',NULL,NULL),(7,'DAVILA','CARDENAS','VERITA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'DAVILA CARDENAS, VERITA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:52:21.733000',NULL,NULL),(8,'DESOUSA','FERREIRA DE CALDERON','ISABEL CORINA',NULL,NULL,'','1900-01-01 00:00:00.000000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1900-01-01 00:00:00.000000',NULL,NULL,'DESOUSA FERREIRA DE CALDERON, ISABEL CORINA','','',NULL,NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000',NULL,NULL,NULL,NULL),(9,'ESPINOZA','REYES','JUANA ANTONIETA',2,16,'25697746','1953-09-28 00:00:00.000000','','','','',1,'',29,NULL,36,0,'ESPINOZA REYES, JUANA ANTONIETA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2016-05-15 10:47:20.620000',NULL,NULL),(10,'FIESTAS','LLENQUE','WILMER HUGO',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'FIESTAS LLENQUE, WILMER HUGO','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-07-07 20:01:22.157000',NULL,NULL),(11,'FRANCO','MARTINEZ','JORGE',0,16,'25484418','1938-09-07 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',36,0,'FRANCO MARTINEZ, JORGE','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','VS','2019-01-05 21:04:41.837000',NULL,NULL),(12,'GODOS','VINCES','DANIEL PEDRO',0,16,'25611206','1942-10-02 00:00:00.000000','','','','',1,'',28,NULL,34,0,'GODOS VINCES, DANIEL PEDRO','','','',NULL,'2008-12-30 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.187000','CC','2015-10-03 16:03:54.523000',NULL,NULL),(13,'GODOS','VIUDA DE OLAYA','NORMA',0,16,'25598914','1940-08-10 00:00:00.000000','','','','',1,'',30,NULL,33,0,'GODOS VIUDA DE OLAYA, NORMA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 10:54:56.757000',NULL,NULL),(14,'KOSAKA','FLORES','JUANA MERCEDES',NULL,16,'06051851','1955-06-27 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,28,'1900-01-01 00:00:00.000000',36,NULL,'KOSAKA FLORES, JUANA MERCEDES','','',NULL,NULL,NULL,0,0,'PRECARGA','2014-11-02 10:55:38.187000','CC','2015-09-19 12:03:54.467000',NULL,NULL),(15,'MORENO','CRUZ','MAGDALENA',0,16,'25623399','1952-09-18 00:00:00.000000','','','','',1,'',28,NULL,36,0,'MORENO CRUZ, MAGDALENA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:02:05.243000',NULL,NULL),(16,'MUÃ‘OZ','GONZALES','LUCERO VANESSA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'MUÃ‘OZ GONZALES, LUCERO VANESSA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 19:57:54.217000',NULL,NULL),(17,'OLAVARRIA','SEGURA','EUGENIA MERCEDES',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'OLAVARRIA SEGURA, EUGENIA MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 19:59:27.713000',NULL,NULL),(18,'PEREZ','CONDOR','ISABEL NELLY',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'PEREZ CONDOR, ISABEL NELLY','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:37:20.380000',NULL,NULL),(19,'RAMOS','DE PERALTA','VICTORIA CECILIA',0,16,'25619315','1953-11-24 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',34,0,'RAMOS DE PERALTA, VICTORIA CECILIA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2017-04-23 09:29:41.110000',NULL,NULL),(20,'SOTELO','LECCA','ROSA LUZ',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'SOTELO LECCA, ROSA LUZ','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-10-18 12:43:27.243000',NULL,NULL),(21,'THORNE','DE RAMIREZ','MERCEDES',0,16,'25607387','1936-09-20 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'THORNE DE RAMIREZ, MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:05:22.070000',NULL,NULL),(22,'ASENCIO','MAZZA DE LAVALLE','MARIA ANTONIA',0,16,'25600937','1946-07-05 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'ASENCIO MAZZA DE LAVALLE, MARIA ANTONIA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:05:56.410000',NULL,NULL),(23,'AYALA','GUTIERREZ','EDGAR',1,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',29,NULL,NULL,0,'AYALA GUTIERREZ, EDGAR','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:06:01.613000',NULL,NULL),(24,'CALLA','DE FERNANDEZ','NIEVES',2,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'CALLA DE FERNANDEZ, NIEVES','','','',NULL,'2014-08-23 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:51:37.153000',NULL,NULL),(25,'CASTRO','DE MONROY','FORTUNATA',NULL,16,'25596083','1942-02-10 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,29,'1900-01-01 00:00:00.000000',33,NULL,'CARLOS DE MONROY, FORTUNATA','','',NULL,NULL,NULL,1,1,'PRECARGA','2014-11-02 10:55:38.187000',NULL,NULL,NULL,NULL),(26,'CASTRO','DE ROBLES','ARMINDA',0,16,'25616779','1930-07-11 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'CASTRO DE ROBLES, ARMINDA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:06:43.397000',NULL,NULL),(27,'CASTRO','FERNANDEZ','JHON MICHAEL',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'CASTRO FERNANDEZ, JHON MICHAEL','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:08:30.123000',NULL,NULL),(28,'CHUNGA','OCHOA','ELOY EDUARDO',1,16,'25696638','1952-07-10 00:00:00.000000','','','','',1,'CALLAO',30,NULL,35,2,'CHUNGA OCHOA, ELOY EDUARDO','4543003','997 040 572','EDUARDO_CHUNGA@HOTMAIL.COM',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2018-11-01 17:01:31.543000',NULL,NULL),(29,'ECA','FIESTAS','JOSE LUIS',0,16,'06448433','1964-05-31 00:00:00.000000','MUSICO','','','',1,'',28,NULL,36,0,'ECA FIESTAS, JOSE LUIS','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','VS','2017-05-15 20:42:18.257000',NULL,NULL),(30,'FAJARDO','CARDENAS','MIRYAN SUSAN',2,16,'25858000','1978-09-18 00:00:00.000000','','','','',1,'',28,NULL,36,0,'FAJARDO CARDENAS, MIRYAN SUSAN','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','CC2','2022-09-06 12:46:20.613000',NULL,NULL),(31,'FIESTAS','AGURTO','MERILYN ELIZABETH',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'FIESTAS AGURTO, MERILYN ELIZABETH','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2015-09-19 10:58:15.903000',NULL,NULL),(32,'GUEVARA','QUISPE','VICTORIA JUANA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'GUEVARA QUISPE, VICTORIA JUANA','','','',NULL,'2015-01-01 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2015-09-13 11:15:53.213000',NULL,NULL),(33,'LOPEZ','TUESTA','ROSA ELVA',2,16,'09077826','1961-08-20 00:00:00.000000','','','','',1,'',28,NULL,NULL,0,'LOPEZ TUESTA, ROSA ELVA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','CC2','2022-09-06 13:10:57.970000',NULL,NULL);
/*!40000 ALTER TABLE `maestro_psgi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel_educativo`
--

DROP TABLE IF EXISTS `nivel_educativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivel_educativo` (
  `codigo_educ` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_educ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel_educativo`
--

LOCK TABLES `nivel_educativo` WRITE;
/*!40000 ALTER TABLE `nivel_educativo` DISABLE KEYS */;
/*!40000 ALTER TABLE `nivel_educativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesion`
--

DROP TABLE IF EXISTS `profesion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesion` (
  `codigo_profesion` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_profesion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesion`
--

LOCK TABLES `profesion` WRITE;
/*!40000 ALTER TABLE `profesion` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `codigo_rol` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_documento`
--

DROP TABLE IF EXISTS `tipo_documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_documento` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `tipo_documento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_g8yb0i98c7vn0ry2i9klvxolx` (`descripcion`),
  UNIQUE KEY `UK_6mar96yv8281yooclfurf9rm5` (`tipo_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_documento`
--

LOCK TABLES `tipo_documento` WRITE;
/*!40000 ALTER TABLE `tipo_documento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_documento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubigeo_psgi`
--

DROP TABLE IF EXISTS `ubigeo_psgi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ubigeo_psgi` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `codigo_area` varchar(255) DEFAULT NULL,
  `codigo_grupo` varchar(255) DEFAULT NULL,
  `codigo_region` varchar(255) DEFAULT NULL,
  `codigo_sector` varchar(255) DEFAULT NULL,
  `codigo_zona` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubigeo_psgi`
--

LOCK TABLES `ubigeo_psgi` WRITE;
/*!40000 ALTER TABLE `ubigeo_psgi` DISABLE KEYS */;
/*!40000 ALTER TABLE `ubigeo_psgi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubigeo_reniec`
--

DROP TABLE IF EXISTS `ubigeo_reniec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ubigeo_reniec` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `departamento` varchar(255) DEFAULT NULL,
  `distrito` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `ndepartamento` varchar(255) DEFAULT NULL,
  `ndistrito` varchar(255) DEFAULT NULL,
  `nprovincia` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubigeo_reniec`
--

LOCK TABLES `ubigeo_reniec` WRITE;
/*!40000 ALTER TABLE `ubigeo_reniec` DISABLE KEYS */;
/*!40000 ALTER TABLE `ubigeo_reniec` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-28  8:12:00
