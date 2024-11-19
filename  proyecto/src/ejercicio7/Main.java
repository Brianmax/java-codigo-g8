package ejercicio7;

import ejercicio7.clases.EstudianteProfesor;
import ejercicio7.clases.SoloEstudiante;
import ejercicio7.clases.SoloProfesor;
import ejercicio7.interfaces.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new EstudianteProfesor("George");
        Estudiante estudiante2 = new SoloEstudiante("Jose");

        // Estudiante estudiante3 = new SoloProfesor("were");

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        EstudianteProfesor estudianteProfesor = new EstudianteProfesor("Elvis");

        estudiantes.add(estudianteProfesor);

    }
}
