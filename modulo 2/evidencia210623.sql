use ejercico210618;
select * from Libro where editorial not in('planeta', 'mundo');
select nombreLibro, editorial, ejemplares from Libro where ejemplares between 100 and 300;
select nombre, apellidoP, cargo from Empleado where sueldo between 550000 and 750000;
select nombre, apellidoP, apellidoM, cargo, departamento, edad from Empleado where departamento <> 'informatica';
select * from Tabla order by id desc;
select * from Libro order by edicion desc;
select * from Empleado order by sueldo asc;
select * from Empleado order by cargo desc;
select nombre, apellidoP, cargo, departamento from Empleado order by departamento desc;
select nombre, cargo, sueldo from Empleado order by sueldo desc;
select autor, nombreLibro, editorial from Libro order by editorial asc;
select * from Libro order by ejemplares desc;
select count(id) as cantidad from Tabla;
select count(idEmpleado) as cantidad from Empleado;
select count(idLibro) as cantidad from Libro;
select max(id) from tabla;
select max(sueldo) from Empleado;
select min(idLibro) from Libro;
select sum(id) from Tabla;
select sum(sueldo) from Empleado;
select Sum(ejemplares) from Libro;
