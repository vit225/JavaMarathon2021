package day5;

class Motorbike {
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
}
