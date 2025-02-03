create database bootcamp_exercise_1;

use bootcamp_exercise_1;

create table regions(
region_id integer PRIMARY KEY,
region_name varchar(25)
);
insert into regions (region_id, region_name)
               values (1, 'Europe');
insert into regions (region_id, region_name)
	           values (2, 'Asia');
delete from regions;
drop table regions;
select * from regions;


create table countries (
country_id char(2) PRIMARY KEY,
country_name varchar(40),
region_id integer,
FOREIGN KEY(region_id) references regions (region_id)
);
insert into countries (country_id, country_name, region_id)
               values ('It', 'Italy', 1);
insert into countries (country_id, country_name, region_id)
               values ('Ja', 'Japan', 2);           
delete from countries;
drop table countries;
select * from countries;

           
create table locations (
location_id integer PRIMARY KEY,
street_address varchar(25),
postal_code varchar(12),
city varchar(30),
state_prc varchar(12),
country_id char(2),
FOREIGN KEY(country_id) references countries (country_id)
);
insert into locations (location_id, street_address, postal_code, city, state_prc, country_id) 
               values (100, '123 ABC street', '100', 'Roma', 'It', 'It');
insert into locations (location_id, street_address, postal_code, city, state_prc, country_id) 
               values (200, '234 BCD street', '200', 'Tokyo', 'Ja', 'Ja');
delete from locations;
drop table locations;
select * from locations;


create table departments (
department_id integer PRIMARY KEY,
department_name varchar(30),
manager_id integer,
location_id integer,
FOREIGN KEY(location_id) references locations (location_id)
);
insert into departments (department_id, department_name, manager_id, location_id)
                 values (1000, 'Administration', 12345, 100);
insert into departments (department_id, department_name, manager_id, location_id)
                 values (2000, 'Marketing', 12346, 200);
delete from departments;
drop table departments;
select * from departments;

create table jobs (
job_id varchar(10) PRIMARY KEY,
job_title varchar(35),
min_salary integer,
max_salary integer
);
insert into jobs (job_id, job_title, min_salary, max_salary)
                 values ('jobA', 'job_A', 9, 999);
insert into jobs (job_id, job_title, min_salary, max_salary)
                 values ('jobB', 'job_B', 9, 999);
delete from jobs;
drop table jobs;
select * from jobs;


create table employees (
employee_id integer PRIMARY KEY,
first_name varchar(20),
last_name varchar(25),
email varchar(25),
phone_number varchar(20),
hire_date date,
job_id varchar(10),
FOREIGN KEY(job_id) references jobs (job_id),
salary decimal(6,2),
commision_pct decimal(8,2),
manager_id integer,
department_id integer,
FOREIGN KEY(department_id) references departments (department_id)
);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commision_pct, manager_id, department_id)
			   values ('100001', 'Apple', 'chan', 'apple_chan@gmail.com', 21111111, '2000-01-01', 'jobA', 1000.00, 2000.00, 12345, 1000);
insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commision_pct, manager_id, department_id)
			   values ('100002', 'Billy', 'cheng', 'billy_cheng@gmail.com', 21111112, '2000-02-02', 'jobB', 1000.00, 2000.00, 12346, 2000);
delete from employees;
drop table employees;
select * from employees;


create table job_history (
employee_id integer,
FOREIGN KEY(employee_id) references employees (employee_id),
start_date date,
end_date date,
job_id varchar(10),
FOREIGN KEY(job_id) references jobs (job_id),
department_id integer,
FOREIGN KEY(department_id) references departments (department_id)
);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
			   values ('100001', '2010-01-01', '2010-12-31', 'jobA', 1000);
insert into job_history (employee_id, start_date, end_date, job_id, department_id)
			   values ('100002', '2011-01-01', '2011-12-31', 'jobB', 2000);
delete from job_history;
drop table job_history;
select * from job_history;


-- create table job_grades(
-- grade_level varchar(2),
-- lowest_sal integer,
-- highest_sal integer
-- );

select l.location_id, l.street_address, l.city, l.state_prc, c.country_name
from locations l left join countries c 
on  l.country_id = c.country_id ;




