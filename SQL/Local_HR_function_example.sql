
-- function example.

-- 16. SUBSTR 함수를 사용하여 사원들의 
-- 입사한 년도와 입사한 달만 출력하시오.
select ename, hiredate, substr(hiredate, 1, 5)
from emp;

-- 17. SUBSTR 함수를 사용하여 
-- 4월에 입사한 사원을 출력하시오.
select *
from emp
where substr(hiredate, 4, 2)=04;

-- 18. MOD 함수를 사용하여 
-- 사원번호가 짝수인 사람만 출력하시오.
select *
from emp
where mod(empno, 2)=0;

-- 19. 입사일을 년도는 2자리(YY), 
-- 월은 숫자(MM)로 표시하고 
-- 요일은 약어 (DY)로 지정하여 출력하시오.
select to_char(hiredate, 'YY-MM-DY')
from emp;

-- 20. 올해 몇 칠이 지났는지 출력하시오. 
-- 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
-- TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
select sysdate, between(sysdate, '23/01/01')
from dual;

-- 21. 사원들의 상관 사번을 출력하되 
-- 상관이 없는 사원에 대해서는 
-- NULL 값 대신 0으로 출력하시오.
select*
from emp;