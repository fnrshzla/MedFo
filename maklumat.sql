-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 17, 2022 at 05:04 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sampledb3`
--

-- --------------------------------------------------------

--
-- Table structure for table `maklumat`
--

CREATE TABLE `maklumat` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `lat` decimal(10,4) NOT NULL,
  `lng` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `maklumat`
--

INSERT INTO `maklumat` (`id`, `name`, `description`, `lat`, `lng`) VALUES
(1, 'Chan Clinic', 'Perlis', '6.4392', '100.1957'),
(2, 'REMEDIC CLINIC Kangar', 'Perlis', '6.4363', '100.1887'),
(3, 'Klinik Dr. Hj. Othman', 'Perlis', '6.4366', '100.1940'),
(4, 'KLINIK METHADONE SUBOXONE PERLIS', 'Perlis', '6.4454', '100.2061'),
(5, 'Klinik Kesihatan Kangar', 'Perlis', '6.4400', '100.1910'),
(6, 'Tuanku Fauziah Hospital', 'Perlis', '6.4410', '100.1914'),
(7, 'Jabatan Kecemasan dan Trauma Hospital Tuanku Fauziah', 'Perlis', '6.4422', '100.1915'),
(8, 'Klinik 1 Malaysia Arau', 'Perlis', '6.4375', '100.2323'),
(9, 'Poliklinik Dr Azhar & Rakan-Rakan Arau', 'Perlis', '6.4455', '100.2337'),
(10, 'Klinik Desa Padang Siding', 'Perlis', '6.4648', '100.3425'),
(11, 'Klinik Desa Lubok Sireh', 'Perlis', '6.6511', '100.2308'),
(12, 'Klinik Desa Titi Tinggi', 'Perlis', '6.6363', '100.2678'),
(13, 'Padang Besar Health Clinic', 'Perlis', '6.6585', '100.3188'),
(14, 'Klinik Haji Adnan', 'Perlis', '6.4461', '100.2400'),
(15, 'Unit Kesihatan UiTM Arau', 'Perlis', '6.4460', '100.2798'),
(16, 'Kaki Bukit Health CLinic', 'Perlis', '6.6426', '100.2110');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `maklumat`
--
ALTER TABLE `maklumat`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `maklumat`
--
ALTER TABLE `maklumat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
