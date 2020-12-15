package day12;

import java.util.ArrayList;
import java.util.List;

public class Girl {
    private String name;
    private int age;
    private List<Doll> dolls = new ArrayList<>(); //изначально пустой список

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Doll> getDolls() {
        return dolls;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }
}
