package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("Lada");
        car.setYear(2015);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println();
        car.checkout();
    }
}
