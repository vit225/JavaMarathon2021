package day7;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", " + "год выпуска: " + year + ", " + "длина: "
                + length + ", " + "вес: " + weight + ", " + "количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane one, Airplane two) {
        if (one.length > two.length)
            System.out.println("Первый самолет длиннее");
        else if (one.length < two.length)
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Длины самолетов равны");
    }
}
