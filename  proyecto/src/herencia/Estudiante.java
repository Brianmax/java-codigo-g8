package herencia;

public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(String nombre, String apellido, int edad, float promedio) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
    }
    public Estudiante() {}

    public void hacerTarea() {
        System.out.println("Haciendo tarea...");
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public void printInfo(){
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.promedio);
    }
}
