package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Bmv");
        strings.add("Mercedes");
        strings.add("Audi");
        strings.add("Lexus");
        strings.add("Toyota");
        System.out.println(strings);
        strings.add(3, "Mazda");
        strings.remove(0);
        System.out.println(strings);
    }
}
