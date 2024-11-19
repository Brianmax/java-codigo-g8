package loops;

import javax.sql.XAConnection;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String cadena = "Java es un lenguaje de programacion";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char letra = sc.next().charAt(0);


        int counter = 0;
        for(int i = 0; i< cadena.length(); i++) {
            if (cadena.charAt(i) == letra){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
