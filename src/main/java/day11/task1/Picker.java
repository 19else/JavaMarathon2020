package day11.task1;

public class Picker implements Worker {
    private double salary;
    private double isPayed;

    Warehouse wh = new Warehouse();

    public Picker(double isPayed, double salary, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.salary = salary;
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

        wh.setCountPickedOrders(wh.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (isPayed != 0) {
            System.out.println("Бонус уже выплачен");
        }
        if (wh.getCountPickedOrders() == 10000) {
            this.isPayed += 70000;
        }
        if (wh.getCountPickedOrders() < 10000) {
            this.isPayed = 0;
            System.out.println("Бонус пока недоступен");
        }
    }
}
