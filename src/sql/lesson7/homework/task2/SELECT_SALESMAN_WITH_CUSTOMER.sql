SELECT S.NAME, C.CUSTNAME
FROM SALESMAN S
JOIN CUSTOMER C ON S.SALESMAN_ID=C.SALESMAN_ID;