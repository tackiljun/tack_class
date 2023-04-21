
-- SUBQUERY EXAM2.

-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (5) 박지성이 구매한 도서의 출판사 수.
select count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name='박지성'
;


-- (6) 박지성이 구매한 도서의 이름, 가격, (정가와 판매 가격의 차이).
select c.name, b.bookname, b.price, o.saleprice, b.price-o.saleprice as gap
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;


-- (7) 박지성이 구매하지 않은 도서의 이름.
-- -> 구매한 도서를 찾고 해당 범위를 반전(not).
-- 1 박지성이 구매한 도서의 BOOKID 찾기.
select distinct bookid 
from orders o, customer c 
where o.custid=c.custid and c.name='박지성'
;
-- 2 구매한 도서 찾기.
select *
from book
where bookid in (select distinct bookid 
                 from orders o, customer c 
                 where o.custid=c.custid and c.name='박지성')
;
-- 3 NOT으로 반전해서 구매하지 않은 도서의 도서명 찾기.
select bookname
from book
where bookid not in (select distinct bookid 
                     from orders o, customer c 
                     where o.custid=c.custid and c.name='박지성')
;



-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (8) 주문하지 않은 고객의 이름 (부속질의사용).
-- 1 주문한 고객의 고객번호 찾기.
select distinct custid from orders;
-- 2 고객 찾기.
select *
from customer
where custid in (select distinct custid from orders)
;
-- 반전시켜서 찾기.
select name
from customer
where custid not in (select distinct custid from orders)
;

-- (+)
-- 구매이력이 있는 고객들.
select *
from customer c
where exists (select * from orders o where c.custid=o.custid) 
-- select의 결과가 1행이라도 있으면 참 / ()가 상관관계가...
;
-- NOT으로 반전.
select *
from customer c
where not exists (select * from orders o where c.custid=o.custid)
;


-- (9) 주문금액의 총액과 주문의 평균금액.
-- 1 전체 총액,평균
select sum(saleprice) , avg(saleprice) from orders;


-- (10) 고객의 이름과 고객별 구매액.
-- group by, c.custid, c,name
-- 1 orders, customer 의 JOIN.
select *
from orders o, customer c
where o.custid=c.custid
;
-- 2 이름이 같을 수 있어서 GROUP BY 사용으로 찾기.
select c.custid, c.name
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
;
-- 3 ORDER BY 사용.
select c.name, sum(o.saleprice) as total
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
order by c.custid
;


-- (11) 고객의 이름과 고객이 구매한 도서목록.  -- customer, orders, book
-- 1 JOIN
select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;
-- 2
select c.name, b.bookname
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;


-- (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문.
-- 정가-판매가 => 최대 차이값.
-- 1 JOIN
select * 
from orders o, book b
where o.bookid=b.bookid
;
-- 2 최대 차이값 찾기.
select max(price-saleprice)
from orders o, book b
where o.bookid=b.bookid
;
-- 3
select *
from orders o, book b
where o.bookid=b.bookid
and b.price-o.saleprice = (select max(price-saleprice)
                           from orders o, book b
                           where o.bookid=b.bookid)
;
-- 4
select o.orderid, b.price, o.saleprice, b.price-o.saleprice as gap
from orders o, book b
where o.bookid=b.bookid
and b.price-o.saleprice = (select max(price-saleprice)
                           from orders o, book b
                           where o.bookid=b.bookid)
;


-- (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름.
-- 고객별 총 판매액 출력 조건 -> 총 평균보다 더 높은 값을 가지는 고객만.
-- 1
select *
from orders o, customer c
where o.custid=c.custid
;
-- 2
select *
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
;
-- 3
select c.custid, c.name, avg(o.saleprice) 
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
order by c.custid
;
-- 4
select c.custid, c.name, avg(o.saleprice) 
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
having avg(o.saleprice) > (평균)
order by c.custid
;
-- 5
select c.custid, c.name, avg(o.saleprice) 
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid
;
select avg(saleprice) from orders;



-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 
-- 출판사에서 도서를 구매한 고객의 이름.
-- ORDERS, BOOK => PUBLISHER IN ().
-- 1 전체 JOIN.
select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;
-- 2 박지성이 구매한 이력
select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name = '박지성'
;
-- 3
select distinct b.publisher
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and c.name = '박지성'
;
-- 4
select c.name
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
and b.publisher in (select distinct b.publisher
                  from orders o, book b, customer c
                  where o.bookid=b.bookid and o.custid=c.custid
                  and c.name = '박지성')
and c.name <> '박지성'
;


-- (2) 두 개 이상의 서로 다른 출판사에서 
-- 도서를 구매한 고객의 이름.
-- GROUP BY custid, name
-- 고객별 구매한 도서의 출판사의 수.
-- 1
select *
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;
-- 2
select c.custid, c.name
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
group by c.custid, c.name
;
-- 3
select c.custid, c.name, count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
group by c.custid, c.name
;
-- 4
select c.custid, c.name, count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
group by c.custid, c.name
having count(distinct b.publisher) > 1
;

-- 2개 이상의 출판사의 책을 구매한 회원 id.
-- 1
select *
from customer
where custid in ()
;
-- 2
select o.custid, count(distinct b.publisher)
from orders o, book b
where o.bookid=b.bookid
group by o.custid
;
-- 3
select o.custid
from orders o, book b
where o.bookid=b.bookid
group by o.custid
having count(distinct b.publisher) > 1
;
-- 4
select *
from customer
where custid in (select o.custid
                 from orders o, book b
                 where o.bookid=b.bookid
                 group by o.custid
                 having count(distinct b.publisher) > 1)
;