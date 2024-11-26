CREATE DATABASE on_delete;

-- on delete set null

CREATE TABLE IF NOT EXISTS profesor (
    profesor_id SERIAL PRIMARY KEY,
    nombre VARCHAR(250)
);

CREATE TABLE IF NOT EXISTS curso(
    curso_id SERIAL PRIMARY KEY,
    nombre VARCHAR(250),

    profesor_fk INT,

    FOREIGN KEY(profesor_fk) REFERENCES profesor(profesor_id) ON DELETE SET NULL
);