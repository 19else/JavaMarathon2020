package day12.task5;

import java.util.List;

public class MusicArtist {
    private List<String> name;
    private List<Integer> age;

    public MusicArtist (List<String> name, List<Integer> age) {
        this.name = name;
        this.age = age;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
