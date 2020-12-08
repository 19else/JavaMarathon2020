package day9.Task2;

public class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle (double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;

    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
