create database primeradb char set utf8;
use primeradb;
create table primeraTabla(
idTabla int auto_increment,
nombre varchar(250),
descripcion text,
primary key(idtabla)
);
create table region(
idRegion int auto_increment,
nombreRegion varchar(250),
numeroRegion int(2),
primary key(idRegion)
);
create table permisos(
idP int auto_increment,
permiso varchar(250),
descripcionPermiso text,
primary key(idP)
);
create table colores(
idColor int auto_increment,
color varchar(250),
rgb varchar(250),
primary key(idColor)
);
alter table colores add column numero integer;
alter table primeraTabla add column numero integer;
alter table region add column numero integer;
alter table permisos add column numero integer;
alter table permisos drop column numero;
alter table region modify column numero double;
create database pborrara char set utf8;
create table borrar(
idColor int auto_increment,
color varchar(250),
rgb varchar(250),
primary key(idColor)
);
drop table borrar;
create database ejercicio210617 char set utf8;
use ejercicio210617;
create table tabla1(
id int auto_increment,
campo varchar(250),
primary key(id)
);
create table tabla2(
id int auto_increment,
campot2 varchar(250),
primary
 key(id)
);
alter table tabla1 add column campo2 integer;
alter table tabla1 add column campo3 integer;
alter table tabla2 add column campo4 integer;
alter table tabla2 add column campo5 integer;
alter table tabla1 modify column campo3 double;
alter table tabla2 modify column campo4 double;
alter table tabla1 drop column campo;
alter table tabla2 drop column campot2;
insert into tabla1 (campo2, campo3) values (1,2);
insert into tabla2 (campo4, campo5) values (1,2);

	