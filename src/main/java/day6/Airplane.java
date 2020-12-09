package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    Airplane (String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void  info() {
        System.out.println("Изготовитель: " + producer + " Год выпуска: " + getYear()
                + " Длина: " + getLength() + " Вес: " + weight + " Количество топлива в баке: " + fuel);
    }

    public int fillUp(int refuel) {
        return this.fuel += refuel;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
