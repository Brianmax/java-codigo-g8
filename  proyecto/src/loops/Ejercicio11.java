package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos");
        int n = sc.nextInt();
        System.out.println("Ingrese el valor a buscar");
        int x = sc.nextInt();
        Random random = new Random();

        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array));

        int index = 0;
        boolean isFound = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == x) {
                index = i;
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("El numero " + x + " esta en la posicion " + index);
        } else {
            System.out.println("No encontrado");
        }
    }
}
