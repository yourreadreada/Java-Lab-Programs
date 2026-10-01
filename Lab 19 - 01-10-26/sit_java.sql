CREATE DATABASE sit_java;
USE sit_java;

-- Assignment 19
-- Table for Exercise 1
CREATE TABLE student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks DOUBLE
);

INSERT INTO student VALUES 
(101, 'Raghav Sarda', 'Computer Science', 92.5),
(102, 'Parth Kulkarni Sarda', 'Computer Science', 94.5),
(103, 'Yatharth Shah', 'Computer Science', 93.5);

-- Table for Exercise 2
CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO product VALUES 
(501, 'Logitech MX Master 4 Mouse', 10, 16000),
(502, 'Apple Magic Keyboard', 20, 18000),
(503, 'Apple Studio Display', 15, 179999);


-- Assignment 20
-- Table for Exercise 1
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

-- Table for Exercise 2
CREATE TABLE student_crud (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50),
    marks DOUBLE
);