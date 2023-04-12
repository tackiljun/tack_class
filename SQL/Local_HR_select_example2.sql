
-- select exmaple2.

desc book;
desc customer;


-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (1) 도서번호가 1인 도서의 이름.
select bookname from book where bookid=1;

-- teacher
select BOOKNAME
from BOOK
where BOOKID = 1
;


-- (2) 가격이 20,000원 이상인 도서의 이름.
select bookname from book where price=20000;

-- teacher
select BOOKNAME
from BOOK
where PRICE >= 20000
;



-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (3) 모든고객의이름, 주소
select NAME, ADDRESS from customer;

-- teacher
select NAME, ADDRESS 
from CUSTOMER
;


-- (4) 2014년 7월4일~7월7일 사이에 주문받은 도서의 주문번호
select orderid from orders where orderdate between '14/07/04' and '14/07/07';

-- teacher
select ORDERID
from ORDERS
where ORDERDATE between '14/07/04' and '14/07/07'
;


--(5) 2014년 7월4일~7월7일 사이에 주문받은 도서를 제외한 도서의 주문번호
select orderid from orders where orderdate not between '14/07/04' and '14/07/07';

-- teacher
select ORDERID
from ORDERS
where ORDERDATE not between '14/07/04' and '14/07/07'
;


-- (6) 성이 ‘김’씨인 고객의 이름과 주소.
select NAME, ADDRESS from customer where name like '김%';

-- teacher
select NAME, ADDRESS
from CUSTOMER
where NAME like '김%'
;


-- (7) 성이 ‘김’씨이고 이름이 ‘아’로 끝나는 고객의 이름과 주소.
select NAME, ADDRESS from customer where name like '김%아';

-- teacher
select NAME, ADDRESS 
from CUSTOMER
where NAME like '김%아'
;