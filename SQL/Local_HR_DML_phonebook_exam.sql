

-- 전화번호 저장 테이블.

-- 제시된 테이블 정의서를 보고 DDL 을 완성해봅시다.
-- 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.
-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL.
-- create table phoneInfo_basic (
--               column name as '컬럼명', type as '타입', 
--               key as '키', null, Default, account as '설명')              
--   (IDX number(6) PHONEINFOBASIC_IDX_PK primary key,
--    FR_NAME VARCHAR2(20) constraint PHONEINFOBASIC_NAME_FR not null,
--    FR_PHONENUMBER VARCHAR2(20) constraint PHONEINFOBASIC_PHONENUMBER_FR not null,
--    FR_EMAIL VARCHAR2(20) not null,
--    FR_ADDRESS VARCHAR2(20),
--    FR_REGDATE DATE SYSDATE
--);
-- 실패.

select * from phoneInfo_basic;
desc phoneInfo_basic;
drop table phoneInfo_basic;

desc phoneinfo_univ;
drop table phoneinfo_univ;

desc phoneinfo_com;
drop table phoneinfo_com;


-- 다시.
create table phoneInfo_basic (
                    IDX number(6) constraint PHONEINFOBASIC_IDX primary key not null,
                    FR_NAME VARCHAR2(20) constraint PHONEINFOBASIC_FRNAME_NAME not null,
                    FR_PHONENUMBER VARCHAR2(20) constraint PHONEINFOBASIC_FR_PHONENUMBER not null,
                    FR_EMAIL VARCHAR2(20) constraint PHONEINFOBASIC_FR_EMAIL null,
                    FR_ADDRESS VARCHAR2(20) constraint PHONEINFOBASIC_FR_ADDRESS null,
                    FR_REGDATE DATE default SYSDATE constraint PHONEINFOBASIC_FR_REGDATE null
);



-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL.
create table phoneinfo_univ (
                    IDX NUMBER(6) constraint PHONEINFOUNIV_IDX primary key not null,
                    FR_U_MAJOR VARCHAR2(20) default 'N' constraint PHONEINFOUNIV_FR_U_MAJOR not null,
                    FR_U_YEAR NUMBER(1) default 1 constraint PHONEINFOUNIV_FR_U_YEAR not null,
                    FR_REF NUMBER(7) constraint PHONEINFOUNIV_FR_REF not null REFERENCES phoneInfo_basic(idx)
);



-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL.
create table phoneinfo_com (
                    IDX NUMBER(6) constraint PHONEINFOCOM_IDX primary key not null,
                    FR_C_COMPANY VARCHAR2(20) default 'N' constraint PHONEINFOCOM_FR_C_COMPANY not null,
                    FR_REF NUMBER(6) constraint PHONEINFOCOM_FR_REF not null REFERENCES phoneInfo_basic(idx)
);
