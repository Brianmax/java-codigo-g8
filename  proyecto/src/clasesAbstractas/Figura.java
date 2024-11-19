package clasesAbstractas;

// no se pueden instanciar
// puede tener atributos
// puede tener metodos abstractos y no abstractos(metodos con implmentacion)
// puede tener constructor
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }
    public abstract float area();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
