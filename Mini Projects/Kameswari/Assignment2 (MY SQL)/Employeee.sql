create database Employee;
use Employee;
create table Emp(Eid char(4),Ename varchar(20),Edob date, Edepartment varchar(20),Edoj date,Esalary float(10),Elocation varchar(20),Egender char(1));
select * from Emp;
insert into Emp(Eid,Ename,Edob,Edepartment,Edoj,Esalary,Elocation,Egender) values
('001','Swapna','2000-02-09','HR','2021-05-23','40000','Hyderabad','F'),
('002','Ankit','2001-05-10','Marketing','2021-10-22','30000','Banglore','M'),
('003','Vishrudh','1998-03-09','Testing','2018-07-30','50000','Hyderabad','M'),
('004','Ridved','2000-10-08','Developing','2021-10-07','35000','Chennai','M'),
('005','Prerna','2002-02-09','Support','2023-11-06','25000','Kochi','F');
select * from Emp where Esalary>30000;
select Edepartment,count(Edepartment)from Emp where Edepartment='HR';
select * from Emp where Edepartment='HR';
select Eid,Ename,Esalary from Emp limit 3;
select count(Ename)from Emp where Edob between '1998-02-15' and '2000-12-31' Group by Egender;
select Egender, count(Egender) as EmpCount from Emp where Edob between '1998-02-15' and '2000-12-31' group by Egender;
select * from Emp where Ename like '_____a%';
select Edepartment,count(Edepartment) as Depcount from Emp group by Edepartment order by Depcount asc;
select * from Emp order by Esalary desc;
select Max(Esalary) from Emp Where Esalary not in(select max(Esalary)from Emp);
select Max(Esalary) from Emp Where Esalary < (select Max(Esalary) from Emp);
select * from Emp Where Edepartment in ('Marketing' , 'Testing');
select * from EMP Where Edob between'2000-01-01' and '2000-12-31';
select * from EMP Where Edob like '2000______%';
