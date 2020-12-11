package day11.task1;

public class Courier implements Worker {
    private double salary;
    private double isPayed;
    private Warehouse warehouse;

    public Courier(double isPayed, double salary, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public double getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {

        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);

    }

    @Override
    public void bonus() {
        if (this.isPayed != 0) {
            System.out.println("Бонус уже выплачен");
        }

        if (warehouse.getCountDeliveredOrders() == 10000) {
            this.isPayed = 50000;
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            this.isPayed = 0;
            System.out.println("Бонус пока недоступен");
        }
    }
}
