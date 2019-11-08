# MySQL

## 安装数据库 mysql

brew install mysql

## 开启数据库 mysql

mysql.server start

<!--p 加密码 -->
mysql -u root

## 创建数据库

mysql> create database cAuth;

## 使用数据库

mysql> use cAuth;

## 查看表

mysql> show tables;

## 查看数据库信息

mysql> select * from cSessionInfo;

## 创建表

create table test(id int, name varchar(100));

## 描述数据库

mysql> desc cSeesionInfo;

## 删除表

mysql> drop table test;

## 为表添加字段

mysql> alter table books add column count init default 0;
