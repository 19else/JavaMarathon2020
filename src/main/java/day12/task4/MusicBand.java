package day12.task4;

import org.mockito.internal.util.collections.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private String userNameSurname;
    private List<String> bands;
    private List<MusicBand> unionBands;
    private List<MusicBand> bandA;

    public List<MusicBand> getBandA() {
        return bandA;
    }

    public void setBandA(List<MusicBand> bandA) {
        this.bandA = bandA;
    }

    public MusicBand() {
    }

    public MusicBand(String name, int year, String userNameSurname, List<String> bands) {
        this.name = name;
        this.year = year;
        this.userNameSurname = userNameSurname;
        this.bands = bands;
    }

    public List<MusicBand> getUnionBands() {
        return unionBands;
    }

    public void setUnionBands(List<MusicBand> unionBands) {
        this.unionBands = unionBands;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public String getUserNameSurname() { return userNameSurname; }

    public void setUserNameSurname(String userNameSurname) { this.userNameSurname = userNameSurname; }

    public List<String> getBands() {
        return bands;
    }

    public void setBands(List<String> bands) {
        this.bands = bands;
    }

    public static void transferMembers (MusicBand bandA, MusicBand unionBands) {
        bandA.getBands().addAll(unionBands.getBands());
        unionBands.getBands().clear();
        System.out.println("Печать из transferMembers = " + bandA);

     }

    public void printMembers() {
        System.out.println("printMembers = " + getBands());
    }

    public String getMembers() {
        return bands.toString();
    }



    @Override
    public String toString() {
        return "MusicBand{" +
                "Название группы ='" + name + '\'' +
                ", Год основания = " + year +
                ", участник группы = " + userNameSurname +
                ", Состав группы = " + bands +
                '}';
    }
}



