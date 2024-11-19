package poo;

public class Dog {
    private String raza;
    private int edad;
    private String color;

    Dog(String raza, int edad, String color) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    Dog() {

    }
    Dog(String raza) {
        this.raza = raza;
    }

    // metodos getter

    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public String getColor() {
        return color;
    }

    // metodos setter

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        if(edad < 25) {
            this.edad = edad;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }
}
