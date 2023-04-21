
-- function example2.

-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
select * from orders;
select * from customer;

-- (3) 박지성의 총구매액 (박지성의 고객번호는 1번으로 놓고 작성).
--T
select sum(saleprice)
from orders
where custid=1;


-- (4)박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성).
-- T
select count(*)
from orders
where custid=1;



-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
select * from book;

-- (1) 마당서점 도서의 총 개수.
-- T
select count(*)
from book;

-- (2) 마당서점에 도서를 출고하는 출판사의 총 개수.
-- T
select count(distinct publisher)
from book
order by publisher;


​