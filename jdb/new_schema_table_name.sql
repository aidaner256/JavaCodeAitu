-- MySQL dump 10.13  Distrib 8.0.36, for macos14 (arm64)
--
-- Host: 127.0.0.1    Database: new_schema
-- ------------------------------------------------------
-- Server version	8.3.0

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
-- Table structure for table `table_name`
--

DROP TABLE IF EXISTS `table_name`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_name` (
  `bank_name` varchar(255) DEFAULT NULL,
  `branch_name` varchar(255) DEFAULT NULL,
  `deposit_user` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `id` int DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_name`
--

LOCK TABLES `table_name` WRITE;
/*!40000 ALTER TABLE `table_name` DISABLE KEYS */;
INSERT INTO `table_name` VALUES ('Alpha','Astana','AidanY','Aidan',1,10700.00),('Kaspi','Almaty','DumaI','Dima',NULL,700.00),('Kaspi','Almaty','DumaI','Dima',2,700.00),('Alpha','Astana','AidarK','Aidar',3,1000.00),('Halyk','Shymkent','DaniyaraS','Daniyar',4,1500.00),('ForteBank','Karaganda','BakytK','Bakyt',5,2000.00),('Jysan Bank','Atyrau','AliyaT','Aliya',6,2500.00),('Bank RBK','Aktau','ArmanA','Arman',7,3000.00),('First Heartland Bank','Kostanay','GulmiraK','Gulmira',8,3500.00),('TSB Bank','Pavlodar','BeibitA','Beibit',9,4000.00),('Nomad Bank','Kyzylorda','DinaraS','Dinara',10,4500.00),('Sberbank','Oskemen','ZarinaK','Zarina',11,5000.00),('Kaspi','Almaty','DDaniyar','Daniyar',3,1000.00);
/*!40000 ALTER TABLE `table_name` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-27 21:13:08
