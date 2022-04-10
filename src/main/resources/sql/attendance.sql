-- -----------------------------------------------------------------------------
-- Table structure
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS attendance;
CREATE TABLE attendance (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(16) NOT NULL COMMENT 'username',
    type INT NOT NULL COMMENT 'type',
    date TIMESTAMP NOT NULL COMMENT 'date',
    PRIMARY KEY (id)
);


-- -----------------------------------------------------------------------------
-- Records
-- -----------------------------------------------------------------------------
INSERT INTO attendance (username, type, date) VALUES ('admin', 0, '2022-04-04 09:00:00');
INSERT INTO attendance (username, type, date) VALUES ('admin', 1, '2022-04-04 18:00:00');
INSERT INTO attendance (username, type, date) VALUES ('test', 0, '2022-04-04 09:00:00');
INSERT INTO attendance (username, type, date) VALUES ('test', 1, '2022-04-04 18:00:00');
