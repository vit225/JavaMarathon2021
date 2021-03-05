package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        courier1.doWork();
        picker1.doWork();
        System.out.println(courier1);
        System.out.println(picker1);
        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse);
        System.out.println(courier);
        System.out.println(picker);

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();

        }
        worker.bonus();
    }
}
