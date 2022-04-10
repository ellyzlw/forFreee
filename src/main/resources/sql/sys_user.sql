-- -----------------------------------------------------------------------------
-- Table structure
-- -----------------------------------------------------------------------------
-- TODO split sys_user into two tables: sys_user, user
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(16) NOT NULL COMMENT 'username',
    password VARCHAR(255) NOT NULL COMMENT 'password',
    role INT NOT NULL COMMENT 'role',
    name VARCHAR(255) NOT NULL COMMENT 'name',
    PRIMARY KEY (id, username)
);


-- -----------------------------------------------------------------------------
-- Records
-- -----------------------------------------------------------------------------
INSERT INTO sys_user (username, password, role, name) VALUES ('admin', 'admin', 0, 'Administrator');
INSERT INTO sys_user (username, password, role, name) VALUES ('test', 'test', 1, 'Test User');
