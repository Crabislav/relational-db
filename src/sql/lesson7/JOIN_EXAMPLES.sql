CREATE TABLE SALESMAN(
    SALESMAN_ID NUMBER PRIMARY KEY,
    NAME NVARCHAR2(50) NOT NULL,
    CITY NVARCHAR2(50) NOT NULL,
    COMMISSION NUMBER(*,2) DEFAULT 0.1
);

CREATE TABLE CUSTOMER(
    CUSTOMER_ID NUMBER PRIMARY KEY,
    CUSTNAME NVARCHAR2(50) NOT NULL,
    CITY NVARCHAR2(50) NOT NULL,
    SALESMAN_ID NUMBER,
    CONSTRAINT SALESMAN_FK FOREIGN KEY (SALESMAN_ID) REFERENCES SALESMAN(SALESMAN_ID)
);

INSERT INTO SALESMAN VALUES (5001, 'James Hoog', 'New York', 0.15);
INSERT INTO SALESMAN VALUES (5002, 'Nail Knite', 'Paris', 0.13);
INSERT INTO SALESMAN VALUES (5003, 'Pit Alex', 'London', 0.11);
INSERT INTO SALESMAN VALUES (5005, 'Klex Aopnin', 'Paris', 0.14);
INSERT INTO SALESMAN VALUES (5006, 'Alex Kopnin', 'Zaporozhje', 0.12);
INSERT INTO SALESMAN VALUES (5007, 'Mudr Andrevskiy', 'Zhitomir', 0.29);
INSERT INTO SALESMAN VALUES (5008, 'Andrey Mudrevskiy', 'Kiev', 0.09);
INSERT INTO SALESMAN VALUES (5009, 'Denis Kokorin', 'Moscow', 0.1);

INSERT INTO CUSTOMER VALUES(3001, 'John Wick', 'Berlin', 5001);
INSERT INTO CUSTOMER VALUES(3005, 'John Sick', 'California', 5002);
INSERT INTO CUSTOMER VALUES(3002, 'Jacky Chan', 'Pekin', 5005);
INSERT INTO CUSTOMER VALUES(3004, 'Dirty Ramiras', 'Moscow', 5006);
INSERT INTO CUSTOMER VALUES(3009, 'Alfred Go', 'Paris', 5003);
INSERT INTO CUSTOMER VALUES(3008, 'Alex Lopnin', 'Lutsk', 5002);
INSERT INTO CUSTOMER VALUES(3007, 'Alex Kopkin', 'London', 5001);
INSERT INTO CUSTOMER VALUES(3003, 'Alex Kopnik', 'Kiev', 5007);
INSERT INTO CUSTOMER VALUES(3010, 'Mc Duck', 'London', null);

--TABLE CONCAT WITHOUT JOIN
SELECT S.NAME, C.CUSTNAME
FROM SALESMAN S, CUSTOMER C
WHERE S.SALESMAN_ID = C.SALESMAN_ID;

--TABLE CONCAT WITH JOIN
SELECT SALESMAN.NAME, CUSTOMER.CUSTNAME
FROM SALESMAN
JOIN CUSTOMER ON SALESMAN.SALESMAN_ID = CUSTOMER.SALESMAN_ID;

--JOIN SYNTAX
-------------
--SELECT
--FROM
--JOIN TABLE_NAME ON JOIN_CONDITION

--INNER JOIN
SELECT S.CITY, S.NAME, C.CUSTNAME
FROM SALESMAN S
JOIN CUSTOMER C ON S.CITY = C.CITY;

--LEFT JOIN
SELECT S.CITY, S.NAME, C.CUSTNAME
FROM SALESMAN S
LEFT JOIN CUSTOMER C ON S.CITY = C.CITY;

--RIGHT JOIN
SELECT S.CITY, S.NAME, C.CUSTNAME
FROM SALESMAN S
RIGHT JOIN CUSTOMER C ON S.CITY = C.CITY;

--FULL JOIN
SELECT S.CITY, S.NAME, C.CUSTNAME
FROM SALESMAN S
FULL JOIN CUSTOMER C ON S.CITY = C.CITY;