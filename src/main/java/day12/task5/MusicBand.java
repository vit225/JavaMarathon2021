package day12.task5;

import java.util.List;

public class MusicBand {
    private List<MusicArtist> musicArtists;
    private String name;
    private int year;


    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public int getYear() {
        return year;
    }


    public static void transferMembers(MusicBand one, MusicBand two) {
        for (MusicArtist musicArtist : one.musicArtists)
            two.musicArtists.add(musicArtist);
        one.musicArtists.clear();

    }

    public void printMembers() {
        System.out.println(musicArtists);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "musicArtists=" + musicArtists +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
