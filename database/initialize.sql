create database shoppinglist_v1;
use shoppinglist_v1;
create table List (item varchar(256), id int NOT NULL UNIQUE AUTO_INCREMENT);
create user 'user'@'%' identified by 'kotki123';
grant select, insert on shoppinglist_v1.List to 'user'@'%';