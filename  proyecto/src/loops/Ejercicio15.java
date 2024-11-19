package loops;

import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tiempo disponible");

        int t = sc.nextInt();

        System.out.println("Ingrese la cantidad de libros");

        int n = sc.nextInt();

        ArrayList<Integer> tiemposLibros = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Ingrese el tiempo de lectura para el libro: " + i);
            int tiempoLectura = sc.nextInt();
            tiemposLibros.add(tiempoLectura);
        }

        System.out.println(tiemposLibros);

        Collections.sort(tiemposLibros);
        System.out.println(tiemposLibros);

        int i = 0;
        while(t > 0 && i < tiemposLibros.size()) {
            t = t - tiemposLibros.get(i);
            i++;
        }
        System.out.println(i);
    }
}
