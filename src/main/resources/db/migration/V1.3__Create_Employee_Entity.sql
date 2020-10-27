CREATE TABLE `employee` (
  `employeeID` int NOT NULL,
  `employeefirstname` varchar(45) NOT NULL,
  `employeelastname` varchar(45) NOT NULL,
  `employeeemail` varchar(100) NOT NULL,
  `employeephonenum` varchar(45) NOT NULL,
  `employeedateofbirth` varchar(45) NOT NULL,
  `employeecheckindate` varchar(45) NOT NULL,
  `Covid` varchar(45) NOT NULL,
  `addressID` int unsigned NOT NULL,
  `restaurantID` int unsigned NOT NULL,
  PRIMARY KEY (`employeeID`),
  UNIQUE KEY `employeeID_UNIQUE` (`employeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
