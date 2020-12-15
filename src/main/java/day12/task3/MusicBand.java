package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicBand> bands;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public MusicBand(String name, int year, List<MusicBand> bands) {
        this.name = name;
        this.year = year;
        this.bands = bands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicBand> getBands() {
        return bands;
    }

    public void setBands(List<MusicBand> bands) {
        this.bands = bands;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
           //     ", bands=" + bands +
                '}';
    }
}



