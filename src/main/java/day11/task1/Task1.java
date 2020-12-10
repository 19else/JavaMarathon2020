package day11.task1;


public class Task1 {
    static void businessProcess (Worker worker) {
        int count = 0;
        while (count < 10000) {
            worker.doWork();
            count++;
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse(0, 0);
        Picker pk = new Picker(0, 80, wh1);
        Courier courier = new Courier(0, 100, wh1);

        businessProcess(courier);
        businessProcess(pk);

        System.out.println(pk.toString());
        System.out.println(courier.toString());

        Warehouse wh2 = new Warehouse(0, 0);
        Picker pk2 = new Picker(0, 80, wh2);
        Courier courier1 = new Courier(0, 100,wh2);
        pk2.doWork();
        courier1.doWork();
        System.out.println("Picker second = " + pk2.toString());
        System.out.println("Courier second = " + courier1.toString());
    }
}
