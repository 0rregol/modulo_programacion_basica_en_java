use ejercico210618;
select * from Libro where ejemplares > 100;
select apellidoP, apellidoM, cargo from Empleado where sueldo >500000 and departamento='ventas';
select nombreLibro, editorial, aniopublicacion, categoria, ejemplares, fechaIngreso from Libro where edicion='primera' or edicion='segunda' and autor='perez';
select autor from Libro where edicion='primera' or edicion='segunda' or edicion='tercera';
select nombre, apellidoP from Empleado where departamento='ventas';
select * from tabla where id not in(1,5);
select * from empleado where apellidoP not in('perez');
select * from Libro where edicion not in('Primera');
select * from tabla where id <>1;
select * from empleado where apellidoP <>'perez';
select * from Libro where edicion <>'Primera';
select * from tabla where id between 1 and 5;
select * from Libro where nombreLibro like 'li%';

