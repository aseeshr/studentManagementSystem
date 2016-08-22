/*
SQLyog Community v12.2.0 (32 bit)
MySQL - 5.1.41 : Database - studentdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`studentdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `studentdb`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `dob` varchar(200) DEFAULT NULL,
  `rollno` varchar(200) DEFAULT NULL,
  `faculty` varchar(200) DEFAULT NULL,
  `semester` varchar(200) DEFAULT NULL,
  `CollegeName` varchar(200) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `phoneNo` longblob,
  `profilePic` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`dob`,`rollno`,`faculty`,`semester`,`CollegeName`,`gender`,`phoneNo`,`profilePic`,`address`) values 
(2,'SamundraStha','3-4-1922','1241341','Computer','Last','KEC','male','245245',NULL,'Thailand'),
(5,'aseeShrestha','12-12-1925','323','Faculty','first','kec','Female','98676767',NULL,'nepaltar'),
(6,'asee','31-12-1922','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(8,'naanubanu','4-1-1921','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(9,'ista','4-1-1921','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(11,'ista','4-1-1921','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(12,'Sachham','4-1-1921','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(13,'Abhimaan','2-5-1920','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(14,'ista','4-1-1921','323','Faculty','first','kec','Female','98676767',NULL,'nepal'),
(15,'Kallu','18-12-1923','01','computer','first','KCC','Female','9898989898',NULL,'Nepalgunj'),
(16,'Baabu','18-12-1923','01','Civil','first','KCC','Male','9898989898',NULL,'Nepalgunj');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
