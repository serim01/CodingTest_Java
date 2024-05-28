-- 코드를 입력하세요
select R.Food_type, REST_ID, REST_NAME, R.FAVORITES
from REST_INFO R join (
SELECT Food_type, max(favorites) FAVORITES
from REST_INFO
group by Food_type) F on (R.FAVORITES = F.FAVORITES and R.Food_type = F.Food_type)
order by Food_type desc