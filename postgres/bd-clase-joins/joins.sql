

SELECT * from aerolineas;

SELECT * FROM aviones;

SELECT * FROM aerolineas JOIN aviones ON aerolineas.id_aerolinea = aviones.id_aerolinea_fk;

SELECT * FROM aerolineas a JOIN aviones av ON a.id_aerolinea = av.id_aerolinea_fk;


-- mostrar los vuelos con sus respectivos aviones



-- mostrar los aerolineas que son duenias de aviones y
-- aerolineas que no tienen aviones a su cargo

SELECT * FROM aerolineas a LEFT JOIN aviones av ON a.id_aerolinea = av.id_aerolinea_fk;



SELECT * FROM vuelos;

-- mostrar aviones que tienen vuelos a su cargo
-- y aviones sin vuelos a su cargo
SELECT * FROM aviones a LEFT JOIN vuelos v ON a.id_avion = v.id_avion_fk;


-- muestra los aviones que no tienen ningun vuelo a su cargo
-- left outter join
SELECT * FROM aviones a LEFT JOIN vuelos v ON a.id_avion = v.id_avion_fk
WHERE id_avion_fk IS NULL;

SELECT * FROM vuelos WHERE id_avion_fk IS NULL;


SELECT * FROM aviones a JOIN vuelos v ON a.id_avion = v.id_avion_fk;



-- seleccionar el boleto con el vuelo al que pertenece, seguido del pasajero

SELECT * FROM boletos b JOIN vuelos v on v.id_vuelo = b.id_vuelo_fk;

SELECT * FROM boletos b 
    JOIN vuelos v ON b.id_vuelo_fk = v.id_vuelo 
    JOIN pasajeros p ON id_pasajero_fk = p.id_pasajero;

-- seleccionar las areolineas con sus respectivos aviones
-- y que vuelos tienen asignados los aviones

SELECT * FROM aerolineas a 
    JOIN aviones av ON a.id_aerolinea = av.id_aerolinea_fk
    JOIN vuelos v ON id_avion = v.id_avion_fk;

SELECT * FROM vuelos;