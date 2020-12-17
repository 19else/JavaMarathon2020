package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> bands1 = new ArrayList<>();
        bands1.add(new MusicArtist("Rudolf", 20));
        bands1.add(new MusicArtist("Matthias", 21));
        bands1.add(new MusicArtist("Mikkey", 37));
        bands1.add(new MusicArtist("Dee", 42));
        bands1.add(new MusicArtist("Roy", 54));
        bands1.add(new MusicArtist("Tom", 63));

        List<MusicArtist> bands2 = new ArrayList<>();
        bands2.add(new MusicArtist("David", 33));
        bands2.add(new MusicArtist("Rob", 28));
        bands2.add(new MusicArtist("Jerry", 44));
        bands2.add(new MusicArtist("Vanessa", 20));
        bands2.add(new MusicArtist("Chris", 65));

        MusicBand musicGroup1 = new MusicBand("Scorpions", 1965,  bands1);
        MusicBand musicGroup2 = new MusicBand("Whitesnake", 1977, bands2);

        MusicBand.transferMembers(musicGroup1, musicGroup2);
        musicGroup2.printMembers();
        System.out.println(musicGroup2);

    }
}
