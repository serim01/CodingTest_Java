-- 코드를 입력하세요
select WRITER_ID, NICKNAME,TOTAL_SALES
from USED_GOODS_USER U join (
SELECT WRITER_ID, sum(price) TOTAL_SALES
from USED_GOODS_BOARD 
where STATUS ='Done'
group by WRITER_ID
having sum(price) >= 700000
    ) B on(U.USER_ID=B.WRITER_ID)
    order by TOTAL_SALES;
    