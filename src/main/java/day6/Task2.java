package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Сухой", 2010, 30, 24);
        airplane.setYear(2005);
        airplane.setLength(25);
        airplane.fillUp(15);
        airplane.fillUp(10);
        airplane.info();
    }
}
