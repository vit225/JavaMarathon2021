package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtists1 = new ArrayList<>();
        List<MusicArtist> musicArtists2 = new ArrayList<>();

        MusicArtist artist1 = new MusicArtist("Честер Беннингтон", 35);
        MusicArtist artist2 = new MusicArtist("Майк Шинода", 35);
        MusicArtist artist3 = new MusicArtist("Феникс Фаррелл", 35);

        MusicArtist artist4 = new MusicArtist("Диана Арбенина", 35);
        MusicArtist artist5 = new MusicArtist("Светлана Сурганова", 35);
        MusicArtist artist6 = new MusicArtist("Дмитрий Максимов", 35);

        musicArtists1.add(artist1);
        musicArtists1.add(artist2);
        musicArtists1.add(artist3);


        musicArtists2.add(artist4);
        musicArtists2.add(artist5);
        musicArtists2.add(artist6);

        MusicBand musicBand1 = new MusicBand("Linkin park", 1996, musicArtists1);
        MusicBand musicBand2 = new MusicBand("Ночные снайперы", 1993, musicArtists2);

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
