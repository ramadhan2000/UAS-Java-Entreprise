# Host: localhost  (Version 5.5.5-10.4.14-MariaDB)
# Date: 2021-12-31 21:50:44
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "categories"
#

DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

#
# Data for table "categories"
#

INSERT INTO `categories` VALUES (1,'Komputer'),(2,'Sastra'),(3,'Komik');

#
# Structure for table "books"
#

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `books_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

#
# Data for table "books"
#

INSERT INTO `books` VALUES (1,1,'Java','123'),(2,1,'PHP','456'),(3,2,'Kebudayaan','567'),(4,2,'Bahasa','112');
