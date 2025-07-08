# Write your MySQL query statement below
SELECT
a.machine_id,
ROUND(
AVG(CASE WHEN a.activity_type = 'end' THEN a.timestamp END) -
AVG(CASE WHEN a.activity_type = 'start' THEN a.timestamp END), 3
) AS processing_time
FROM
activity a
GROUP BY
a.machine_id;