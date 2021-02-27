package day6;

public class Motorbike {
    String color, model;
    int year;

    public Motorbike(String model, String color, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int outputYear = inputYear - year;
        if (outputYear < 0)
            outputYear = -outputYear;
        return +outputYear;
    }
}
