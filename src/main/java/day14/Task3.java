package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Person> personList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] people = row.split(" ");
            try {
                if (Integer.parseInt(people[1]) < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Incorrect incoming file");
                personList.clear();
                break;
            }
            Person person = new Person(people[0], Integer.parseInt(people[1]));
            personList.add(person);
        }

        System.out.println(personList);
        return personList;
    }

    public static void main(String[] args) {
        File file = new File("People");
        try {
            parseFileToObjList(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
