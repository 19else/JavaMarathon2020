package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike();
        motobike.year = 2015;
        motobike.color = "Black";
        motobike.model = "Bugatti";
        System.out.println(motobike.getColor() + " " + motobike.getModel() + " " + motobike.getYear());
        motobike.checkout();
    }
}
