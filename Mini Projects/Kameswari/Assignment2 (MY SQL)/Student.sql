create database Student;
use Student
create table stud(Sid char(4),Sname varchar(20), Sclass int, Sgrade char(2), Slocation varchar(20));
drop table stud;
select * from stud;
insert into stud(Sid,Sname,Sclass,Sgrade,Slocation) values
('001','Swapna','9','A','Hyderabad'),
('002','Ankit','10','B','Banglore'),
('003','Vishrudh','9','A','Hyderabad'),
('004','Ridved','8','A','Chennai'),
('005','Prerna','9','B','Kochi');
select Sid,Sname,Sclass from stud where Slocation='Hyderabad';
