package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Practice" + separator + "JavaMarathon2020" +separator + "readOn.txt" ;
        String pathNum = "C:" + separator + "Practice" + separator + "JavaMarathon2020" +separator + "numbers.txt" ;
        File fileWords = new File(path);
        File fileNum = new File(pathNum);
        File rootFolder = new File("test");
        Scanner scanner = new Scanner(fileWords);
        Scanner scanner1 = new Scanner(fileNum);
        Scanner scanner2 = new Scanner(rootFolder);
      while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
      while (scanner2.hasNext()) {
          System.out.println("file test = " + scanner2.nextLine());
      }
     int[] number = new int[4];
     int counter = 0;
     String line = scanner1.nextLine();
     String[] members = line.split(" ");
     for( String word : members) {
         number[counter++] = Integer.parseInt(word);
     }
        System.out.println(Arrays.toString(members));

        scanner.close();
    }
}
