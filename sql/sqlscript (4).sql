REM   Script: Activity_5
REM    update with where

create table salesman( 
salesman_id int, 
salesman_name varchar2(50), 
salesman_city varchar2(40) 
commission int);

create table salesman( 
salesman_id int, 
salesman_name varchar2(50), 
salesman_city varchar2(40) 
commission int 
);

create table salesman( 
salesman_id int, 
salesman_name varchar2(50), 
salesman_city varchar2(40), 
commission int 
);

describe table salesman


commit


describe table salesman


describe salesman


insert into salesman values(5001,'Ramya','Hyderabad',12);

select * from salesman;

insert all 
into salesman values(5002,'Madhuri','Hyderabad',12) 
into salesman values(5003,'Ramu','Banglore',13) 
into salesman values(5004,'Chandu','Delhi',10) 
into salesman values(5005,'Preethi','Goa',9) 
into salesman values(5006,'Sruthi','Mumbai',17);

insert all 
into salesman values(5002,'Madhuri','Hyderabad',12) 
into salesman values(5003,'Ramu','Banglore',13) 
into salesman values(5004,'Chandu','Delhi',10) 
into salesman values(5005,'Preethi','Goa',9) 
into salesman values(5006,'Sruthi','Mumbai',17) 
Select 1 from Dual;

select * from salesman;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city = 'Hyderabad';

select salesman_id,commision from salesman where salesman_name = 'Madhuri';

select * from salesman where salesman_city = 'Hyderabad';

select salesman_id,commission from salesman where salesman_name = 'Madhuri';

alter table salesman add grade int;

select * from salesman;

update table salesman set grade = 100;

alter table salesman add grade int;

update salesman set grade = 100;

select * from salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Hyderbad';

UPDATE salesman SET grade=300 WHERE salesman_name='Banglore';

UPDATE salesman SET salesman_name='Ramya' WHERE salesman_name='Ramya Guptha';

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Hyderbad';

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Hyderbad';

UPDATE salesman SET grade=200 WHERE salesman_city='Hyderabad';

UPDATE salesman SET grade=300 WHERE salesman_name='Bangalore';

SELECT * FROM salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='Banglore';

UPDATE salesman SET grade=300 WHERE salesman_name='Madhuri';

UPDATE salesman SET salesman_name='Ramya' WHERE salesman_name='Ramya Guptha';

SELECT * FROM salesman;

UPDATE salesman SET salesman_name='Ramya Guptha' WHERE salesman_name='Ramya';

SELECT * FROM salesman;

