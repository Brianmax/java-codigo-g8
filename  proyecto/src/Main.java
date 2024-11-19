//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import herencia.Estudiante;
import herencia.Persona;
import herencia.Profesor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola mundo");

        int edad = 27;

        System.out.println(edad);

        float estatura = 1.7f;

        System.out.println(estatura);

        // double PI = 3.142342;

        char caracter = 'b';

        String apellido = "Maxi";

        System.out.println(apellido);

        String nombre = "George";

        System.out.println(nombre + " " + apellido);

        // Hola me llamo "nombre" "apellido", vivo en "ciudad" y tengo "edad"

        String ciudad = "Arequipa";

        System.out.println("Hola me llamo " + nombre + " " + apellido + ", vivo en " + ciudad + " y tengo " + edad + " anios");

        // modificacion de variables

        ciudad = "Cusco";

        System.out.println("Nuevo valor de ciudad es " + ciudad);

        final float PI = 3.14f;

        System.out.println("El valor de PI es: " + PI);

        // PI = 3.134f; --> error: java: cannot assign a value to final variable PI

        // operaciones con variables

        int a = 10;
        int b = 12;
        float respuesta = a + b;

        System.out.println("Respuesta de la suma: " +  respuesta);
        // convertir int to string
        String concat = String.valueOf(a) + String.valueOf(b);
        System.out.println(concat);


        // division

        a = 20;
        b = 10;

        float resultadoDivision = a / b;
        System.out.println("resultado division 1: " + resultadoDivision);

        a = 5;
        b = 2;

        resultadoDivision = (float)a / b; // cast
        System.out.println("resultado division 2: " + resultadoDivision);

        // posibles divisiones

        // int / int --> int
        // float / float --> float
        // float / int --> float

        // vamos a hacer una division


        Estudiante estudiante1 = new Estudiante(
                "george",
                "maxi",
                25,
                14);
        Profesor profesor1 = new Profesor(
                "Juan",
                "Martinez",
                40,
                3000);




        //estudiante1.hacerTarea();
        //profesor1.revisarTareas();
        //estudiante1.printInfo();
        //profesor1.printInfo();
        System.out.println("=========================");
        Persona estudiante2 = new Estudiante("George", "Maxi", 28, 13);
        Persona profesor2 = new Profesor("Jose", "Chavez", 34, 3900);

        estudiante2.printInfo();
        System.out.println("==========================");
        profesor2.printInfo();


        ArrayList<Persona> list = new ArrayList<>();



        Profesor profesor = null;


        // profesor.printInfo();


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
    }
}