package loops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Teoria {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 100; i=i+1) {
            System.out.println(i);
        }*/

        /*int a = 0;
        while(a <= 100) {
            System.out.println(a);
            a++;
        }*/

        int[] numeros = new int[4];
        int[] numeros2 = {3,2,4,5,1,66,12,21,32};
        numeros[3] = 12;
        numeros[1] = 7;
        numeros[0] = 9;
        numeros[2] = 90;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String nombre = "George";

        System.out.println(nombre.charAt(3));

        char resultado2 = nombre.charAt(3);


        char m = 'p';
        String lastname = "Maxi";

        ArrayList<Integer> arrayListNumeros = new ArrayList<>();

        arrayListNumeros.add(10);
        arrayListNumeros.add(18);
        arrayListNumeros.add(27);
        arrayListNumeros.add(89);
        arrayListNumeros.add(5);

        System.out.println(arrayListNumeros);


        arrayListNumeros.remove(2);

        System.out.println(arrayListNumeros);

        System.out.println(arrayListNumeros.get(2));

        LinkedList<Integer> linkedListNumeros = new LinkedList<>();

        linkedListNumeros.add(10);
        linkedListNumeros.add(18);

        System.out.println(linkedListNumeros.get(1));

    }
}
