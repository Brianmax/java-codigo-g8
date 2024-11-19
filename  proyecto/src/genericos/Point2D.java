package genericos;

public class Point2D <T, M> {
    T a;
    M b;

    public Point2D(T a, M b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }

}
