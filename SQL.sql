create database placement_training;
use placement_training;
CREATE TABLE CSE (
    RNO INT,
    Name VARCHAR(50),
    Email VARCHAR(50),
    Mentor VARCHAR(50)
);
desc computer;
alter table cse add mobile_number long;
alter table cse drop mobile_number;
alter table cse rename to computer;
alter table computer rename column RNO to Roll_No;
insert into computer values(1,'Anand','anandhakumarak75@gmail.com','Karthik');
SELECT 
    *
FROM
    computer;
    
alter table computer add date_of_joining_in_college date;

SELECT 
    *
FROM
    computer;
    
insert into compute values(2,'Barani','baranikeshava@gmail.com','Sridhar','2025-07-30');
UPDATE computer 
SET 
    date_of_joining_in_college = '2025-03-20'
WHERE
    Roll_No = 1;

-- for updating the all the values in the table-- 
set SQL_SAFE_UPDATES=0;

use placement_training;
insert into computer values(3,'Bharathi','baranikeshava@gmail.com','Sridhar','2025-07-30'),
(4,'Ajay','baranikeshava@gmail.com','Sridhar','2025-07-30');



-- for bigint added mobile number in employee table
desc employee;
alter table employee add Mobile_No bigint;

select * from employee;

update employee set Mobile_No = 9988776655;

alter table employee drop Mobile_No;

set sql_safe_updates=0;

-- changing the column datatype
ALTER TABLE employee
MODIFY COLUMN EmpId bigint;


-- truncate-- 
-- truncate table_name;-- 
-- between, in ->(if we use the in we should use the '()' ), like->( (H% -> what name start with h it will display),(%h-> it will display which name end with h) ),-- 


select * from computer where name like "A%";

delete from computer where Roll_No = 4;

select * from computer where Roll_No in(1,3);

select * from computer where Roll_No Not in(1,3);

select * from computer where name like "%i";

alter table computer drop column date_of_joining_in_college;

alter table computer add age int;

update computer set age = 20;

select * from computer;

update computer set age = 21 where Roll_No = 2;

select * from computer where age between 20 and 30;

-- (order by) means it will diplay in orderly--
-- keywords -> (ASC,desc,limit )

select * from computer order by age;

select * from computer order by age desc;

select * from computer order by age limit 2;

select * from computer order by(case age
when 20 then 2
when 21 then 1
else 0 end);


-- Group by ->( remove the duplicates ) -- 
-- keywords used with group by -> (Having)
select age from computer group by age having age = 20;



-- Aggregate
-- functions(count, max, min, avg, sum)

SELECT 
    MAX(salary) AS Salary
FROM
    employee;
    
SELECT 
    COUNT(name) AS Count_person
FROM
    employee
WHERE
    salary > 60000;
    
SELECT 
    AVG(salary)
FROM
    employee;
    
SELECT 
    MIN(salary)
FROM
    employee;
    
SELECT 
    MAX(salary)
FROM
    employee;
    


-- functions ( ucase, lcase, concat, char_length, format)

select ucase(name) from employee;
select * from employee;
select lcase(name) from employee;
select concat("Hi", name) from employee;
select char_length(name) from employee;
select format(9988776655,"###-###-####");

-- Functions (now(), date(now()), curdate(), date_format(curdate(),'%d/%m/%y'), datediff(curdate(),'2025/07/09')->it will show how many days difference)
-- function for time(as same as date just change the date to time)

select now();
select date(now());
select curdate();
select date_format(curdate(),'%d/%m/%y');
select datediff(curdate(),'2026/01/20');
select date_add(curdate(), Interval 2 year);

desc employee;

-- join using foreign key

ALTER TABLE employee ADD UNIQUE (EmpID);

select*from employee;
create table employee2(
Sno int primary key, EmpID bigint, Name varchar(300), Date_of_join date,
foreign key (EmpID) references employee(EmpID)); 

Insert into employee2 values(1,1,'Alice','2025-07-20'),
(2,2,'Alice','2025-07-20'),(3,3,'Alice','2025-07-20');

select * from employee2;
select * from employee;

-- joins 4 types(inner, left, right,)
-- inner join will give the required data alone 
-- left join will also same but it will print the excess data stored in left table
-- right join will also same but it will print the excess data stored in right table
-- inner join or cross join or (join(instead of on use where)) all three will provide same functions


CREATE TABLE pt1 (
    sno INT,
    name VARCHAR(20),
    cname VARCHAR(30)
);
CREATE TABLE pt2 (
    sno INT,
    cname VARCHAR(30),
    cloc VARCHAR(30)
);
insert into pt1 values(1,'A','ZOHO'),(2,'B','IBM'),(3,'C','HCL');
INSERT INTO PT2 VALUES(1,'ZOHO', 'CHENNAI'),(2,'HCL','	COVAI'),(3,'VDART','TRICHY');


SELECT * FROM PT1;
SELECT * FROM PT2;

SELECT 
    PT1.SNO, PT1.NAME, PT1.CNAME, PT2.CLOC
FROM
    PT1
        INNER JOIN
    PT2 ON PT1.CNAME = PT2.CNAME;

-- 2nd method for inner join  using ' cross join'
SELECT  
    pt1.sno, pt1.name, pt2.cloc
FROM
    pt1
        CROSS JOIN
    pt2 ON pt1.cname = pt2.cname;
    
-- 3rd method for inner join using 'join'

SELECT 
    pt1.sno, pt1.name, pt2.cloc
FROM
    pt1
         JOIN
    pt2 WHERE pt1.cname = pt2.cname;
    

use placement_training;
-- left join
SELECT 
    pt1.sno, pt1.name, pt2.cloc
FROM
    pt1
        LEFT JOIN
    pt2 ON pt1.cname = pt2.cname;

-- right join
SELECT 
    pt1.sno, pt1.name, pt2.cloc
FROM
    pt1
        RIGHT JOIN
    pt2 ON pt1.cname = pt2.cname;

-- DCL 
-- Grant
grant select, insert on placement_training.* to 'newuser';

-- REVOKE
revoke select, insert on placement_training.* from 'newuser';


-- TCL
-- commit, rollback, savepoint, begin