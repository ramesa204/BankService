CREATE TABLE IF NOT EXISTS  USER (
id INT  AUTO_INCREMENT  PRIMARY KEY,
name VARCHAR(50) NOT NULL,
accountNumber INT(11) NOT NULL,
balance REAL,
accountStatus BOOLEAN NOT NULL default 0 );