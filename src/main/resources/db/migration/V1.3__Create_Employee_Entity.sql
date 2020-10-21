CREATE TABLE `employee` (
  `employeeID` int NOT NULL,
  `employeeFirstName` varchar(45) NOT NULL,
  `employeeLastName` varchar(45) NOT NULL,
  `employeeEmail` varchar(100) NOT NULL,
  `employeePhoneNum` varchar(45) NOT NULL,
  `employeeDateOfBirth` varchar(45) NOT NULL,
  `employeeCheckInDate` varchar(45) NOT NULL,
  `employeeCovidPositive` varchar(45) NOT NULL,
  `addressID` int unsigned NOT NULL,
  `restaurantID` int unsigned NOT NULL,
  PRIMARY KEY (`employeeID`),
  UNIQUE KEY `employeeID_UNIQUE` (`employeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
