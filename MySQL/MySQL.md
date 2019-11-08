# mysql

## install

```node
brew intall mysql
mysql.server start
mysql -u root
```

- 1 用户管理

- 2 新建用户

  > create user name identified by 'ssapdrow';

- 3 更改密码

  > set password for name=password('fddfd');

- 4 权限管理

- 查看 name 用户权限

  > show grants for name;

- 给 name 用户 db_name 数据库的所有权限

  > grant select on db_name .\* to name;

- grant 反操作,去除权限
  > revoke select on db_name .\* to name;

## 数据库操作

- 查看数据库

  > show databases;

- 创建数据库

  > create database db_name;

- 使用数据库

  > user db_name;

- 删除数据库
  > drop database db_name;

## 创建表

- id 值，无符号，非空，递增，唯一性，可做主键

```sql
create table table_namel(
id tinyint unsigned not null auto_increment,
name varchar(60) not null
score tinyint unsigend not null default 0; // 设置默认列值
primary key(id)
) engine=InnoDB // 设置表的搜索引擎，InnoDB || MyISAM, InnoDB可靠,支持事物;MyISAM高效不支持全文搜索

create table if not exists table_name (
    id tinyint unsigned not null auto_increment,
    name varchar(60) not null score tinyint unsigend not null default 0,
    primary key(id)
) engine=InnoDB
```

- 复制表

  > create table tb_name select \* from tb_name;

- 部分复制

  > create table tb_name select id, name from tb_name;

- 创建临时表

  > create temporary table tb_name;

- 查看数据库中可用的表

  > show tables;

- 查看表的结构

  > describe tb_name;

- 删除表

  > drop [temporary] table [if exists] tb_name [ ,tb_name2...];
  > drop table if exists tb_name;

- 表重命名
  > rename table name_old to name_new
