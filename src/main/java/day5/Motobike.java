package day5;

public class Motobike {
    private int year;
    private String model;
    private String color;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    void checkout() {
        System.out.println("Модель мотоцикла " + model + " Цвет: " + color + " Год выпуска: " + year);
    }

}
