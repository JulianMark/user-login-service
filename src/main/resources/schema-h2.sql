CREATE TABLE USERS(
ID INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
NAME VARCHAR(30),
SURNAME VARCHAR(30),
EMAIL VARCHAR(50),
PASS VARCHAR(20)
);