package day9.Task2;

public class Cycle extends Figure {
    double radius;

    public Cycle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * 2);
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
