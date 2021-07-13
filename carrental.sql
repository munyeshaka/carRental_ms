-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 13, 2021 at 08:12 PM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `carrental`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE IF NOT EXISTS `car` (
  `vin` int(11) NOT NULL AUTO_INCREMENT,
  `category_car_id` int(11) NOT NULL,
  `licence_plate` varchar(30) NOT NULL,
  `availability_car` int(30) NOT NULL,
  PRIMARY KEY (`vin`),
  KEY `fk_category_car_id` (`category_car_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`vin`, `category_car_id`, `licence_plate`, `availability_car`) VALUES
(1, 1, 'D1234A', 3),
(2, 2, 'D1244A', 5),
(3, 3, 'D1244A', 3),
(4, 4, 'K1244A', 6),
(5, 5, 'K1214A', 5),
(6, 6, 'K0214A', 7);

-- --------------------------------------------------------

--
-- Table structure for table `category_car`
--

CREATE TABLE IF NOT EXISTS `category_car` (
  `category_car_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_car_name` varchar(30) NOT NULL,
  `renting_price` float NOT NULL,
  `availability` int(30) NOT NULL,
  PRIMARY KEY (`category_car_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `category_car`
--

INSERT INTO `category_car` (`category_car_id`, `category_car_name`, `renting_price`, `availability`) VALUES
(1, 'SEDAN', 30000, 5),
(2, 'COUPE', 50000, 4),
(3, 'SPORTS CAR', 60000, 8),
(4, 'CONVERTIBLE', 40000, 6),
(5, 'MINIVAN', 40000, 4),
(6, 'PICKUP TRUCK', 60000, 6);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `phone_number` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `first_name`, `last_name`, `phone_number`) VALUES
(1, 'Alain', 'NIYONZIMA', 79009900),
(2, 'Eric', 'NIYONKURU', 79009911),
(3, 'Evode', 'NIYIMPA', 79009922),
(4, 'Pascal', 'ARAKAZA', 79009933),
(5, 'Amissa', 'ABAYO', 79009944),
(6, 'Amina', 'IRANZI', 79009955);

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE IF NOT EXISTS `driver` (
  `licence` varchar(30) NOT NULL,
  `reservation_id` int(11) NOT NULL,
  `first_name_driver` varchar(30) NOT NULL,
  `last_name_driver` varchar(30) NOT NULL,
  PRIMARY KEY (`licence`),
  KEY `fk_reservation` (`reservation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`licence`, `reservation_id`, `first_name_driver`, `last_name_driver`) VALUES
('PN0115257', 1, 'Divine', 'MUGISHA'),
('PN0115258', 2, 'Alain', 'MUCO'),
('PN0115260', 3, 'Alex', 'MUHOZA'),
('PN0115271', 7, 'Erneste', 'NIYONKURU'),
('PN0115273', 6, 'Eric', 'NIYONKURU'),
('PN0115277', 4, 'Desire', 'NZIZA'),
('PN0115279', 5, 'Pascal', 'NZIZA'),
('PN0115871', 8, 'Evariste', 'NIYO');

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE IF NOT EXISTS `rental` (
  `rental_id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_id` int(11) NOT NULL,
  `licence` varchar(30) NOT NULL,
  `vin` int(11) NOT NULL,
  `pick_up_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `amount_to_pay` int(11) NOT NULL,
  PRIMARY KEY (`rental_id`),
  KEY `fk_reservation_id` (`reservation_id`),
  KEY `fk_licence` (`licence`),
  KEY `fk_vin` (`vin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`rental_id`, `reservation_id`, `licence`, `vin`, `pick_up_date`, `return_date`, `amount_to_pay`) VALUES
(1, 9, 'PN0115257', 1, '0000-00-00', '0000-00-00', 40010),
(2, 8, 'PN0115258', 1, '0000-00-00', '0000-00-00', 60010),
(3, 5, 'PN0115260', 1, '0000-00-00', '0000-00-00', 40010),
(4, 3, 'PN0115271', 1, '0000-00-00', '0000-00-00', 60010),
(5, 2, 'PN0115273', 1, '0000-00-00', '0000-00-00', 50010);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `category_car_id` int(11) NOT NULL,
  `pick_up_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `discount_amount` float NOT NULL,
  `transaction_amount` float NOT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `fk_customer` (`customer_id`),
  KEY `fk_category_car` (`category_car_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`reservation_id`, `customer_id`, `category_car_id`, `pick_up_date`, `return_date`, `discount_amount`, `transaction_amount`) VALUES
(1, 1, 1, '0000-00-00', '0000-00-00', 30000, 10),
(2, 1, 1, '0000-00-00', '0000-00-00', 30000, 10),
(3, 2, 2, '0000-00-00', '0000-00-00', 50000, 10),
(4, 3, 3, '0000-00-00', '0000-00-00', 60000, 10),
(5, 4, 4, '0000-00-00', '0000-00-00', 40000, 10),
(6, 4, 5, '0000-00-00', '0000-00-00', 40000, 10),
(7, 5, 6, '0000-00-00', '0000-00-00', 60000, 10),
(8, 6, 6, '0000-00-00', '0000-00-00', 60000, 10),
(9, 6, 4, '2021-08-08', '2021-09-08', 40000, 10);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `car`
--
ALTER TABLE `car`
  ADD CONSTRAINT `fk_category_car_id` FOREIGN KEY (`category_car_id`) REFERENCES `category_car` (`category_car_id`);

--
-- Constraints for table `driver`
--
ALTER TABLE `driver`
  ADD CONSTRAINT `fk_reservation` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`reservation_id`);

--
-- Constraints for table `rental`
--
ALTER TABLE `rental`
  ADD CONSTRAINT `fk_licence` FOREIGN KEY (`licence`) REFERENCES `driver` (`licence`),
  ADD CONSTRAINT `fk_reservation_id` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`reservation_id`),
  ADD CONSTRAINT `fk_vin` FOREIGN KEY (`vin`) REFERENCES `car` (`vin`);

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fk_category_car` FOREIGN KEY (`category_car_id`) REFERENCES `category_car` (`category_car_id`),
  ADD CONSTRAINT `fk_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
