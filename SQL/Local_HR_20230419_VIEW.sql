

-- 2023.04.19.

-- VIEW : 가상 테이블.
-- VIEW 객체는 SQL 가진다! => SQL 실행결과를 가상의 테이블로 사용.
select empno, ename, deptno 
from emp
where deptno=30
;

-- VIEW 객체 생성.
-- CREATE OR REPLACE VIEW 뷰이름 AS 서브쿼리.
create or replace view emp_view30
as select empno, ename, deptno 
   from emp
   where deptno=30
;

select * from emp_view30;

-- 주문정보 : ORDERS, BOOK, CUSTOMER.
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
from orders o, book b, customer c
where o.bookid=b.bookid and o.custid=c.custid
;

-- VIEW 생성.
create or replace view order_info 
as select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
   from orders o, book b, customer c
   where o.bookid=b.bookid and o.custid=c.custid
;

select * from order_info;
select bookname from order_info where name='박지성';

select view_name, text from user_views;

-- VIEW 의 삭제.
drop view emp_view30;


select rownum, ename, hiredate from emp order by hiredate;

create or replace view emp_hiredate_view
as select ename, hiredate from emp order by hiredate
;

select rownum, ename, hiredate 
from (select rownum, ename, hiredate from emp order by hiredate)
where rownum <= 3
order by hiredate
;

select rownum, ename, hiredate from emp_hiredate_view where rownum <= 3;

select to_char(hiredate, 'YYYY') from emp;