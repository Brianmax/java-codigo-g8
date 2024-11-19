package condicionales;

import java.util.Scanner;

public class Teoria {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        // and
        boolean c = a && b;
        System.out.println(c);


        // or
        a = true;
        b = false;
        c = a || b;
        System.out.println(c);

        System.out.println(!c);

        // verificar de acuerdo a la edad, si es una persona adulta o no

        int edad = 17;

        if (edad >= 18) {
            System.out.println("Persona mayor de edad");
        } else {
            System.out.println("Persona menor de edad");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de var3");
        int var3 = sc.nextInt();
        System.out.println(var3);
    }
}
