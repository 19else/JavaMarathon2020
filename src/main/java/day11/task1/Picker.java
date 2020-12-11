package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(boolean isPayed, double salary, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
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
        if (isPayed) {
            System.out.println("Бонус уже выплачен");
        }
        if (warehouse.getCountPickedOrders() == 10000) {
            salary += 70000;
            System.out.println("Бонус выплачен Сборщику");
            isPayed = true;
        }
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока недоступен");

        }
    }
}
