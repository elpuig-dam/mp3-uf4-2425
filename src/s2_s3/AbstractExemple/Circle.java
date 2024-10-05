package s2_s3.AbstractExemple;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (3.1416f * Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
