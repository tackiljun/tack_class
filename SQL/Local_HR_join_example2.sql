

-- JOIN example2.

select * from emp;
select * from dept;
select * from book;
select * from orders;
select * from customer;
select * from orders o, customer c, book b;

-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (5) 박지성이 구매한 도서의 출판사수.
select o.count(publisher)
from orders o, book b, customer c
where c.custid=1;


-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이.


-- (7) 박지성이 구매하지 않은 도서의 이름.



-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (8) 주문하지 않은 고객의 이름 (부속질의 사용).


-- (9) 주문금액의 총액과 주문의 평균금액.


-- (10) 고객의 이름과 고객별 구매액.


-- (11) 고객의 이름과 고객이 구매한 도서목록.


-- (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 
-- 차이가 가장 많은 주문.


-- (13) 도서의 판매액 평균보다 
-- 자신의 구매액 평균이 더 높은 고객의 이름.



-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 
-- 같은 출판사에서 도서를 구매한 고객의 이름.


-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름.





