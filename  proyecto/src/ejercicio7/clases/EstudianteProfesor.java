package ejercicio7.clases;

import ejercicio7.interfaces.Estudiante;
import ejercicio7.interfaces.Profesor;

import java.util.ArrayList;
import java.util.List;

public class EstudianteProfesor extends Persona implements Estudiante, Profesor {

    private List<Curso> cursosInscritos;
    private List<Curso> cursosImpartidos;

    public EstudianteProfesor(String nombre) {
        super(nombre);
        this.cursosImpartidos = new ArrayList<>();
        this.cursosInscritos = new ArrayList<>();
    }

    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

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
