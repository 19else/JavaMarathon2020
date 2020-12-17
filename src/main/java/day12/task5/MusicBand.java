package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bands;

    public MusicBand(String name, int year, List<MusicArtist> bands) {
        this.name = name;
        this.year = year;
        this.bands = bands;
    }

    public static void transferMembers (MusicBand bandA, MusicBand  bandB) {
        for (MusicArtist member : bandA.getBands())
             { bandB.getBands().add(member);
        }
        bandA.getBands().clear();
     }

    public void printMembers() { System.out.println(this.bands); }

    public List<MusicArtist> getBands() { return bands; }

    public void setBands(List<MusicArtist> bands) { this.bands = bands; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }


    @Override
    public String toString() {
        return "MusicBand{" +
                "Название группы ='" + name + '\'' +
                ", Год основания = " + year +
                ", участники группы и возраст = " + this.bands +
                '}';
    }
}



