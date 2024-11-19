package ejercicio7.clases;

import ejercicio7.interfaces.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class SoloEstudiante extends Persona implements Estudiante {
    private List<Curso> cursos;

    SoloEstudiante(String nombre) {
        super(nombre);
        this.cursos = new ArrayList<>();
    }

    @Override
    public void matricularCurso() {
        
    }

    @Override
    public void entregarTarea() {

    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }
}
