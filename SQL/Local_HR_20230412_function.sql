
-- 2023.04.12.
-- 함수.

desc dual;
select * from dual;

-- 단일행 함수 / 집합(그룹)함수.
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수.

-- 숫자 처리 함수.
-- 절대값 abs.
select 10, -10, abs(-10), abs(10) 
from dual;     -- abs : 절대값.

-- floor : 소수점 아래를 절사.
select 2.1, 2.9, floor(2.1), floor(2.9) 
from dual;     -- floor : 소수점 이하는 잘라버림.

-- round : 지정 위치에서 반올림 처리.
select 1234.567, round(1234.567), round(1234.567, 1), round(1234.567, -1), round(1237.567, -1), round(1234.567, -2) 
from dual;

-- trunc : 특정 자리수 아래를 절사.
select 1234.567, trunc(1234.567), trunc(1234.567, 1), trunc(1234.567, -1), trunc(1234.567, -2) 
from dual;

-- MOD : 나머지 연산. - 함수를 통해서 나머지를 구할수 있다.
select mod(1, 3), mod(2, 3), mod(0, 3), mod(3, 0) 
from dual;     -- (---,0) -> 0으로 나누는건 X. 결과는 나옴(그대로).



-- 문자 처리 함수.
-- lower : 문자열 모두를 소문자로 변경.
select 'SCOTT', lower('SCOTT') 
from dual;
select dname, lower(dname) 
from dept;

-- upper : 문자열을 모두 대문자로 변경.
select 'scott', upper('scott') 
from dual;

-- initcap : 맨앞을 대문자로 변경.
select initcap('scott') 
from dual;


-- 문자열을 추출 : substr(원본, 시작위치), substr(원본, 시작위치, 반환할 문자의 개수)
select '안녕하세요. 손흥민입니다.', 
       substr('안녕하세요. 손흥민입니다.', 5),
       substr('안녕하세요. 손흥민입니다.', 2, 8)
from dual;

-- 문자열의 갯수 : length(원본문자열)
select length('안녕하세요.!!!!') 
from dual;

-- 문자열에서 특정 자리수를 지정하고 각 자리에 데이터가 없을 때 패턴을 입력.
-- lpad(), rpad().
-- 00010 char(10)
select '10', lpad('10', 10, '0'), rpad('11', 5, '*')
from dual;     -- lpad(원본, 자릿수, 앞에 채워질 숫자/문자). rpad(원본, 자릿수, 뒤에 채워질 숫자/문자)

select deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, '0')
from dept;

-- trim() : 공백 제거.
select '     ABC     '
       , trim('     ABC     ')
       , trim('     ABC')
       , trim('ABC     ')
from dual;
-- replace() : 
select 'Steven King',
        replace('Steven King', 'Steven', 'S'),
        replace('Steven King', 'Steven ', '')
from dual;



-- 날짜 함수.
-- sysdate : 현재 날짜를 반환.
select sysdate 
from dual;

-- months_between : 두 날짜 사이가 몇 개월인지를 반환.
select sysdate, months_between('23/12/15', sysdate)
from dual;

-- add_months : 특정 날짜에 개월 수를 더한다.
select add_months(sysdate, 8)
from dual;
select add_months(sysdate, -1)
from dual;
select add_months(sysdate, -3)
from dual;
select add_months(sysdate, -6) 
from dual;

-- next_day : 특정 날짜에서 최초로 도래하는 인자로 받은 요일의 날짜를 반환.
select next_day(sysdate, 1)
from dual;

-- last_day : 해당 달의 마지막 날짜를 반환.
select last_day(sysdate)
from dual;

-- round : 인자로 받은 날짜를 특정 기준으로 반올림.
select round(sysdate)
from dual;

-- trunc : 인자로 받은 날짜를 특정 기준으로 버린다.
select trunc(sysdate)
from dual;



-- 형 변환 함수.
-- DATE -> CHAR.
-- to_char(원본, '패턴').
select sysdate,
       to_char(sysdate, 'YYYY-MM-DD'),
       to_char(sysdate, 'YYYY.MM.DD'),
       to_char(sysdate, 'YYYY-MM-DD DAY'),
       to_char(sysdate, 'YYYY-MM-DD-DAY'),
       to_char(sysdate, 'YYYY.MM.DD.DAY'),
       to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

-- NUMBER -> CHAR.
-- to_char(원본숫자, '패턴').
select 123456789,
       -- 0 : 자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다.
       to_char(123456789, '000000000000'),
       -- , : 천 단위 자리 구분.
       to_char(123456789, '000,000,000,000'),
       -- 9 : 자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다.
       to_char(123456789, '999999999999'),
       to_char(123456789, '999,999,999,999'),
       -- L : 각 지역별 통화 기호를 앞에 표시, (L을 앞에 붙인다).
       to_char(123456789, 'L999,999,999,999'),
       to_char(123456789, '999,999')     -- 자릿수가 맞지 않으면 제대로 표현을 못함.
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSAL
from emp;

-- CHAR -> DATE.
-- to_date('문자열', '패턴').
select *
from emp
where hiredate = to_date('1981-02-20', 'YYYY.MM.DD')
-- to_date('02198120', 'YYYYMMDD')
;

insert into emp values(9999, 'SON', 'MANAGER', 7782, to_date('04-2023-12', 'MM-YYYY-DD'), 4000, null, 10);
select * from emp;
rollback;     -- 마지막 commit 시점으로 복귀.

-- CHAR -> NUMBER.
-- to_number('문자열', '패턴') => 숫자 타입으로 변경.
select '20000' - '10000'     -- 자동 형변환.
from dual;

select '20,000' - '10,000'     -- 오류난다. 
from dual;

select to_number('20,000', '999,999,999') - to_number('10,000', '99,999')
from dual;


-- DECODE 함수 => = 비교 연산 후 결과를 출력하는 함수. - SWITCH~CASE.
select ename, deptno, 
       decode(deptno,
              10, 'ACCOUNTING',
              20, 'RESEARCH',
              30, 'SALE',
              40, 'OPERATIONS'
        ) as dname
from emp
order by deptno
;

-- 8. 직급에 따라 
-- 급여를 인상하도록 하자.
-- 직급이 'ANAlYST'인 사원은 5%, 
-- 'SALESMAN'인 사원은 10%, 
-- 'MANAGER'인 사원은 15%, 
-- 'CLERK'인 사원은 20% 인상한다.
select ename, job, sal, 
       decode(job, 'ANAlYST', sal*1.05, 
                   'SALESMAN', sal*1.1, 
                   'MANAGER', sal*1.15, 
                   'CLERK', sal*1.2
              ) as UP,
       nvl(decode(job, 'ANALYST', sal*1.05,
                       'SALESMAN', sal*1.1,
                       'MANAGER', sal*1.15,
                       'CLERK', sal*1.2
                  ), sal) as UPSAL
from emp
order by sal desc;


-- CASE 함수.
select ename, deptno, 
       decode(deptno,
              10, 'ACCOUNTING',
              20, 'RESEARCH',
              30, 'SALE',
              40, 'OPERATIONS'
        ) as dname,
        case when deptno=10 then 'ACCOUNTING'
             when deptno=20 then 'RESEARCH'
             when deptno=30 then 'SALES'
             else 'OPERATIONS'
        end as dname2
from emp
order by deptno
;





-- 그룹함수, 집합함수, 집계함수, 다중행 함수.
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리.
-- SUM(합), AVG(평균), COUNT(총 개수), MAX(최대값), MIN(최소값). 

-- 급여 총액을 구해보자.
select sum(sal), to_char(sum(sal), 'L999,999')
from emp;

-- 커미션의 총액 구하기.
select sum(comm), count(comm), avg(comm)
from emp;
select comm from emp where comm is not null;


--  평균급여 구하기.
select avg(sal), trunc(avg(sal)), round(avg(sal),2)
from emp;


-- 최대급여 MAX(), 최소급여 MIN().
select max(sal), min(sal)
from emp;


-- COUNT() -> ROW 개수를.
-- 전체 사원의 수.
select count(*)
from emp;
-- 10번 부서의 사원 수.
select count(*) from emp where deptno=10;
-- 부서의 수.
select count(*) 
from dept;

select distinct job 
from emp
order by job
;
select count(distinct job)
from emp;

select count(comm)
from emp;


select * from emp order by deptno;



-- GROUP BY => 행 단위로 그룹핑.
select deptno, 
       count(*) as "사원의수", 
       sum(sal) as "총급여액", 
       -- avg(sal) as "평균급여액",
       trunc(avg(sal)) as "평균급여액",
       max(sal) as "최대급여액",
       min(sal) as "최소급여액",
       count(comm) as "커미션을받는사원수"
from emp
group by deptno
-- 그룹의 평균 급여가 2000 이상인
-- having avg(sal)>=2000     -- 그룹핑된 데이터의 집합함수 결과를 조건식으로 만들때.
-- 총 급여액이 10000을 넘어가는 그룹찾기.
having sum(sal)>10000
order by deptno
;

select job, count(*), trunc(avg(sal)), sum(sal), max(sal), min(sal), max(sal)-min(sal)
from emp
group by job
;


