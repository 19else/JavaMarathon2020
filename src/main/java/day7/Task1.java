package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2000, 60, 40);
        Airplane airplane2 = new Airplane("Airbus", 2010, 50, 100);
        Airplane.compareAirplane(airplane1, airplane2);
    }
}