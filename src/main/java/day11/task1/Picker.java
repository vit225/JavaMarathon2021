package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private int countPicker;
    public Warehouse warehouse = new Warehouse();

    public Picker(Warehouse warehouse) {
        countPicker++;
        this.warehouse = warehouse;

    }


    public int getSalary() {
        return salary;
    }


    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплата у сборщика: " + getSalary();
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);

    }

    @Override
    public void bonus() {

        if (warehouse.getCountPickedOrders() == 10000) {
            salary += 70000;
            isPayed = true;
        }

        if (isPayed)
            System.out.println("Бонус уже был выплачен");
        else
            System.out.println("Бонус пока не доступен");
    }
}
