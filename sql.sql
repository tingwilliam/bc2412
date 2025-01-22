-- this is a commit
-- MYSQLWorkbench is a client side -> connect (ip/port/id/password) -> MySQL Server (7x24)

-- MySQL DBMS -> case insensitive

create database bootcamp_2412;

-- Use database
use bootcamp_2412;

-- MYSQL Server may contains many databases, one database may contains many tables
-- varchar = String
create table customers (
    id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date
);

-- * means all columns
select * from customers;

insert into customers (id, first_name, last_name, email, dob) values (1, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');
insert into customers (id, first_name, last_name, email, dob) values (2, 'Lucas', 'Lau', 'lucaslau@gmail.com', '1999-10-31');
insert into customers (id, first_name, last_name, email, dob) values (3, 'Sally', 'Wong', 'sallywong@gmail.com', '2000-01-31');
 
 -- delete all data from table
 delete from customers;
 
 -- delete data by criteria
 delete from customers where last_name = 'Wong';
 
 -- select specific columns
 -- select is to choose columns
 select id, first_name, dob from customers;
 
 -- where is to control rows
 select id, first_name, dob from customers where dob < '2000-01-01';
 
 select * from customers where last_name = 'Lau' and dob > '1999-12-01';
 select * from customers where  last_name = 'Lau' or first_name = 'Sally';
 
 -- and has higher priority to execute
 select * from customers where  last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';
 select * from customers where  (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';
 
 -- Not equals to
 select * from customers where last_name <> 'Wong';
 
 -- order by
 select * from customers order by first_name;
  -- order by asc
 select * from customers order by first_name asc;
   -- order by desc
 select * from customers order by first_name desc;
 
 select* from customers where dob > '2000-01-01' order by id desc; -- stream.filter().sorted()
 
-- table: orders
-- id, amount, order_date, customer_id
create table orders (
    id integer,
    amount integer,
    order_date
    email 
    dob date
);

 