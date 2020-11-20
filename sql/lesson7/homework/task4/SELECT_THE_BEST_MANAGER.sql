--имя лучшего менеджера по продажам по сумме сделок за август 2017 года,
--выводить несколько имен, если таких менеджеров несколько
SELECT NAME, ALL_AMOUNT
FROM (SELECT S.NAME AS NAME, SUM(D.AMOUNT) AS ALL_AMOUNT
    FROM SALESMAN S
    JOIN CUSTOMER C ON S.SALESMAN_ID=C.SALESMAN_ID
    JOIN DEAL D ON D.CUSTOMER_ID=C.CUSTOMER_ID AND DATE_CREATED=TO_DATE('08 2017', 'MM YYYY')
    GROUP BY S.NAME)
WHERE ALL_AMOUNT=(SELECT MAX(ALL_AMOUNT)
                    FROM (SELECT S.NAME, SUM(D.AMOUNT) AS ALL_AMOUNT
                            FROM SALESMAN S
                            JOIN CUSTOMER C ON S.SALESMAN_ID=C.SALESMAN_ID
                            JOIN DEAL D ON D.CUSTOMER_ID=C.CUSTOMER_ID
                            GROUP BY S.NAME));