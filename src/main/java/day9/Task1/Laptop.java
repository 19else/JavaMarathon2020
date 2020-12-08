package day9.Task1;

public class Laptop extends Computer {
    private int batteryCapacity;

    Laptop (String manufacture, int productionYear, int batteryCapacity) {
        super(manufacture, productionYear);
        this.batteryCapacity = batteryCapacity;
    }
}
