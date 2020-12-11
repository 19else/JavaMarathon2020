package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(boolean isPayed, double salary, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.salary = salary;
        this.warehouse = warehouse;
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
        if (isPayed) {
            System.out.println("Бонус уже выплачен");
        }

        if (warehouse.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
            System.out.println("Бонус выплачен курьеру");
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            isPayed = false;
            System.out.println("Бонус пока недоступен");
        }
    }
}
