package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> groupMember = new ArrayList<>();
        groupMember.add("Rudolf");
        groupMember.add("Matthias");
        groupMember.add("Mikkey Dee");
        List<String> groupMember2 = new ArrayList<>();
        groupMember2.add("David");
        groupMember2.add("Tommy");
        groupMember2.add("Reb");
        MusicBand band1 = new MusicBand("Scorpions", 1965, "Klaus Meine", groupMember);
        MusicBand band = new MusicBand("Whitesnake", 1977, "Michael Devin", groupMember2);
         MusicBand.transferMembers(band1, band);
        System.out.println("Список после объединения:" + groupMember);
        System.out.println("список ушедшей группы: " + groupMember2);
        System.out.println("void printMember:");
        band1.printMembers();
        System.out.println("getMember : " + band1.getMembers());
    }
}
