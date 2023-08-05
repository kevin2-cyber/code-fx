-- MySQL dump 10.13  Distrib 5.7.42, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pharmacy_sys
-- ------------------------------------------------------
-- Server version	5.7.42-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `drug`
--

DROP TABLE IF EXISTS drug;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE drug (
    `drugId` int(11) NOT NULL AUTO_INCREMENT,
    `drugName` varchar(45) NOT NULL,
    `drugQuantity` int(11) DEFAULT NULL,
    `manufacturer` varchar(45) NOT NULL,
    `dateAdded` datetime DEFAULT NULL,
    `price` int(11) DEFAULT NULL,
     PRIMARY KEY (`drugId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drug`
--

LOCK TABLES drug WRITE;
/*!40000 ALTER TABLE drug DISABLE KEYS */;
/*!40000 ALTER TABLE drug ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25  9:28:02

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS login;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE login (
    `userId` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
     PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES login WRITE;
/*!40000 ALTER TABLE login DISABLE KEYS */;
/*!40000 ALTER TABLE login ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25  9:28:01

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS patient;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE patient (
    `patientId` int(11) NOT NULL AUTO_INCREMENT,
    `patientName` varchar(45) NOT NULL,
    `prescription` varchar(45) NOT NULL,
    `quantityBought` int(11) NOT NULL,
    `dateBought` int(11) NOT NULL,
     PRIMARY KEY (`patientId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES patient WRITE;
/*!40000 ALTER TABLE patient DISABLE KEYS */;
/*!40000 ALTER TABLE patient ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25  9:28:01

--
-- Table structure for table `pharmacist`
--

DROP TABLE IF EXISTS pharmacist;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE pharmacist (
    `pharma_id` int(11) NOT NULL AUTO_INCREMENT,
    `phrama_name` varchar(45) NOT NULL,
    `No_prescriptionMade` int(11) NOT NULL,
     PRIMARY KEY (`pharma_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table pharmacist
--

LOCK TABLES pharmacist WRITE;
/*!40000 ALTER TABLE pharmacist DISABLE KEYS */;
/*!40000 ALTER TABLE pharmacist ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table signup
--

DROP TABLE IF EXISTS signup;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE signup (
    `userId` int(11) NOT NULL,
    `email` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
     PRIMARY KEY (`userId`),
     KEY `userId_idx` (`userId`),
     CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES login (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES signup WRITE;
/*!40000 ALTER TABLE signup DISABLE KEYS */;
/*!40000 ALTER TABLE signup ENABLE KEYS */;
UNLOCK TABLES;
