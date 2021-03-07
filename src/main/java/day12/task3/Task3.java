package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
      MusicBand musicBand1 = new MusicBand("Linkin park", 1996);
       MusicBand musicBand2 = new MusicBand("Ночные снайперы", 1993);
       MusicBand musicBand3= new MusicBand("Green Day", 1987);
        MusicBand musicBand4 = new MusicBand("Foo Fighters", 1994);
        MusicBand musicBand5 = new MusicBand("Muse", 1994);
        MusicBand musicBand6 = new MusicBand("Fall Out Boy", 2001);
        MusicBand musicBand7 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand8 = new MusicBand("Avril Lavigne", 2002);
        MusicBand musicBand9 = new MusicBand("One Republic", 2002);
        MusicBand musicBand10 = new MusicBand("The Black Keys", 2001);
        MusicBand musicBan11 = new MusicBand("Tokio Hotel", 2001);

        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);
        bands.add(musicBan11);
        Collections.shuffle(bands);
        groupsAfter2000(bands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        System.out.println(bands);
        List<MusicBand> bands2 = new ArrayList<>();
        for (MusicBand band2000 : bands) {
            if (band2000.getYear() > 2000)
                bands2.add(band2000);
        }
        System.out.println(bands2);
        return bands2;
    }
}
