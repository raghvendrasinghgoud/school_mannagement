-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: school_mannagement
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `fname` varchar(40) NOT NULL,
  `lname` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mob` bigint NOT NULL,
  `image` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`email`),
  UNIQUE KEY `mob` (`mob`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('Raghvendra','Singh','Male','1999-09-13','Raghav@123','raghavendrasinghgoud@gmail.com',7089818436,'C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,IMG_20190208_1734197089818436.jpg'),('shudhanshu','singh','Male','2003-09-10','Shourya@123','shourya@gmail.com',9630065397,'C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,IMG_20190111_2017559630065397.jpg');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class` (
  `class_id` varchar(40) NOT NULL,
  `p_id` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `p_id` (`p_id`),
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES ('1st',NULL),('3rd',NULL),('4th',NULL),('5th',NULL),('6th',NULL),('7th',NULL),('null',NULL),('9th','T00130SS'),('10th','T00150DP'),('11th','T00160AG'),('8th','T00170RD');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_sub`
--

DROP TABLE IF EXISTS `class_sub`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class_sub` (
  `class_id` varchar(40) NOT NULL,
  `sub_id` varchar(40) DEFAULT NULL,
  KEY `class_id` (`class_id`),
  KEY `sub_id` (`sub_id`),
  CONSTRAINT `class_sub_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON UPDATE CASCADE,
  CONSTRAINT `class_sub_ibfk_2` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_sub`
--

LOCK TABLES `class_sub` WRITE;
/*!40000 ALTER TABLE `class_sub` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_sub` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `s_no` int NOT NULL AUTO_INCREMENT,
  `p_id` varchar(40) NOT NULL,
  `fname` varchar(150) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birth_date` date NOT NULL,
  `mob_no` bigint DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `leave_date` date DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  UNIQUE KEY `s_no` (`s_no`),
  UNIQUE KEY `mob_no` (`mob_no`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `image` (`image`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (23,'S00180RS','Ramesh','singh chouhan','Male','2006-12-16',7895824617,'ramesh@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,class DMS00180RS.jpg','2021-06-21',NULL),(24,'S00190RS','rakesh','sharma','Male','2015-09-09',7845968547,'rakeshsharma@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,WIN_20190117_20_23_43_ProS00190RS.jpg','2021-06-22','2021-06-22'),(25,'S00200AK','amit ','kaur','Male','2004-08-16',7849574872,'amit@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,IMG_20190506_111127S00200AK.jpg','2021-06-22',NULL),(26,'S00210NM','Nikhil','morya','Male','1999-08-15',7457847584,'nik@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,IMG_20190510_193728S00210NM.jpg','2021-06-22',NULL),(27,'S00220SS','suresh','shukla','Male','2000-06-15',7485966958,'suresh@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,IMG_20200211_101113S00220SS.jpg','2021-06-25',NULL),(14,'T00100AB','ankit','bhosle','','1999-09-13',7456982314,'ankit@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT00100AB.jpg','2021-06-14',NULL),(16,'T00110HS','hemant ','sirvi','Male','1999-09-13',7458746921,'hem@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,new logoT00110HS.png','2021-06-14','2021-06-21'),(17,'T00120IP','indresh','prajapati','Female','2002-05-13',7591534568,'ind@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT00120IP.jpg','2021-06-14',NULL),(18,'T00130SS','Suyash','singh','Male','2002-08-17',8521479637,'suyash@gmail.comx','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,Annotation 2021-04-27 124419T00130SS.png','2021-06-14',NULL),(19,'T00140RD','rahul','dode','Female','2000-02-28',7423159865,'rahul@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT00140RD.jpg','2021-06-14',NULL),(20,'T00150DP','deepak','pawar','Male','2002-12-16',7845961213,'deepak@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,ObjectT00150DP.jpg','2021-06-14',NULL),(21,'T00160AG','akhilesh','goyal','Male','2001-11-16',7589632152,'akhil@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC - CopyT00160AG.jpg','2021-06-14',NULL),(22,'T00170RD','rithesh','deshmukh','Female','2002-09-13',7410852096,'ritesh@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC - CopyT00170RD.jpg','2021-06-18','2021-06-21'),(2,'T0020RS','ragahv','singh','','1999-09-13',7089818436,'raghav@123.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC.jpg','2021-06-14',NULL),(5,'T0030SS','shudhanshu','singh','','1999-12-10',9630065397,'raghav@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC - Copy.jpg','2021-06-14',NULL),(7,'T0040RM','ramesh','mishra','','1999-09-16',7895462581,'ramsh@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC - CopyT0040RM.jpg','2021-06-14',NULL),(9,'T0050AC','abishek','chouhan','','2005-12-16',9517536548,'abhi@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT0050AC.jpg','2021-06-14',NULL),(10,'T0060AK','adarsh','kumar','','2003-10-16',7854693210,'adarsh@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PIC - CopyT0060AK.jpg','2021-06-14',NULL),(11,'T0070AK','amit','kumar','','1999-09-13',7418529635,'amit@gmail.co','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,SketchpadT0070AK.png','2021-06-14',NULL),(12,'T0080AP','abhishek','pandey','Male','2004-07-13',7458963215,'abhishek@gmail.com','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT0080AP.jpg','2021-06-14',NULL),(13,'T0090AR','ashish','reddy','','1999-12-16',7474855656,'','C:,Users,ragha,Documents,NetBeansProjects,School_Mannagement,src,school_mannagement,StuTeachImages,MY PICT0090AR.jpg','2021-06-14',NULL),(1,'t01','Rakesh','gupta','male','1980-03-12',7894563575,'rakesh@gmail',NULL,NULL,NULL);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section`
--

DROP TABLE IF EXISTS `section`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `section` (
  `section_name` char(1) NOT NULL,
  PRIMARY KEY (`section_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section`
--

LOCK TABLES `section` WRITE;
/*!40000 ALTER TABLE `section` DISABLE KEYS */;
INSERT INTO `section` VALUES ('A'),('B'),('C'),('D');
/*!40000 ALTER TABLE `section` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `p_id` varchar(40) NOT NULL,
  `class_id` varchar(40) NOT NULL,
  KEY `p_id` (`p_id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('S00180RS','7th'),('S00190RS','7th'),('S00200AK','3rd'),('S00210NM','7th'),('S00220SS','4th');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_subject`
--

DROP TABLE IF EXISTS `student_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_subject` (
  `p_id` varchar(40) NOT NULL,
  `sub_id` varchar(40) NOT NULL,
  KEY `p_id` (`p_id`),
  KEY `sub_id` (`sub_id`),
  CONSTRAINT `student_subject_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `student_subject_ibfk_2` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_subject`
--

LOCK TABLES `student_subject` WRITE;
/*!40000 ALTER TABLE `student_subject` DISABLE KEYS */;
INSERT INTO `student_subject` VALUES ('S00190RS','sub0che'),('S00190RS','sub0com1sci'),('S00190RS','sub0eng'),('S00190RS','sub0mat'),('S00190RS','sub0phy'),('S00190RS','sub0soc1sci'),('S00200AK','sub0bio'),('S00200AK','sub0che'),('S00200AK','sub0com1sci'),('S00200AK','sub0hin'),('S00200AK','sub0mat'),('S00200AK','sub0phy'),('S00200AK','sub0soc1sci'),('S00210NM','sub0bio'),('S00210NM','sub0com1sci'),('S00210NM','sub0mat'),('S00210NM','sub0sci'),('S00180RS','sub0che'),('S00180RS','sub0hin'),('S00180RS','sub0phy'),('S00220SS','sub0com1sci'),('S00220SS','sub0hin'),('S00220SS','sub0phy'),('S00220SS','sub0soc1sci');
/*!40000 ALTER TABLE `student_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `sub_id` varchar(40) NOT NULL,
  `sub_name` varchar(150) NOT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('sub0bio','biology'),('sub0che','chemistry'),('sub0com1sci','computer Science'),('sub0eng','english'),('sub0hin','hindi'),('sub0mat','mathematics'),('sub0phy','Physics'),('sub0sci','Science'),('sub0soc1sci','Social Science');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teach_sub`
--

DROP TABLE IF EXISTS `teach_sub`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teach_sub` (
  `p_id` varchar(40) NOT NULL,
  `sub_id` varchar(40) NOT NULL,
  KEY `p_id` (`p_id`),
  KEY `sub_id` (`sub_id`),
  CONSTRAINT `teach_sub_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `teach_sub_ibfk_2` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teach_sub`
--

LOCK TABLES `teach_sub` WRITE;
/*!40000 ALTER TABLE `teach_sub` DISABLE KEYS */;
INSERT INTO `teach_sub` VALUES ('T00100AB','sub0bio'),('T00100AB','sub0com1sci'),('T00100AB','sub0sci'),('T00110HS','sub0bio'),('T00110HS','sub0com1sci'),('T00110HS','sub0hin'),('T00110HS','sub0phy'),('T00110HS','sub0soc1sci'),('T00120IP','sub0che'),('T00120IP','sub0eng'),('T00120IP','sub0mat'),('T00120IP','sub0soc1sci'),('T00130SS','sub0com1sci'),('T00130SS','sub0eng'),('T00130SS','sub0hin'),('T00130SS','sub0soc1sci'),('T00140RD','sub0com1sci'),('T00140RD','sub0eng'),('T00140RD','sub0mat'),('T00140RD','sub0soc1sci'),('T00150DP','sub0che'),('T00150DP','sub0eng'),('T00150DP','sub0hin'),('T00150DP','sub0phy'),('T00150DP','sub0sci'),('T00160AG','sub0com1sci'),('T00160AG','sub0hin'),('T00160AG','sub0mat'),('T00160AG','sub0soc1sci'),('T00170RD','sub0che'),('T00170RD','sub0com1sci'),('T00170RD','sub0eng'),('T00170RD','sub0mat'),('T00170RD','sub0phy'),('S00180RS','sub0bio'),('S00180RS','sub0che'),('S00180RS','sub0com1sci'),('S00180RS','sub0phy');
/*!40000 ALTER TABLE `teach_sub` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `p_id` varchar(40) NOT NULL,
  `qualification` varchar(100) NOT NULL,
  `class_id` varchar(40) NOT NULL,
  KEY `p_id` (`p_id`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `person` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('t01','Bsc Mathmatics','10'),('T0050AC','ba','null'),('T0060AK','be','null'),('T0070AK','bba','null'),('T0080AP','bba','null'),('T0090AR','bcom','null'),('T00100AB','bcom','null'),('T00110HS','msc','null'),('T00120IP','bgs','null'),('T00130SS','diploma','6th'),('T00140RD','bba','3rd'),('T00150DP','bsc','10th'),('T00160AG','msc','6th'),('T00170RD','m.com','null');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-25 23:14:12
