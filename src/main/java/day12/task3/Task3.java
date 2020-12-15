package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        //   list.add(new MusicBand("Новый список", 2020));
        groupsAfter2000(list);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
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
        System.out.println(bands);
        List<MusicBand> over2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                over2000.add(bands.get(i));
            }
        }
        System.out.println("Год основания больше 2000");
        System.out.println(over2000);
        return over2000;
    }



}

/**
 * list.add(new MusicBand("Bonney A", 1988));
 * list.add(new MusicBand("ACDC", 1973));
 * list.add(new MusicBand("Queen", 1975));
 * list.add(new MusicBand("Genesis", 1967));
 * list.add(new MusicBand("Aerosmith", 1970));
 * list.add(new MusicBand("The Black Eyed Peas", 2010));
 * list.add(new MusicBand("Ko-Ko", 2015));
 * list.add(new MusicBand("Go-Go", 2011));
 * list.add(new MusicBand("Yo-Yo", 2016));
 * list.add(new MusicBand("Mongershtern", 2020));
 * <p>
 * System.out.println(list.get(2));
 **/










