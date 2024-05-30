-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.name
from ANIMAL_OUTS O left outer join ANIMAL_INS I on(I.ANIMAL_ID = O.ANIMAL_ID)
where i.animal_id is null
order by 1