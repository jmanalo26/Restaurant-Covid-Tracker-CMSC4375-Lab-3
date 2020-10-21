CREATE TABLE `customer` (
                            `customerID` int NOT NULL AUTO_INCREMENT,
                            `customerFirstName` varchar(45) NOT NULL,
                            `customerLastName` varchar(45) NOT NULL,
                            `customerEmail` varchar(200) NOT NULL,
                            `customerPhoneNum` varchar(45) NOT NULL,
                            `customerBirthDate` varchar(45) NOT NULL,
                            `customerEntryDate` varchar(45) NOT NULL,
                            `customerCovidPos` tinyint NOT NULL,
                            `addressID` int unsigned NOT NULL,
                            `restaurantID` int unsigned NOT NULL,
                            PRIMARY KEY (`customerID`),
                            UNIQUE KEY `customerID_UNIQUE` (`customerID`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
