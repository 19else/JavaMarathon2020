package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int yearOf) {
        year = yearOf;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String colorOfCar) {
        color = colorOfCar;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String modelName) {
        model = modelName;
    }

    public String getModel() {
        return model;
    }

    void checkout() {
        System.out.println("Модель автомобиля: " + model + " Цвет: " + color + " Год выпуска: " + year);
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int madeOf) {
        return Math.abs(year - madeOf);
    }
}
