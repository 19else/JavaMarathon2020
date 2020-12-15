package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task31 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Bonney M", 1978));
        bands.add(new MusicBand("ACDC", 1973));
        bands.add(new MusicBand("Queen", 1975));
        bands.add(new MusicBand("Genesis", 1967));
        bands.add(new MusicBand("Aerosmith", 1970));
        bands.add(new MusicBand("The Black Eyed Peas", 2010));
        bands.add(new MusicBand("Ko-Ko", 2015));
        bands.add(new MusicBand("Go-Go", 2011));
        bands.add(new MusicBand("Yo-Yo", 2016));
        bands.add(new MusicBand("Mongershtern", 2020));
        Collections.shuffle(bands);
        System.out.println("Список музыкальных групп: ");
        System.out.println(bands);
        System.out.println("Список групп моложе 2000 года:");
        groupsAfter2000(bands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandList = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if(bands.get(i).getYear() > 2000) {
                bandList.add(bands.get(i));
            }
        }
        System.out.println(bandList);
        return bandList;
    }

}
