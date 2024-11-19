package herencia;


public class Profesor extends Persona {
    private float salario;


    public Profesor(){}
    public Profesor(String nombre, String apellido, int edad, float salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public void revisarTareas() {
        System.out.println("Revisando tareas...");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void printInfo(){
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.salario);
    }
}
