package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Синий");
        car.setModel("Ауди");
        car.setYear(2015);
        Motorbike motorbike = new Motorbike("Иж-Планета", "Красный", 2005);
        car.info();
        motorbike.info();
        motorbike.yearDifference(2021);
        car.yearDifference(2019);

    }

}
