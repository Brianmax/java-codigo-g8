package herencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(){}
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void printInfo() {
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
    }

    // sobreescritura de metodos
}