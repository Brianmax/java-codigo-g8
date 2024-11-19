package ejercicio7.clases;

import ejercicio7.interfaces.Profesor;

import java.util.ArrayList;
import java.util.List;

public class SoloProfesor extends Persona implements Profesor {
    private List<Curso> cursosImpartidos;

    SoloProfesor(String nombre) {
        super(nombre);
        this.cursosImpartidos = new ArrayList<>();
    }

    @Override
    public void calificarExamen() {

    }

    @Override
    public void asignarTarea() {

    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }
}
