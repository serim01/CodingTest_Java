-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, '%H') HOUR, COUNT(*) COUNT
FROM ANIMAL_OUTS 
GROUP BY DATE_FORMAT(DATETIME, '%H')
HAVING HOUR >= 09 AND HOUR <20
ORDER BY 1