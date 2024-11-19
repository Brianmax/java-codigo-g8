package ejercicio7.clases;

import ejercicio7.interfaces.Usuario;

public abstract class Persona implements Usuario {
    protected String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

}
