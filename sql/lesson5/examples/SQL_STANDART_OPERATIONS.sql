--SELECT -column1, column2- FROM table_name
--WHERE conditions
--GROUP BY column_name
SELECT PRODUCT_NAME, SUM(PRICE) FROM ORDERS
GROUP BY PRODUCT_NAME;

SELECT PRODUCT_NAME, AVG(PRICE) FROM ORDERS
GROUP BY PRODUCT_NAME;

--SELECT -column1, column2- FROM table_name
--WHERE conditions
--ORDER BY column_name ACS | DESC
SELECT PRODUCT_NAME, PRICE FROM ORDERS
ORDER BY PRODUCT_NAME ASC;

SELECT PRODUCT_NAME, PRICE FROM ORDERS
ORDER BY PRODUCT_NAME DESC;

SELECT * FROM ORDERS
ORDER BY PRICE ASC;

--COUNT(-column_name)
SELECT COUNT(*) FROM ORDERS;
--AVG(-column_name)
SELECT AVG(PRICE) FROM ORDERS;
--MIN(-column_name)
SELECT MIN(PRICE) FROM ORDERS;
--MAX(-column_name)
SELECT MAX(PRICE) FROM ORDERS;
--SUM(-column_name)
SELECT SUM(PRICE) FROM ORDERS;

--SELECT -column1, column2- FROM table_name
--WHERE conditions AND EXISTS (SELECT -column1, column2- FROM table_name
--WHERE conditions)

SELECT * FROM ORDERS
WHERE EXISTS (SELECT * FROM PRODUCT WHERE NAME = ORDERS.PRODUCT_NAME);

SELECT * FROM ORDERS
WHERE EXISTS (SELECT * FROM PRODUCT WHERE NAME=ORDERS.PRODUCT_NAME AND PRICE < ORDERS.PRICE);

--BETWEEN
SELECT * FROM ORDERS WHERE PRICE BETWEEN 1 AND 100;
SELECT * FROM ORDERS WHERE DATE_ORDERED BETWEEN TO_DATE('2018', 'YYYY') AND TO_DATE('2019', 'YYYY');

--SELECT * FROM table_name WHERE conditions AND/OR column_name LIKE 'pattern'
SELECT * FROM ORDERS WHERE PRODUCT_NAME LIKE 't%';
SELECT * FROM ORDERS WHERE PRODUCT_NAME LIKE '%3';
SELECT * FROM ORDERS WHERE PRODUCT_NAME LIKE '%toy%';