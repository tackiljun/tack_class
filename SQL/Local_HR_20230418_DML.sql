

-- 2023.04.18.
-- DML : 입력, 수정, 삭제. ( ->  수정, 삭제할 때 조건 주의!!! )
-- => CREATE(INSERT), READ(SELECT), UPDATE(UPDATE), DELETE(DELETE) => CRUD.

-- INSERT : 데이터를 행단위로 입력.

-- 테스트 테이블 생성.
create table dept01 (
       deptno number(2) constraint PK_DEPT01_DEPTNO primary key,
       dname varchar2(10) not null,
       loc varchar2(10)
);
desc dept01;


-- INSERT INTO 테이블이름 (컬럼, 컬럼, ...) VALUES (데이터, 데이터, ...)
insert into dept01 (deptno, dname,     loc    ) 
            values (10,     'test', 'test-LOC');
insert into dept01 (loc,    dname, deptno)
            values ('서울', '개발팀',  20  );
-- 오류.            
insert into dept01 (deptno, dname,  loc         )   -- SQL 오류: ORA-00913: 값의 수가 너무 많습니다.
            values (30,     'QA',  '서울', 'memo');  -- 00913. 00000 -  "too many values"
-- 오류.            
insert into dept01 (deptno, dname,  loc)  -- SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다.
            values (30,     'QA');        -- 00947. 00000 -  "not enough values".
-- 오류X.
insert into dept01 (deptno, dname)
            values (30,     'QA' );
-- 오류.            
insert into dept01 (deptno, dname)
            values (null,    null);  -- NULL을 ("HR"."DEPT01"."DEPTNO") 안에 삽입할 수 없습니다.
-- 오류 : NOT NULL 제약이 있는 컬럼은 반드시 데이터를 입력해야한다.
insert into dept01 (deptno, loc )
            values (30,    '제주');  -- NULL을 ("HR"."DEPT01"."DNAME") 안에 삽입할 수 없습니다.
-- 오류.
insert into dept01 (deptno, danme)   -- SQL 오류: ORA-00904: "DANME": 부적합한 식별자.
            values (30,     'QA' );  -- 00904. 00000 -  "%s: invalid identifier".
            
select * from dept01;


-- 모든 컬럼의 데이터를 입력하는 경우 -> 컬럼명을 생략하고 사용가능.
insert into dept01 values (40, '기획팀', '대전');


-- NULL 값의 입력.
-- 명시적 입력, 암묵적 입력.
-- 명시적 입력.
insert into dept01 values (50, 'test', null);
insert into dept01 values (70, 'test111', '');
-- 암묵적 입력.
insert into dept01 (deptno, dname) values (60, 'Test123');


-- 서브쿼리를 이용한 데이터 입력.
create table dept02
as 
select * from dept where 1=0
;
desc dept02;

insert into dept02
select * from dept;

select * from dept02;


-- UPDATE : 행단위 컬럼들의 데이터를 변경-> 해당 컬럼의 값을 입력/수정/삭제.
-- UPDATE 테이블이름 SET 컬럼1=새로운 값, 컬럼2=새로운 값, ... WHERE 행을 선택하는 조건.

select * from dept01;
-- 10번 부서의 이름을 '디자인팀'으로 변경하고, 위치 정보를 '판교'로 수정하자.
update dept01
set dname='디자인', loc='판교'
where deptno=10;

drop table dept02;

create table dept02
as select * from dept;

drop table emp01;

create table emp01
as select * from emp;

select * from emp01;

-- 모든 사원의 부서번호를 30번으로 수정합시다.
update emp01
set deptno = 30
;
-- 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE문을 보겠습니다.
update emp01
set sal = sal*1.1
;
-- 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
update emp01
set hiredate = sysdate
;

-- 특정행을 수정할 경우 WHERE 의 조건으로 행을 선택.
select * from emp01;
-- 부서번호가 10번인 
-- 사원의 부서번호를 30번으로 수정합시다.
update emp01
set deptno=30
where deptno=10
;
-- 급여가 3000 이상인 사원만 
-- 급여를 10% 인상합시다.
update emp01
set sal = sal*1.1
where sal >= 3000
;
-- 1987년에 입사한 사원의 
-- 입사일이 오늘로 수정합시다.
update emp01
set hiredate = sysdate
where substr(hiredate, 1, 2) = 87
;
-- SCOTT 사원의 
-- 부서번호는 40번으로, 
-- 직급은 MANAGER로 한꺼번에 수정하도록 합시다.
update emp01
set deptno=40, job='MANAGER'
where ename='SCOTT'
;
-- SCOTT 사원의 
-- 입사일자는 오늘로, 
-- 급여를 50 으로 
-- 커미션을 4000 으로 수정합시다.
update emp01
set hiredate=sysdate, sal=50, comm=4000
where ename='SCOTT'
;


-- 서브쿼리를 이용한 데이터 수정.
-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경.
select * from dept02;
select loc from dept02 where deptno=40;

update dept02
set loc = (select loc from dept02 where deptno=40)
where deptno = 20
;

-- 서브 쿼리를 이용해서 
-- 부서번호가 20인 부서의 부서명과 지역명을 
-- 부서 번호가 30번인 부서와 동일하게 변경.
update dept02
set (dname, loc) = (select dname, loc from dept02 where deptno=30)
where deptno=20
;


-- DELETE : 테이블의 행 단위 삭제.
-- DELETE FROM 테이블이름 WHERE 행을 선택하는 조건.
select * from dept02;
-- dept01 테이블의 모든 행을 삭제 -> 모든 부서정보를 삭제.
delete from dept01;

-- 부서 테이블 dept02에서 30번 부서만 삭제합시다.
delete from dept02 where deptno=30;

select * from dept02;
select * from emp01;
-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제해봅시다.
select deptno from dept02 where dname='SALES';
delete from emp01 where deptno=(select deptno from dept02 where dname='SALES');
desc dept02;

commit;

delete from emp;

select * from emp;

select * from emp01;

delete from emp01;

rollback;





-- SEQUENCE : 연속된 숫자를 생성해주는 객체.
-- CREATE SEQUENCE 이름 [필요한 옵션]
DROP SEQUENCE SEQ_DEPT_DEPTNO;
CREATE SEQUENCE SEQ_DEPT_DEPTNO
INCREMENT BY 10
START WITH 10
;

-- 자동 생성된 값 : 시퀀스객체이름.nextval.
select seq_dept_deptno.nextval
from dual;
select * from dept01;
insert into dept01 values (seq_dept_deptno.nextval, 'test이름', 'test위치');

select seq_dept_deptno.currval
from dual;