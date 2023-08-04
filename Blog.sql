create database ManagerBlog;
use ManagerBlog;
create table Blog(
id_blog int primary key auto_increment not null,
title_blog varchar(60) not null,
content_blog varchar(60) ,
creation_date date,
id_user int,
foreign key (id_user) references Users(id_user),
id_category int,
foreign key (id_category) references Category (id_category)
);
create table Users(
id_user int primary key auto_increment not null,
username varchar(60) not null,
passwordd varchar(60) not null,
email varchar(60) not null,
name varchar(60)
);
create table Category(
id_category int primary key auto_increment not null,
name_category varchar(60) not null
);
