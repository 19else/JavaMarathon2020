package day9.Task2;

public class TestFigures {

    public static double calculateRedPerimeter(Figure[] figure) {
        double rsl = 0;
        for (int i = 0; i < figure.length; i++) {
            if (figure[i].getColor().equals("Red")) {
                rsl += figure[i].perimeter();
            }
        }
        return rsl;
    }

    public static double calculateRedArea(Figure[] figure) {
        double rsl = 0;
        for (Figure value : figure) {
            if (value.getColor().equals("Red")) {
                rsl += value.area();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Figure[] figure = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Cycle(4, "Red"),
                new Cycle(10, "Red"),
                new Cycle(5, "Blue")
        };
        System.out.println("Площадь красных фигур = " + calculateRedArea(figure));
        System.out.println("Периметр красных фигур = " + calculateRedPerimeter(figure));
    }
}
