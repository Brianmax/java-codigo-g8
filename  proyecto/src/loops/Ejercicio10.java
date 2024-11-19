package loops;

import javax.sql.XAConnection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de elementos");
        int n = sc.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }

        System.out.println(Arrays.toString(array));

        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El valor mayor es: " + mayor);
    }
}
