package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positivo");
        }
        else if (n == 0){
            System.out.println("Cero");
        }
        else {
            System.out.println("Negativo");
        }
    }
}
