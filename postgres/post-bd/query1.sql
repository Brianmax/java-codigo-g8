select * from usuario;

select * from categoria;

select * from post;

select * from comentario;

-- aumentando capacidad varchar a el atributo titulo
-- de la tabla post

ALTER TABLE post ALTER COLUMN titulo TYPE VARCHAR(255);

ALTER TABLE comentario ALTER COLUMN contenido TYPE VARCHAR(500);

------ 

-- select a los post con el usuario fk igual a 12

SELECT * FROM post WHERE usuario_fk = 12;

-- select a los comentarios con el usuario fk igual a 12

SELECT * FROM comentario WHERE usuario_fk = 12;

-- select a los comentarios con el usuario fk igual a 12 y el post fk igual a 145

SELECT * FROM comentario WHERE usuario_fk = 12 AND post_fk = 145;

-- eliminando la categoria Kantar

DELETE FROM categoria WHERE titulo = 'Kantar';

-- eliminar usuario con el id 12

DELETE FROM usuario WHERE usuario_id = 12;

DELETE FROM post WHERE usuario_fk = 12;