CREATE DATABASE garage;
use garage;
CREATE TABLE vehicle(
id INT NOT NULL UNIQUE AUTO_INCREMENT,
model VARCHAR(200) NOT NULL,
mileage INT NOT NULL,
vehicle_type VARCHAR(200) NOT NULL,
doors INT NOT NULL,
PRIMARY KEY(id));

DESCRIBE vehicle;
SELECT * FROM vehicle;

INSERT INTO vehicle(model, mileage, vehicle_type, doors) VALUES("tbc",30000,"Car",4);