package day12;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList = new ArrayList<>(Arrays.asList("Vaz", "Zaz", "Maz", "Kamaz", "Gaz"));
        System.out.println(autoList);
        autoList.add((autoList.size() / 2), "Liaz");
        autoList.remove(0);
        System.out.println(autoList);
    }
}
