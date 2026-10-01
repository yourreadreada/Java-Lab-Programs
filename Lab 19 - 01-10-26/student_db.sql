CREATE DATABASE student_db;
USE student_db;

CREATE TABLE connection_test (
    test_id INT PRIMARY KEY,
    status VARCHAR(50)
);

INSERT INTO connection_test VALUES (1, 'Database Operational');