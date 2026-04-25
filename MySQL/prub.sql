CREATE SCHEMA IF NOT EXISTS unculo; /* para crear */

USE unculo;

CREATE TABLE lalala(
ID INT(50) Primary key auto_increment,
nombre VARCHAR(20),
anos VARCHAR(3) 
);

SELECT * FROM unculo.lalala; /* para ver la planilla --- no hace falta que ponga unculo. por que esta con "USE" el unculo */
SELECT * FROM unculo.lalala lalala1;

INSERT INTO lalala VALUES(3,'tresculos','4');/* agregar algo a la tabla creada */

ALTER TABLE lalala 
MODIFY nombre VARCHAR(30); /* Modificar lo que se pone en la tabla */

UPDATE lalala SET nombre='culito' WHERE ID=1; /* Modifica el valor de la caja señalada o señaladas */

SELECT count(*) FROM lalala; /*Te cuenta la cantidad de items en la tabla */
SELECT count(*) FROM lalala WHERE nombre='culo'; /* te cuenta los elementos de la tabla que tengan ese nombre */
SELECT max(ID); /*trae el maximo id y con min() el minimo id*/ 
SELECT * FROM lalala WHERE ID IN (3,5); /* trae los que tengan el numero 3 y 5 dentro del id*/
SELECT * FROM lalala WHERE nombre LIKE '%pa%'; /* trae todos los que contenga pa en su nombre tabien puede ser '%pa' y 'pa%' */
/* SIEMPRE que sea buscar algo que no sea una total igualdad va con LIKE */ 
SELECT * FROM lalala WHERE ID BETWEEN 2 and 7;/* trae a los que esten entre el id 2 y 7 */

DROP SCHEMA unculo; /* pa borrar todo a la verga */