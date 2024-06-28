-- SQLINES DEMO ***  Distrib 8.0.36, for Win64 (x86_64)
--
-- SQLINES DEMO ***   Database: siap_psgi_dev
-- SQLINES DEMO *** -------------------------------------
-- SQLINES DEMO *** 0.36

/* SQLINES DEMO *** ARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/* SQLINES DEMO *** ARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/* SQLINES DEMO *** LLATION_CONNECTION=@@COLLATION_CONNECTION */;
/* SQLINES DEMO *** tf8 */;
/* SQLINES DEMO *** ME_ZONE=@@TIME_ZONE */;
/* SQLINES DEMO *** NE='+00:00' */;
/* SQLINES DEMO *** IQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/* SQLINES DEMO *** REIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/* SQLINES DEMO *** L_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/* SQLINES DEMO *** L_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- SQLINES DEMO *** or table `demarcacion`
--

DROP TABLE IF EXISTS demarcacion;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE demarcacion (
  id_demarcacion bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  dt_fecha_creacion varchar(255) DEFAULT NULL,
  dt_fecha_fin_vigencia varchar(255) DEFAULT NULL,
  dt_fecha_inicio_vigencia varchar(255) DEFAULT NULL,
  in_estado varchar(255) DEFAULT NULL,
  vc_codigo varchar(255) DEFAULT NULL,
  vc_descripcion varchar(255) DEFAULT NULL,
  vc_usuario_creacion varchar(255) DEFAULT NULL,
  vc_usuario_modificacion varchar(255) DEFAULT NULL,
  PRIMARY KEY (id_demarcacion)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `demarcacion`
--

----LOCK TABLES demarcacion WRITE;
/* SQLINES DEMO ***  `demarcacion` DISABLE KEYS */;
/* SQLINES DEMO ***  `demarcacion` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `division`
--

DROP TABLE IF EXISTS division;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE division (
  limite_maximo int NOT NULL,
  limite_minimo int NOT NULL,
  codigo_division bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_division)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `division`
--

----LOCK TABLES division WRITE;
/* SQLINES DEMO ***  `division` DISABLE KEYS */;
/* SQLINES DEMO ***  `division` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `estado_miembro`
--

DROP TABLE IF EXISTS estado_miembro;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE estado_miembro (
  codigo_estado bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  tipo_estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_estado)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `estado_miembro`
--

----LOCK TABLES estado_miembro WRITE;
/* SQLINES DEMO ***  `estado_miembro` DISABLE KEYS */;
/* SQLINES DEMO ***  `estado_miembro` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `ingre_salida`
--

DROP TABLE IF EXISTS ingre_salida;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE ingre_salida (
  codigo_insal bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  tipo_estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_insal)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `ingre_salida`
--

----LOCK TABLES ingre_salida WRITE;
/* SQLINES DEMO ***  `ingre_salida` DISABLE KEYS */;
/* SQLINES DEMO ***  `ingre_salida` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `maestro_psgi`
--

DROP TABLE IF EXISTS maestro_psgi;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE maestro_psgi (
  id_persona int DEFAULT NULL,
  vc_ape_paterno text,
  vc_ape_materno text,
  vc_nombres text,
  id_dg_sexo bigint DEFAULT NULL,
  id_dg_tipo_documento bigint DEFAULT NULL,
  vc_nro_documento text,
  dt_fecha_nacimiento timestamp(6) DEFAULT NULL,
  vc_centro_trabajo text,
  vc_direccion_trabajo text,
  vc_telefono_trabajo text,
  vc_celular_trabajo text,
  id_pais bigint DEFAULT NULL,
  vc_lugar_nacimiento text,
  id_dg_estado_civil bigint DEFAULT NULL,
  dt_fecha_matrimonio timestamp(6) DEFAULT NULL,
  id_dg_grado_instruccion bigint DEFAULT NULL,
  id_profesion bigint DEFAULT NULL,
  vc_nombre_completo text,
  vc_telefono text,
  vc_celular text,
  vc_email text,
  vc_codigo text,
  dt_fecha_fallecimiento timestamp(6) DEFAULT NULL,
  bt_fallecimiento int DEFAULT NULL,
  in_estado int DEFAULT NULL,
  vc_usuario_creacion text,
  dt_fecha_creacion timestamp(6) DEFAULT NULL,
  vc_usuario_modificacion text,
  dt_fecha_modificacion timestamp(6) DEFAULT NULL,
  vc_nro_tipodocumento varchar(255) DEFAULT NULL,
  id_dg_tipodocumento bigint DEFAULT NULL
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `maestro_psgi`
--

----LOCK TABLES maestro_psgi WRITE;
/* SQLINES DEMO ***  `maestro_psgi` DISABLE KEYS */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
INSERT INTO maestro_psgi VALUES (1,'SIN TITULAR','SIN TITULAR','SIN TITULAR',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'SIN TITULAR SIN TITULAR, SIN TITULAR',NULL,NULL,NULL,'ST000',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),(2,'RESPONSABLE','PAIS','PERU',1,16,'',NULL,'','','','',1,'',29,NULL,36,NULL,'RESPONSABLE PAIS, PERU','','','',NULL,NULL,0,1,NULL,NULL,'CC','2013-06-10 09:19:16.780000',NULL,NULL),(3,'ASIN','RUEDA DE ESPINOZA','ALBERTA FORTUNATA',0,NULL,'','1941-04-28 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'ASIN RUEDA DE ESPINOZA, ALBERTA FORTUNATA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.083000','GCI','2015-09-13 10:30:31.210000',NULL,NULL),(4,'ATOCHE','DE CORNEJO','GLADYS GUILLERMINA',NULL,NULL,'','1900-01-01 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,NULL,'1900-01-01 00:00:00.000000',NULL,NULL,'ATOCHE DE CORNEJO, GLADYS GUILLERMINA','','',NULL,NULL,NULL,0,0,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:45:43.430000',NULL,NULL),(5,'CAMACHO','GUILLEN','AURELIO',0,16,'25512470','1949-01-21 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',34,0,'CAMACHO GUILLEN, AURELIO','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:49:42.577000',NULL,NULL),(6,'CRUZ','RODRIGUEZ','MERCEDES',0,16,'25589529','1933-04-03 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'CRUZ RODRIGUEZ, MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-07-07 19:47:43.187000',NULL,NULL),(7,'DAVILA','CARDENAS','VERITA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'DAVILA CARDENAS, VERITA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-09-13 10:52:21.733000',NULL,NULL),(8,'DESOUSA','FERREIRA DE CALDERON','ISABEL CORINA',NULL,NULL,'','1900-01-01 00:00:00.000000',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1900-01-01 00:00:00.000000',NULL,NULL,'DESOUSA FERREIRA DE CALDERON, ISABEL CORINA','','',NULL,NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000',NULL,NULL,NULL,NULL),(9,'ESPINOZA','REYES','JUANA ANTONIETA',2,16,'25697746','1953-09-28 00:00:00.000000','','','','',1,'',29,NULL,36,0,'ESPINOZA REYES, JUANA ANTONIETA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2016-05-15 10:47:20.620000',NULL,NULL),(10,'FIESTAS','LLENQUE','WILMER HUGO',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'FIESTAS LLENQUE, WILMER HUGO','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','GCI','2015-07-07 20:01:22.157000',NULL,NULL),(11,'FRANCO','MARTINEZ','JORGE',0,16,'25484418','1938-09-07 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',36,0,'FRANCO MARTINEZ, JORGE','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.183000','VS','2019-01-05 21:04:41.837000',NULL,NULL),(12,'GODOS','VINCES','DANIEL PEDRO',0,16,'25611206','1942-10-02 00:00:00.000000','','','','',1,'',28,NULL,34,0,'GODOS VINCES, DANIEL PEDRO','','','',NULL,'2008-12-30 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.187000','CC','2015-10-03 16:03:54.523000',NULL,NULL),(13,'GODOS','VIUDA DE OLAYA','NORMA',0,16,'25598914','1940-08-10 00:00:00.000000','','','','',1,'',30,NULL,33,0,'GODOS VIUDA DE OLAYA, NORMA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 10:54:56.757000',NULL,NULL),(14,'KOSAKA','FLORES','JUANA MERCEDES',NULL,16,'06051851','1955-06-27 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,28,'1900-01-01 00:00:00.000000',36,NULL,'KOSAKA FLORES, JUANA MERCEDES','','',NULL,NULL,NULL,0,0,'PRECARGA','2014-11-02 10:55:38.187000','CC','2015-09-19 12:03:54.467000',NULL,NULL),(15,'MORENO','CRUZ','MAGDALENA',0,16,'25623399','1952-09-18 00:00:00.000000','','','','',1,'',28,NULL,36,0,'MORENO CRUZ, MAGDALENA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:02:05.243000',NULL,NULL),(16,'MUÃ‘OZ','GONZALES','LUCERO VANESSA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'MUÃ‘OZ GONZALES, LUCERO VANESSA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 19:57:54.217000',NULL,NULL),(17,'OLAVARRIA','SEGURA','EUGENIA MERCEDES',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'OLAVARRIA SEGURA, EUGENIA MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 19:59:27.713000',NULL,NULL),(18,'PEREZ','CONDOR','ISABEL NELLY',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'PEREZ CONDOR, ISABEL NELLY','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:37:20.380000',NULL,NULL),(19,'RAMOS','DE PERALTA','VICTORIA CECILIA',0,16,'25619315','1953-11-24 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',34,0,'RAMOS DE PERALTA, VICTORIA CECILIA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2017-04-23 09:29:41.110000',NULL,NULL),(20,'SOTELO','LECCA','ROSA LUZ',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'SOTELO LECCA, ROSA LUZ','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-10-18 12:43:27.243000',NULL,NULL),(21,'THORNE','DE RAMIREZ','MERCEDES',0,16,'25607387','1936-09-20 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'THORNE DE RAMIREZ, MERCEDES','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:05:22.070000',NULL,NULL),(22,'ASENCIO','MAZZA DE LAVALLE','MARIA ANTONIA',0,16,'25600937','1946-07-05 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'ASENCIO MAZZA DE LAVALLE, MARIA ANTONIA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:05:56.410000',NULL,NULL),(23,'AYALA','GUTIERREZ','EDGAR',1,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',29,NULL,NULL,0,'AYALA GUTIERREZ, EDGAR','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:06:01.613000',NULL,NULL),(24,'CALLA','DE FERNANDEZ','NIEVES',2,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'CALLA DE FERNANDEZ, NIEVES','','','',NULL,'2014-08-23 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:51:37.153000',NULL,NULL),(25,'CASTRO','DE MONROY','FORTUNATA',NULL,16,'25596083','1942-02-10 00:00:00.000000',NULL,NULL,NULL,NULL,1,NULL,29,'1900-01-01 00:00:00.000000',33,NULL,'CARLOS DE MONROY, FORTUNATA','','',NULL,NULL,NULL,1,1,'PRECARGA','2014-11-02 10:55:38.187000',NULL,NULL,NULL,NULL),(26,'CASTRO','DE ROBLES','ARMINDA',0,16,'25616779','1930-07-11 00:00:00.000000','','','','',1,'',29,'1900-01-01 00:00:00.000000',33,0,'CASTRO DE ROBLES, ARMINDA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-09-13 11:06:43.397000',NULL,NULL),(27,'CASTRO','FERNANDEZ','JHON MICHAEL',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'CASTRO FERNANDEZ, JHON MICHAEL','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.187000','GCI','2015-07-07 20:08:30.123000',NULL,NULL),(28,'CHUNGA','OCHOA','ELOY EDUARDO',1,16,'25696638','1952-07-10 00:00:00.000000','','','','',1,'CALLAO',30,NULL,35,2,'CHUNGA OCHOA, ELOY EDUARDO','4543003','997 040 572','EDUARDO_CHUNGA@HOTMAIL.COM',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2018-11-01 17:01:31.543000',NULL,NULL),(29,'ECA','FIESTAS','JOSE LUIS',0,16,'06448433','1964-05-31 00:00:00.000000','MUSICO','','','',1,'',28,NULL,36,0,'ECA FIESTAS, JOSE LUIS','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','VS','2017-05-15 20:42:18.257000',NULL,NULL),(30,'FAJARDO','CARDENAS','MIRYAN SUSAN',2,16,'25858000','1978-09-18 00:00:00.000000','','','','',1,'',28,NULL,36,0,'FAJARDO CARDENAS, MIRYAN SUSAN','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','CC2','2022-09-06 12:46:20.613000',NULL,NULL),(31,'FIESTAS','AGURTO','MERILYN ELIZABETH',0,NULL,'','1900-01-01 00:00:00.000000','','','','',NULL,'',NULL,NULL,NULL,0,'FIESTAS AGURTO, MERILYN ELIZABETH','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2015-09-19 10:58:15.903000',NULL,NULL),(32,'GUEVARA','QUISPE','VICTORIA JUANA',0,NULL,'','1900-01-01 00:00:00.000000','','','','',1,'',NULL,NULL,NULL,0,'GUEVARA QUISPE, VICTORIA JUANA','','','',NULL,'2015-01-01 00:00:00.000000',1,1,'PRECARGA','2014-11-02 10:55:38.190000','GCI','2015-09-13 11:15:53.213000',NULL,NULL),(33,'LOPEZ','TUESTA','ROSA ELVA',2,16,'09077826','1961-08-20 00:00:00.000000','','','','',1,'',28,NULL,NULL,0,'LOPEZ TUESTA, ROSA ELVA','','','',NULL,NULL,0,1,'PRECARGA','2014-11-02 10:55:38.190000','CC2','2022-09-06 13:10:57.970000',NULL,NULL);
/* SQLINES DEMO ***  `maestro_psgi` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `nivel_educativo`
--

DROP TABLE IF EXISTS nivel_educativo;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE nivel_educativo (
  codigo_educ bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_educ)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `nivel_educativo`
--

----LOCK TABLES nivel_educativo WRITE;
/* SQLINES DEMO ***  `nivel_educativo` DISABLE KEYS */;
/* SQLINES DEMO ***  `nivel_educativo` ENABLE KEYS */;
--UN--LOCK TABLES;

--
-- SQLINES DEMO *** or table `profesion`
--

DROP TABLE IF EXISTS profesion;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE profesion (
  codigo_profesion bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_profesion)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `profesion`
--

----LOCK TABLES profesion WRITE;
/* SQLINES DEMO ***  `profesion` DISABLE KEYS */;
/* SQLINES DEMO ***  `profesion` ENABLE KEYS */;
--UN----LOCK TABLES;

--
-- SQLINES DEMO *** or table `rol`
--

DROP TABLE IF EXISTS rol;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE rol (
  codigo_rol bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  PRIMARY KEY (codigo_rol)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `rol`
--

----LOCK TABLES rol WRITE;
/* SQLINES DEMO ***  `rol` DISABLE KEYS */;
/* SQLINES DEMO ***  `rol` ENABLE KEYS */;
--UNLOCK TABLES;

--
-- SQLINES DEMO *** or table `tipo_documento`
--

DROP TABLE IF EXISTS tipo_documento;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE tipo_documento (
  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  descripcion varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  tipo_documento varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT UK_g8yb0i98c7vn0ry2i9klvxolx UNIQUE (descripcion),
  CONSTRAINT UK_6mar96yv8281yooclfurf9rm5 UNIQUE  (tipo_documento)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `tipo_documento`
--

--LOCK TABLES tipo_documento WRITE;
/* SQLINES DEMO ***  `tipo_documento` DISABLE KEYS */;
/* SQLINES DEMO ***  `tipo_documento` ENABLE KEYS */;
--UNLOCK TABLES;

--
-- SQLINES DEMO *** or table `ubigeo_psgi`
--

DROP TABLE IF EXISTS ubigeo_psgi;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE ubigeo_psgi (
  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  codigo_area varchar(255) DEFAULT NULL,
  codigo_grupo varchar(255) DEFAULT NULL,
  codigo_region varchar(255) DEFAULT NULL,
  codigo_sector varchar(255) DEFAULT NULL,
  codigo_zona varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  nombre varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `ubigeo_psgi`
--

--LOCK TABLES ubigeo_psgi WRITE;
/* SQLINES DEMO ***  `ubigeo_psgi` DISABLE KEYS */;
/* SQLINES DEMO ***  `ubigeo_psgi` ENABLE KEYS */;
--UNLOCK TABLES;

--
-- SQLINES DEMO *** or table `ubigeo_reniec`
--

DROP TABLE IF EXISTS ubigeo_reniec;
/* SQLINES DEMO *** cs_client     = @@character_set_client */;
/* SQLINES DEMO *** er_set_client = utf8mb4 */;
-- SQLINES LICENSE FOR EVALUATION USE ONLY
CREATE TABLE ubigeo_reniec (
  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
  departamento varchar(255) DEFAULT NULL,
  distrito varchar(255) DEFAULT NULL,
  estado varchar(255) DEFAULT NULL,
  ndepartamento varchar(255) DEFAULT NULL,
  ndistrito varchar(255) DEFAULT NULL,
  nprovincia varchar(255) DEFAULT NULL,
  provincia varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ;
/* SQLINES DEMO *** er_set_client = @saved_cs_client */;

--
-- SQLINES DEMO *** table `ubigeo_reniec`
--

--LOCK TABLES ubigeo_reniec WRITE;
/* SQLINES DEMO ***  `ubigeo_reniec` DISABLE KEYS */;
/* SQLINES DEMO ***  `ubigeo_reniec` ENABLE KEYS */;
--UNLOCK TABLES;
/* SQLINES DEMO *** NE=@OLD_TIME_ZONE */;

/* SQLINES DEMO *** E=@OLD_SQL_MODE */;
/* SQLINES DEMO *** _KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/* SQLINES DEMO *** CHECKS=@OLD_UNIQUE_CHECKS */;
/* SQLINES DEMO *** ER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/* SQLINES DEMO *** ER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/* SQLINES DEMO *** ON_CONNECTION=@OLD_COLLATION_CONNECTION */;
/* SQLINES DEMO *** ES=@OLD_SQL_NOTES */;

-- SQLINES DEMO ***  2024-06-28  8:12:00
