create database ejercico210618 char set utf8;
use ejercico210618;
create table Empleado(
idEmpleado int auto_increment,
nombre varchar(250),
apellidoP varchar(250),
apellidoM varchar(250),
edad int(11),
departamento varchar(250),
cargo varchar(250),
sueldo int(11),
fechaIngreso date,
primary key(idEmpleado)
);
create table Libro(
idLibro int auto_increment,
nombreLibro varchar(250),
autor varchar(250),
editorial varchar(250),
edicion varchar(250),
aniopublicacion int(11),
categoria varchar(250),
ejemplares varchar(250),
fechaIngreso date,
primary key(idLibro)
);
create table Tablal(
id int auto_increment,
campo varchar(250),

primary key(id)
);
use ejercico210618;
insert into Libro (nombreLibro, autor, editorial, edicion, aniopublicacion, categoria, ejemplares, fechaIngreso) values ('libro4','pedro gonzalez', 'perez', 'primera', 1976, 'ciencia', 1350000, '2021-05-01');
insert into Empleado (nombre, apellidoP, apellidoM, edad, departamento, cargo, sueldo, fechaIngreso) values ('pedro','gonzalez', 'perez', 35, 'ventas', 'vendedor', 1350000, '2021-05-01');
insert into Tabla (campo) values ('tu')
