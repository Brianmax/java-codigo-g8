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


INSERT INTO profesor(nombre) VALUES ('Jorge');
INSERT INTO profesor(nombre) VALUES ('Juan');

SELECT * FROM profesor;

INSERT INTO curso(nombre, profesor_fk) VALUES ('CURSO 1', 1);
INSERT INTO curso(nombre, profesor_fk) VALUES ('CURSO 2', 1);
INSERT INTO curso(nombre, profesor_fk) VALUES ('CURSO 3', 2);


SELECT * FROM curso;


DELETE FROM profesor WHERE profesor_id = 1;

-- select a la tabla profesor

SELECT * FROM profesor;

-- select a la tabla de cursos

SELECT * FROM curso;

-- on delete cascade

CREATE TABLE IF NOT EXISTS orders (
    order_id SERIAL PRIMARY KEY,
    descripcion VARCHAR(255),
    order_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS item_order (
    id_item SERIAL PRIMARY KEY,
    product VARCHAR(255),
    qty INTEGER,
    price FLOAT,

    order_fk INTEGER,

    FOREIGN KEY(order_fk) REFERENCES orders(order_id)
);


INSERT INTO orders(descripcion, order_date) VALUES('order numero 1', '2024-10-12');
INSERT INTO orders(descripcion, order_date) VALUES('ordern numero 2', '2024-10-15');
INSERT INTO orders(descripcion, order_date) VALUES('ordern numero 3', '2024-10-20');

SELECT * FROM orders;

INSERT INTO item_order(product, qty, price, order_fk) VALUES ('Latop HP 143',5, 1999, 1);
INSERT INTO item_order(product, qty, price, order_fk) VALUES ('Macbook Pro M2',2, 5000, 1);
INSERT INTO item_order(product, qty, price, order_fk) VALUES ('Galaxi note',1, 2500, 1);

INSERT INTO item_order(product, qty, price, order_fk) VALUES ('Iphone',2, 4000, 2);
INSERT INTO item_order(product, qty, price, order_fk) VALUES ('Lavadora-Lg',2, 1500, 3);

SELECT * FROM item_order;

-- eliminamos un order

