package loops;

public class Ejercicio13 {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++) {
            System.out.println("Tabla de multiplicacion de " + i);
            for(int e = 1; e <= 10; e++) {
                System.out.println(i + "x" + e + " = " + i*e);
            }
        }
    }
}
