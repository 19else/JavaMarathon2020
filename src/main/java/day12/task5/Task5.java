package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> groupMember = new ArrayList<>();
        groupMember.add("Rudolf");
        groupMember.add("Matthias");
        groupMember.add("Mikkey Dee");
        List<Integer> ageMember = new ArrayList<>();
        ageMember.add(30);
        ageMember.add(40);
        ageMember.add(50);
        MusicArtist musicArtist = new MusicArtist(groupMember, ageMember);
        List<MusicArtist> union = new ArrayList<>();
        union.add(musicArtist);

        List<String> groupMember2 = new ArrayList<>();
        groupMember2.add("David");
        groupMember2.add("Tommy");
        groupMember2.add("Reb");
        List<Integer> ageMember2 = new ArrayList<>();
        ageMember2.add(55);
        ageMember2.add(65);
        ageMember2.add(75);
        MusicArtist musicArtist2 = new MusicArtist(groupMember2, ageMember2);
        List<MusicArtist> union2 = new ArrayList<>();
        union2.add(musicArtist2);

        MusicBand band1 = new MusicBand("Scorpions", 1965,  union);
        MusicBand band = new MusicBand("Whitesnake", 1977, union2);

        MusicBand.transferMembers(band1, band);
        band1.printMembers();

  //   System.out.println("Список после объединения:" + groupMember);
   //    System.out.println("список ушедшей группы: " + groupMember2);
     //  System.out.println("void printMember:");
    //   band1.printMembers();
     //  System.out.println("void getMember : " + band1.getMembers());
    }
}
