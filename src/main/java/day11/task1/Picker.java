package day11.task1;

public class Picker implements Worker {
    private double salary;
    private double isPayed;
    private Warehouse warehouse;

    public Picker(double isPayed, double salary, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public double getIsPayed() {
        return isPayed;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (isPayed != 0) {
            System.out.println("Бонус уже выплачен");
        }
        if (warehouse.getCountPickedOrders() == 10000) {
            this.isPayed += 70000;
        }
        if (warehouse.getCountPickedOrders() < 10000) {
            this.isPayed = 0;
            System.out.println("Бонус пока недоступен");
        }
    }
}
