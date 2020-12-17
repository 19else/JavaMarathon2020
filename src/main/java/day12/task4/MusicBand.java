package day12.task4;

import org.mockito.internal.util.collections.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private String userNameSurname;
    private List<String> bands;



    public MusicBand(String name, int year, String userNameSurname, List<String> bands) {
        this.name = name;
        this.year = year;
        this.userNameSurname = userNameSurname;
        this.bands = bands;
    }

       public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public List<String> getBands() {
        return bands;
    }

    public void setBands(List<String> bands) {
        this.bands = bands;
    }

    public static void transferMembers (MusicBand bandA, MusicBand unionBands) {
        bandA.getBands().addAll(unionBands.getBands());
        unionBands.getBands().clear();
     }

    public void printMembers() {
        System.out.println("printMembers = " + bands);
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



