create database exercise3;

use exercise3;

create table customer (
id integer,
customer_name varchar(255),
city_id integer,
customer_address varchar(255),
contact_person varchar(255),
email varchar(128),
phone varchar(128)
);

create table product (
id integer,
sku varchar(32),
product_name varchar(128),
product_description text,
current_price decimal(8, 2),
quantity_in_stock integer
);

create table invoice (
id integer,
invoice_number varchar(255),
customer_id integer,
user_account_id integer,
total_price decimal(8, 2),
time_due varchar(null),
time_paid varchar(null),
time_canceled varchar(null),
time_refunded varchar(null)
);

create table invoice_item (
id integer,
invoice_id integer,
product_id integer,
quantity integer,
price decimal(8, 2),
line_total_price decimal(8, 2)
);