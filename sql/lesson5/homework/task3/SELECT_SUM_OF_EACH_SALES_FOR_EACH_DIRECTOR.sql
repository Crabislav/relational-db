--TASK 3.2
SELECT M.DIRECTOR, SUM(MS.DOMESTIC_SALES), SUM(MS.INTERNATIONAL_SALES)
FROM MOVIE_STAT MS, MOVIE M WHERE MS.MOVIE_ID=M.ID
GROUP BY M.DIRECTOR;