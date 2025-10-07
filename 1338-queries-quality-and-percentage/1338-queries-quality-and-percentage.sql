# Write your MySQL query statement below
SELECT QUERY_NAME,
ROUND(AVG(RATING / POSITION), 2) AS QUALITY,
ROUND(AVG(IF(rating < 3,1,0))*100, 2) AS poor_query_percentage 
FROM QUERIES Q
GROUP BY QUERY_NAME;