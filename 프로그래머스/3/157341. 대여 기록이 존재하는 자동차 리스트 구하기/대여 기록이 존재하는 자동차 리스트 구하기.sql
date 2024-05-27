-- 코드를 입력하세요
SELECT distinct C.CAR_ID
from CAR_RENTAL_COMPANY_CAR C inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
    on (C.CAR_ID = H.CAR_ID)
where C.CAR_TYPE = '세단'
and H.START_DATE like '%-10-%'
ORDER BY 1 desc