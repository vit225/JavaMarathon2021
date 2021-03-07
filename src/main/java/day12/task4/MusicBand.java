package day12.task4;

import java.util.List;

public class MusicBand {
    private List<String> nameFamily;
    private String name;
    private int year;


    public MusicBand(String name, int year, List<String> nameFamily) {
        this.name = name;
        this.year = year;
        this.nameFamily = nameFamily;
    }

    public int getYear() {
        return year;
    }


    public static void transferMembers(MusicBand one, MusicBand two) {
        for (String string : one.nameFamily)
            two.nameFamily.add(string);
             one.nameFamily.clear();

    }

    public void printMembers() {
        System.out.println(nameFamily);
    }

    public List<String> getMembers() {
        return nameFamily;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameFamily=" + nameFamily +
                '}';
    }
}
