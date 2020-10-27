CREATE TABLE `customer` (
                            `customerID` int NOT NULL AUTO_INCREMENT,
                            `customerfirstname` varchar(45) NOT NULL,
                            `customerlastname` varchar(45) NOT NULL,
                            `customeremail` varchar(200) NOT NULL,
                            `customerphonenum` varchar(45) NOT NULL,
                            `customerbirthdate` varchar(45) NOT NULL,
                            `customerentrydate` varchar(45) NOT NULL,
                            `Covid` tinyint NOT NULL,
                            `addressID` int unsigned NOT NULL,
                            `restaurantID` int unsigned NOT NULL,
                            PRIMARY KEY (`customerID`),
                            UNIQUE KEY `customerID_UNIQUE` (`customerID`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
