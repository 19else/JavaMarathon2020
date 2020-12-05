package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setColor("Red");
        car.setModel("Honda");
        car.setYear(2000);
        System.out.println("Модель: " + car.getModel() + " Цвет: " + car.getColor() + " Год выпуска: " + car.getYear());
        System.out.println("Разница year и yearDifference: " + car.yearDifference(2020));

        Motobike motobike = new Motobike();
        motobike.info();
        motobike.checkout(); // для проверки, "нулевых" параметров
        motobike.setColor("Black");
        motobike.setModel("Suzuki");
        motobike.setYear(2015);
        System.out.println("Модель: " + motobike.getModel() + ", Цвет: " + motobike.getColor()
                           + ", Год выпуска: " + motobike.getYear());
        System.out.println("Разница year и yearDifference: " + motobike.yearDifference(2020));
        motobike.checkout();
    }
}
