package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int countCourier;
    private Warehouse warehouse = new Warehouse();

    public Courier(Warehouse warehouse) {
        countCourier++;
        this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплата у курьера: " + getSalary();
    }


    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPayed = true;
        }

        if (isPayed)
            System.out.println("Бонус уже был выплачен");
        else
            System.out.println("Бонус пока не доступен");
    }
}
