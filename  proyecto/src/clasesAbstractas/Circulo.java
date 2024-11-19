package clasesAbstractas;

import herencia.Persona;

public class Circulo extends Figura {
    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public float area() {
        return (float) Math.PI * radio * radio;
    }
}
