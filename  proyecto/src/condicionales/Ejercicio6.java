package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica");
        float mat = sc.nextFloat();

        System.out.println("Ingrese la nota de fisica");
        float fis = sc.nextFloat();

        System.out.println("Ingrese la nota de quimica");
        float qui = sc.nextFloat();

        if((mat>=65 && fis>=55 && qui>=50) || (mat + fis >=140)) {
            System.out.println("Admitido");
        } else {
            System.out.println("No admitido");
        }
    }
}
