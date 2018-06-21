-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2017 at 03:51 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management_system`
--

-- --------------------------------------------------------

--
-- Stand-in structure for view `doctor`
-- (See below for the actual view)
--
CREATE TABLE `doctor` (
`DocID` varchar(5)
,`FirstName` varchar(20)
,`LastName` varchar(20)
,`WardName` varchar(20)
,`Address` varchar(50)
,`ContactNumber` int(10)
,`Gender` varchar(6)
,`DOBYear` int(4)
,`DOBMonth` varchar(15)
,`DOBDate` int(2)
,`Age` int(3)
);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmpID` varchar(5) NOT NULL,
  `WardID` varchar(3) NOT NULL,
  `Post` varchar(20) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) DEFAULT NULL,
  `Address` varchar(50) NOT NULL,
  `ContactNumber` int(10) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `DOBYear` int(4) NOT NULL,
  `DOBMonth` varchar(15) NOT NULL,
  `DOBDate` int(2) NOT NULL,
  `Age` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpID`, `WardID`, `Post`, `FirstName`, `LastName`, `Address`, `ContactNumber`, `Gender`, `DOBYear`, `DOBMonth`, `DOBDate`, `Age`) VALUES
('D1', 'W2', 'Doctor', 'Sahan', 'Adeesha', 'Village 07,Muwangala,Ampara.', 764534565, 'Male', 1992, 'March', 7, 25),
('D2', 'W1', 'Doctor', 'Dulangi', 'Bagya', 'No208/b,Medagammedda,\nKaralliyadda.', 723423465, 'Female', 1992, 'April', 5, 25),
('D3', 'W4', 'Doctor', 'Sarath', '', 'No 18,Welisara,\nGalle.', 712345678, 'Male', 1990, 'March', 5, 27),
('D4', 'W1', 'Doctor', 'Chanaka', 'Prabudda', 'N0 12,Thihagoda,\nMathara.', 761234567, 'Male', 1990, 'June', 6, 27),
('D5', 'W2', 'Doctor', 'Chalani', 'Nimeshika', 'No 4,\nKaduwela.\n', 713462123, 'Male', 1991, 'February', 5, 26),
('D6', 'W2', 'Doctor', 'hgfd', 'nnghgff', 'jhgfd', 763452234, 'Male', 1991, 'March', 1, 26),
('M1', 'W3', 'MaintenanceStaff', 'Gayan', 'Sampath', 'No 24,Pallekele,\nDigana.', 752345123, 'Male', 1991, 'July', 4, 26),
('M2', 'W3', 'MaintenanceStaff', 'Supul ', 'Dulanka', 'No 67,\nBattaramulla.', 781234562, 'Male', 1991, 'September', 23, 26),
('M3', 'W1', 'MaintenanceStaff', 'Karunathilaka', '', 'No 39,\nMaharagama.', 752345239, 'Male', 1990, 'May', 30, 27),
('N1', 'W2', 'Nurse', 'Tharuka', 'Nimanthi', 'No 18,Wellampitiya.', 712345234, 'Female', 1990, 'January', 2, 27),
('N2', 'W1', 'Nurse', 'Sepali', 'Karunathilaka', 'No 26,Malambe.', 721234567, 'Female', 1992, 'January', 23, 25),
('N3', 'W2', 'Nurse', 'Chamodi', 'Nayanathara', 'No 3,\nNugegoda.', 712356128, 'Female', 1993, 'November', 28, 24);

-- --------------------------------------------------------

--
-- Stand-in structure for view `maintenance_staff`
-- (See below for the actual view)
--
CREATE TABLE `maintenance_staff` (
`MemberID` varchar(5)
,`FirstName` varchar(20)
,`LastName` varchar(20)
,`WardName` varchar(20)
,`Address` varchar(50)
,`ContactNumber` int(10)
,`Gender` varchar(6)
,`DOBYear` int(4)
,`DOBMonth` varchar(15)
,`DOBDate` int(2)
,`Age` int(3)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `nurse`
-- (See below for the actual view)
--
CREATE TABLE `nurse` (
`NurseID` varchar(5)
,`FirstName` varchar(20)
,`LastName` varchar(20)
,`WardName` varchar(20)
,`Address` varchar(50)
,`ContactNumber` int(10)
,`Gender` varchar(6)
,`DOBYear` int(4)
,`DOBMonth` varchar(15)
,`DOBDate` int(2)
,`Age` int(3)
);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `RegID` varchar(10) NOT NULL,
  `ConformDoctorID` varchar(5) NOT NULL,
  `LeadingConsultorID` varchar(5) NOT NULL,
  `WardID` varchar(3) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) DEFAULT NULL,
  `Address` varchar(50) NOT NULL,
  `ContactNumber` int(10) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `DOBYear` int(4) NOT NULL,
  `DOBMonth` varchar(15) NOT NULL,
  `DOBDate` int(2) NOT NULL,
  `Age` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`RegID`, `ConformDoctorID`, `LeadingConsultorID`, `WardID`, `FirstName`, `LastName`, `Address`, `ContactNumber`, `Gender`, `DOBYear`, `DOBMonth`, `DOBDate`, `Age`) VALUES
('R1', 'D1', 'D2', 'W2', 'Nilanjana', 'Prabod', '208/a,Karalliyadda,\nTheldeniya.', 762341234, 'Male', 1993, 'May', 7, 24),
('R2', 'D2', 'D1', 'W1', 'Dasuni', 'Bagya', 'No 14,Mawanella.', 752341234, 'Female', 1991, 'February', 1, 26),
('R3', 'D1', 'D2', 'W3', 'Danushka', 'Sampath', 'No 18,Pallekele,Digana.', 783456234, 'Male', 1992, 'August', 6, 25),
('R4', 'D2', 'D1', 'W4', 'Ravindu', '', 'No 12,village 07,\nHingurana.', 765456787, 'Male', 1990, 'January', 6, 27),
('R5', 'D2', 'D2', 'W2', 'Dilanka', 'Perera', 'No 24/mawanella.', 756435467, 'Female', 1990, 'August', 4, 27);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` varchar(10) NOT NULL,
  `RegID` varchar(10) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `RegistrationFee` int(4) NOT NULL,
  `FacilitiesFee` int(4) NOT NULL,
  `LeadingConsultantFee` int(6) NOT NULL,
  `ExaminAnotherDoctorFee` int(6) DEFAULT NULL,
  `TotalTestFee` int(10) NOT NULL,
  `TotalTreatmentFee` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `RegID`, `FullName`, `RegistrationFee`, `FacilitiesFee`, `LeadingConsultantFee`, `ExaminAnotherDoctorFee`, `TotalTestFee`, `TotalTreatmentFee`) VALUES
('P1', 'R1', 'NilanjanaPrabod', 2000, 6000, 7000, 1500, 1250, 900),
('P2', 'R2', 'DasuniBagya', 2000, 3000, 4000, 0, 850, 900),
('P3', 'R3', 'DanushkaSampath', 2000, 4000, 5000, 0, 1000, 1200);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `SalaryID` varchar(10) NOT NULL,
  `EmpID` varchar(10) NOT NULL,
  `Post` varchar(20) NOT NULL,
  `YearOfSalary` int(4) NOT NULL,
  `MonthOfSalary` varchar(15) NOT NULL,
  `NumberOfAttendence` int(2) NOT NULL,
  `SalaryRatePerDay` int(4) NOT NULL,
  `NumberOfOTHours` int(2) NOT NULL,
  `OTRatePerHour` int(3) NOT NULL,
  `Total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`SalaryID`, `EmpID`, `Post`, `YearOfSalary`, `MonthOfSalary`, `NumberOfAttendence`, `SalaryRatePerDay`, `NumberOfOTHours`, `OTRatePerHour`, `Total`) VALUES
('S1', 'D1', 'Doctor', 1990, 'January', 1, 1000, 1, 200, 1200),
('S2', 'N1', 'Nurse', 1990, 'January', 11, 600, 4, 150, 7200),
('S3', 'M1', 'MaintenanceStaff', 1990, 'January', 12, 400, 5, 100, 5300),
('S4', 'D2', 'Doctor', 1990, 'January', 23, 1000, 6, 200, 24200);

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `TestID` varchar(10) NOT NULL,
  `RegID` varchar(10) NOT NULL,
  `TestName` varchar(50) NOT NULL,
  `TestYear` int(4) NOT NULL,
  `TestMonth` varchar(15) NOT NULL,
  `TestDate` int(2) NOT NULL,
  `TestInformation` varchar(50) NOT NULL,
  `TestAmount` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`TestID`, `RegID`, `TestName`, `TestYear`, `TestMonth`, `TestDate`, `TestInformation`, `TestAmount`) VALUES
('T1', 'R1', 'Blood', 2017, 'January', 1, 'good', 400),
('T2', 'R1', 'Xray', 2017, 'January', 4, 'good', 450),
('T3', 'R1', 'Blood', 2017, 'January', 6, 'bad', 400),
('T4', 'R2', 'Xray', 2017, 'January', 7, 'bad', 450),
('T5', 'R2', 'Blood', 2017, 'January', 7, 'good', 400),
('T6', 'R3', 'Blood', 2017, 'May', 18, 'Bad', 400),
('T7', 'R3', 'Xray', 2017, 'May', 18, 'Good', 600);

-- --------------------------------------------------------

--
-- Table structure for table `treatment`
--

CREATE TABLE `treatment` (
  `TreatmentID` varchar(10) NOT NULL,
  `RegID` varchar(10) NOT NULL,
  `Treatment` varchar(50) NOT NULL,
  `PrescribeYear` int(4) NOT NULL,
  `PrescribeMonth` varchar(15) NOT NULL,
  `PrescribeDate` int(2) NOT NULL,
  `Result` varchar(50) NOT NULL,
  `TreatmentAmount` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `treatment`
--

INSERT INTO `treatment` (`TreatmentID`, `RegID`, `Treatment`, `PrescribeYear`, `PrescribeMonth`, `PrescribeDate`, `Result`, `TreatmentAmount`) VALUES
('TR1', 'R1', '2Salin', 2017, 'January', 7, 'good', 600),
('TR2', 'R1', '1Salin', 2017, 'January', 8, 'good', 300),
('TR3', 'R2', '3Slain', 2017, 'January', 6, 'good', 900),
('TR4', 'R3', 'Injection', 2017, 'January', 20, 'Good', 1200);

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

CREATE TABLE `ward` (
  `WardID` varchar(3) NOT NULL,
  `WardName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`WardID`, `WardName`) VALUES
('W1', 'Maternity'),
('W2', 'Pediatrics'),
('W3', 'Oncology'),
('W4', 'Gynecologist');

-- --------------------------------------------------------

--
-- Structure for view `doctor`
--
DROP TABLE IF EXISTS `doctor`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `doctor`  AS  select `employee`.`EmpID` AS `DocID`,`employee`.`FirstName` AS `FirstName`,`employee`.`LastName` AS `LastName`,`ward`.`WardName` AS `WardName`,`employee`.`Address` AS `Address`,`employee`.`ContactNumber` AS `ContactNumber`,`employee`.`Gender` AS `Gender`,`employee`.`DOBYear` AS `DOBYear`,`employee`.`DOBMonth` AS `DOBMonth`,`employee`.`DOBDate` AS `DOBDate`,`employee`.`Age` AS `Age` from (`employee` join `ward` on((`employee`.`WardID` = `ward`.`WardID`))) where (`employee`.`Post` = 'Doctor') order by `employee`.`EmpID` desc ;

-- --------------------------------------------------------

--
-- Structure for view `maintenance_staff`
--
DROP TABLE IF EXISTS `maintenance_staff`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `maintenance_staff`  AS  select `employee`.`EmpID` AS `MemberID`,`employee`.`FirstName` AS `FirstName`,`employee`.`LastName` AS `LastName`,`ward`.`WardName` AS `WardName`,`employee`.`Address` AS `Address`,`employee`.`ContactNumber` AS `ContactNumber`,`employee`.`Gender` AS `Gender`,`employee`.`DOBYear` AS `DOBYear`,`employee`.`DOBMonth` AS `DOBMonth`,`employee`.`DOBDate` AS `DOBDate`,`employee`.`Age` AS `Age` from (`employee` join `ward` on((`employee`.`WardID` = `ward`.`WardID`))) where (`employee`.`Post` = 'MaintenanceStaff') order by `employee`.`EmpID` desc ;

-- --------------------------------------------------------

--
-- Structure for view `nurse`
--
DROP TABLE IF EXISTS `nurse`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `nurse`  AS  select `employee`.`EmpID` AS `NurseID`,`employee`.`FirstName` AS `FirstName`,`employee`.`LastName` AS `LastName`,`ward`.`WardName` AS `WardName`,`employee`.`Address` AS `Address`,`employee`.`ContactNumber` AS `ContactNumber`,`employee`.`Gender` AS `Gender`,`employee`.`DOBYear` AS `DOBYear`,`employee`.`DOBMonth` AS `DOBMonth`,`employee`.`DOBDate` AS `DOBDate`,`employee`.`Age` AS `Age` from (`employee` join `ward` on((`employee`.`WardID` = `ward`.`WardID`))) where (`employee`.`Post` = 'Nurse') order by `employee`.`EmpID` desc ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpID`),
  ADD KEY `WardID` (`WardID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`RegID`),
  ADD KEY `ConformDoctorID` (`ConformDoctorID`),
  ADD KEY `LeadingConsultorID` (`LeadingConsultorID`),
  ADD KEY `WardID` (`WardID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`),
  ADD KEY `RegID` (`RegID`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`SalaryID`),
  ADD KEY `EmpID` (`EmpID`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`TestID`),
  ADD KEY `RegID` (`RegID`);

--
-- Indexes for table `treatment`
--
ALTER TABLE `treatment`
  ADD PRIMARY KEY (`TreatmentID`),
  ADD KEY `RegID` (`RegID`);

--
-- Indexes for table `ward`
--
ALTER TABLE `ward`
  ADD PRIMARY KEY (`WardID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`WardID`) REFERENCES `ward` (`WardID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`ConformDoctorID`) REFERENCES `employee` (`EmpID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_2` FOREIGN KEY (`LeadingConsultorID`) REFERENCES `employee` (`EmpID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_3` FOREIGN KEY (`WardID`) REFERENCES `ward` (`WardID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`RegID`) REFERENCES `patient` (`RegID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salary`
--
ALTER TABLE `salary`
  ADD CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `employee` (`EmpID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `test_ibfk_1` FOREIGN KEY (`RegID`) REFERENCES `patient` (`RegID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `treatment`
--
ALTER TABLE `treatment`
  ADD CONSTRAINT `treatment_ibfk_1` FOREIGN KEY (`RegID`) REFERENCES `patient` (`RegID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
