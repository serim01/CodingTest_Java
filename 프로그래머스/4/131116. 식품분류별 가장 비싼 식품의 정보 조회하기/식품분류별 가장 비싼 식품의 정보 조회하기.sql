-- 코드를 입력하세요
select A.CATEGORY, MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT A join (
SELECT CATEGORY, max(price)  max_price
from FOOD_PRODUCT 
group by CATEGORY) B on(A.CATEGORY = B.CATEGORY and A.PRICE = B.MAX_PRICE)
WHERE A.CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY MAX_PRICE DESC