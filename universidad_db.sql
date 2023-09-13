-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 13, 2023 at 07:24 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universidadulp_bd`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaDeNacimiento`, `estado`) VALUES
(1, 45216153, 'ADRIEL MATIAS', 'BAEZ', '2001-07-02', 1),
(2, 46044070, 'GENARO', 'CAMILLETTI', '2000-10-25', 1),
(3, 46495934, 'TOMÁS SANTIAGO', 'CLEMENTELLI', '2001-08-17', 1),
(4, 46368627, 'MAXIMILIANO EZEQUIEL', 'CORTI', '2002-04-13', 1),
(5, 46241320, 'GENARO', 'GALAN', '2001-09-16', 1),
(6, 46114013, 'MIGUEL ANGEL', 'GARCIA', '2001-05-01', 1),
(7, 45951359, 'FRANCO', 'GATTI', '2000-10-19', 1),
(8, 46445924, 'NICOLÁS ROBERTO', 'LEZCANO', '2001-03-28', 1),
(9, 45504125, 'LAUREANO', 'MARZETTI', '2000-11-19', 1),
(10, 45048655, 'IAN ANGEL VALENTÍN', 'MOLINA', '2000-12-27', 1),
(11, 44593185, 'MAXIMO', 'PALACIOS ', '2001-09-18', 1),
(12, 46761574, 'FEDERICO', 'TADDEI', '2000-10-25', 1),
(13, 46164852, 'MATÍAS EZEQUIEL', 'VITELLI', '2001-12-30', 1),
(14, 45827090, 'NEHEMIAS LEONEL', 'ZARZA', '2000-11-15', 1);

-- --------------------------------------------------------

--
-- Table structure for table `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` decimal(10,2) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(4, 'Teoría de los Circuitos', 1, 1),
(5, 'Técnicas Digitales', 1, 1),
(6, 'Electrónica I', 1, 1),
(7, 'Lógica Simbólica', 1, 1),
(8, 'Laboratorio I', 1, 1),
(9, 'Teología ', 1, 1),
(10, 'Máquinas Eléctricas ', 2, 1),
(11, 'Circuitos Hidráulicos y Neumáticos', 2, 1),
(12, 'Matemáticas Aplicadas', 2, 1),
(13, 'Electrónica II', 2, 1),
(14, 'Laboratorio II ', 2, 1),
(15, 'Resistencia y Cálculo de Elementos de Máquina', 2, 1),
(16, 'Microprocesadores I', 2, 1),
(17, 'Epistemología de la Ciencia', 2, 1),
(18, 'Computación Aplicada', 3, 1),
(19, 'Sistemas de Control', 3, 1),
(20, 'Microprocesadores II', 3, 1),
(21, 'Tecnología y Aplicación de los Robots', 3, 1),
(22, 'Sensores y Servomecanismos', 3, 1),
(23, 'Laboratorio III', 3, 1),
(24, 'Etica y Moral Profesional', 3, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indexes for table `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripto`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indexes for table `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
