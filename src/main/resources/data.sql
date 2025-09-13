INSERT INTO Usuario(id, email, password, rol, activo, dni, nombre, apellido)
VALUES(null, 'juan.perez@email.com',
       'test', 'ADMIN', true,
       20444555,
       "Juan",
       "Perez"

       ),
    (null, 'ana.gomez@email.com', '123' , 'ADMIN' , false, 4588842,
     "Ana", "Gomez") ;



/*INSERT INTO UsuarioUnlam  (dni, nombre, apellido, email)
VALUES
    (12345678, 'Juan', 'Perez', 'juan.perez@email.com'),
    (87654321, 'Ana', 'Gomez', 'ana.gomez@email.com');
*/

INSERT INTO Carrera (nombre)
VALUES
    ('Ingenieria en Sistemas'),
    ('Licenciatura en Informatica');


INSERT INTO Carrera (nombre)
VALUES
    ('Ingenieria en Sistemas'),
    ('Licenciatura en Informatica');



-- carrera_id 1 es Ingenieria, 2 es Licenciatura
-- materia_id 1 = Programacion I, 2 = Base de Datos, 3 = Matematica Discreta



INSERT INTO Materia (codigo, nombre)
VALUES
    (1, 'Programacion I'),
    (2, 'Base de Datos'),
    (3, 'Matematica Discreta');


INSERT INTO carrera_materia (carrera_id, materia_id)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 1),
    (2, 2);




-- usuario_id 1 = Juan, 2 = Ana
-- carrera_id 1 = Ingenieria, 2 = Licenciatura

INSERT INTO alumno_carrera (alumno_id, carrera_id)
VALUES
    (1, 1),
    (2, 2);




-- usuario_id = 1 -> Juan
INSERT INTO Publicacion (descripcion, usuario_id)
VALUES
    ('Hola, esta es mi primera publicacion', 1),
    ('Segunda publicacion de Juan', 1);

-- usuario_id = 2 -> Ana
INSERT INTO Publicacion (descripcion, usuario_id)
VALUES
    ('Primera publicacion de Ana', 2);



INSERT INTO usuario_carrera (usuario_id, carrera_id)
VALUES
    (1, 1), -- usuario id 1 (Juan) con carrera id 1 (Sistemas)
    (2, 2); -- usuario id 2 (Ana) con carrera id 2 (Informática)