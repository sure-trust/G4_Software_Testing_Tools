create database student1;
use student1;
create table student1(Sid char(10), Sname varchar(20), Sage int, Sdob date, Saddress varchar(20), Sphoneno varchar(10));
select * from student1;
insert into student1 (Sid, Sname, Sage, Sdob, Saddress, Sphoneno) values
('100','s1','20','2001-10-21','bangalore','1231456251'),
('101','s2','21','2002-08-15','mumbai','5847695412');

create database employee;
use employee;
create table employee(Ename varchar(10), Esalary float(20), Edob date, Edepartment varchar(20), Erecords int);
select * from employee;
insert into employee (Ename, Esalary, Edob, Edepartment, Erecords) values
('abhi','10000','1998-08-24','HR','10'),
('dhinakar','25000','1997-10-06','manager','20'),
('bindu','30000','1989-01-24','HR','30'),
('priya','35000','1988-05-16','accountant','45'),
('ram','40000','1980-06-17','developer','25');
select * from employee where Esalary > 10000;


select * from employee where Edepartment = 'HR';


select * from employee
LIMIT 5;


SELECT  COUNT(*) AS employee_count
FROM employee
WHERE Edob BETWEEN '1990-05-02' AND '1995-12-31';


SELECT  COUNT(*) AS employee_count
FROM employee
WHERE Edob not BETWEEN '1990-05-02' AND '1995-12-31';

SELECT *
FROM employee
WHERE LENGTH(Ename) = 5 AND RIGHT(Ename, 1) = 'A';


SELECT Edepartment, COUNT(*) AS employee_count
FROM employee
GROUP BY Edepartment
ORDER BY employee_count;


SELECT MAX(Esalary) AS second_highest_salary
FROM employee
WHERE Esalary < (SELECT MAX(Esalary) FROM employee);
