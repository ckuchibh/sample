REM   Script: Activity_7
REM   aggregate_operations

select SUM(purchase_amount) AS "Total sum" from orders;

select AVG(purchase_amount) AS "Average" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

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

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no, order_date from orders order by order_date;

select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select distinct salesman_id from orders;

select order_no, order_date from orders order by order_date;

select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

select * from orders;

select SUM(purchase_amount) AS "Total sum" from orders;

select AVG(purchase_amount) AS "Average" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

