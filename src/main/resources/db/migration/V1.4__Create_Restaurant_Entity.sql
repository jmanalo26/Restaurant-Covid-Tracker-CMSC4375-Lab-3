CREATE TABLE `restaurant` (
  `restaurantID` int unsigned NOT NULL,
  `restaurantName` varchar(45) NOT NULL,
  `restaurantEmail` varchar(45) NOT NULL,
  `restaurantPhoneNum` varchar(45) NOT NULL,
  `addressID` int unsigned NOT NULL,
  PRIMARY KEY (`restaurantID`),
  UNIQUE KEY `resterauntID_UNIQUE` (`restaurantID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
