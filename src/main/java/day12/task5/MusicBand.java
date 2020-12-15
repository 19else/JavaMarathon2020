package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bands;
    private List<MusicArtist> unionBands;
    private List<MusicBand> bandA;

    public List<MusicBand> getBandA() {
        return bandA;
    }

    public void setBandA(List<MusicBand> bandA) {
        this.bandA = bandA;
    }

    public MusicBand(String name, int year, List<MusicArtist> bands) {
        this.name = name;
        this.year = year;
        this.bands = bands;
    }

    public static void transferMembers (MusicBand bandA, MusicBand  unionBands) {

        List<MusicArtist> union = new ArrayList<>();
        union.addAll(bandA.getBands());
        union.addAll(unionBands.getBands());
        unionBands.getBands().clear();

        System.out.println("Печать из transferMembers = " + union.toString());
     }

    public void printMembers() {
        System.out.println("printMembers = " + getBands());
    }

    public String getMembers() {
        return bands.toString();
    }

    public List<MusicArtist> getUnionBands() {
        return unionBands;
    }

    public void setUnionBands(List<MusicArtist> unionBands) {
        this.unionBands = unionBands;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public List<MusicArtist> getBands() {
        return bands;
    }

    public void setBands(List<MusicArtist> bands) {
        this.bands = bands;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "Название группы ='" + name + '\'' +
                ", Год основания = " + year +
                ", участники группы и возраст = " + getBands() +
                '}';
    }
}



