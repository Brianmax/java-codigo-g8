

SELECT * from aerolineas;

SELECT * FROM aviones;

SELECT * FROM aerolineas JOIN aviones ON aerolineas.id_aerolinea = aviones.id_aerolinea_fk;

SELECT * FROM aerolineas a JOIN aviones av ON a.id_aerolinea = av.id_aerolinea_fk;


-- mostrar los vuelos con sus respectivos aviones



-- mostrar los aerolineas que son duenias de aviones y
-- aerolineas que no tienen aviones a su cargo

SELECT * FROM aerolineas a LEFT JOIN aviones av ON a.id_aerolinea = av.id_aerolinea_fk;



SELECT * FROM vuelos;

-- mostrar aviones que tengan vuelos a su cargo
-- y aviones sin vuelos a su cargo
SELECT * FROM aviones a LEFT JOIN vuelos v ON a.id_avion = v.id_avion_fk
WHERE id_avion_fk IS NULL;