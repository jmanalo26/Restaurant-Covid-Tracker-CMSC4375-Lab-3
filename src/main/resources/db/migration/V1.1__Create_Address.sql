CREATE TABLE `address` (
  `addressID` int unsigned NOT NULL,
  `street1` varchar(45) NOT NULL,
  `street2` varchar(45) DEFAULT NULL,
  `street3` varchar(45) DEFAULT NULL,
  `city` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `postalCode` int NOT NULL,
  PRIMARY KEY (`addressID`),
  UNIQUE KEY `addressID_UNIQUE` (`addressID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
