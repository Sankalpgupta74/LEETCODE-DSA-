# Write your MySQL query statement below
select author_id AS id
from views 
where author_id=viewer_id
group by author_id
order by id ASC;