CREATE TABLE IF NOT EXISTS DOG (
    dog_id INT AUTO_INCREMENT  PRIMARY KEY,
    dog_name VARCHAR(250) NOT NULL,
    breed VARCHAR(250) DEFAULT NULL,
    weight INT NULL
    );