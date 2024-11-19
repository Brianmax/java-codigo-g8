package loops;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros2 = {3,2,4,5,1,66,12,21,32,98};

        int suma = 0;
        for(int i = 0; i < numeros2.length; i++) {
            suma += numeros2[i];
        }
        System.out.println(suma);
    }
}
