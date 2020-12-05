package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2020, 300, 30);
        airplane.info();
        airplane.setYear(2019);
        airplane.setLength(250.5);
        airplane.fillUp(50);
        airplane.info();
        airplane.setLength(150.5);
        airplane.setYear(2000);
        airplane.fillUp(100);
        airplane.info();
    }
}
