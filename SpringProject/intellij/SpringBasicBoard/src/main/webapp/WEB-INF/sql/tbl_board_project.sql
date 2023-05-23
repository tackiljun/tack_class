

-- tbl_board SQL

-- select
select * from tbl_board;

select bno, title, content, file, uname as writer, memidx
from tbl_board b, member m where b.memidx = m.idx;


-- insert
insert into tbl_board (title, content, writer) 
values ('게시글 테스트1', '게시글 쓰기테스트1', '테스터');
-- insert into tbl_board (title, content, writer) values (#{}, #{}, #{});


insert into tbl_board (title, content, memidx)
value ('게시글 테스트1', '글쓰기 테스트1', 1);

-- insert into tbl_board (title, content, memidx) value (#{}, #{}, #{})


insert into tbl_board (title, content, memidx)
value ('게시글 테스트1', '글쓰기 테스트1', 5);


-- update
update tbl_board 
set title='test11', content='test22', writer='test33', file='aa.jpg' 
where bno=8;
-- update tbl_board set title=#{}, content=#{}, writer=#{}, file=#{} where bno=#{};


-- delete