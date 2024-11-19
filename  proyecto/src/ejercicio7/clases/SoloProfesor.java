package ejercicio7.clases;

import ejercicio7.interfaces.Profesor;

import java.util.ArrayList;
import java.util.List;

public class SoloProfesor extends Persona implements Profesor {
    private List<Curso> cursosImpartidos;

    public SoloProfesor(String nombre) {
        super(nombre);
        this.cursosImpartidos = new ArrayList<>();
    }

    @Override
    public void calificarExamen() {
        System.out.println("SoloProfesor calificando examen");
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
