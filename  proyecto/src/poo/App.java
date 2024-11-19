package poo;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jose";
        persona1.apellido = "Fernandez";
        persona1.edad = 23;

        Persona persona2 = new Persona();
        int a = 10;
        int b = 10;

        String nombre = "fjk";
        String apellido = "fjk";


        Dog dog1 = new Dog("Raza 1", 4, "Blanco");
        // dog1.raza = "Raza nueva";
        //dog1.edad = 23;
        System.out.println(dog1.getRaza());
        System.out.println(dog1.getEdad());
        System.out.println(dog1.getColor());

        Dog dog2 = new Dog();
        dog2.setColor("Blanco");
        dog2.setEdad(4);
        dog2.setRaza("Raza 7");

        Dog dog3 = new Dog("Raza 3");

        // Dog dog4 = new Dog("Raza 4", 2);
    }
}
