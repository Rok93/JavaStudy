select * from PRODUCT;

select * from employees

# 정렬된 상태에서 레코드 번호 이용
(레코드번호 >= 다른 숫자 비교)
select r, first_name, hire_date 
from(select rownum r, first_name, hire_date
	from (select  first_name, hire_date from EMPLOYEES 
			order by hire_date desc)
		)
where r >= ? and r <= ?
;



create table cart(
memberid varchar2(10),
productid number(5),
amount number(10) 
);