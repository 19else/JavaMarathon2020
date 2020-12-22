package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> result = new ArrayList<>();
        List<Integer> checkAge = new ArrayList<>();
        while (scanner.hasNext()) {
            result.add(scanner.nextLine());
        }
        int count1 = 0;
        for (String extractAge : result) {
            checkAge.add(Integer.parseInt(extractAge.replaceAll("[^-0-9]", "")));
            try {
                if (checkAge.get(count1) < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Некорректный входной файл");
                result.clear();
                break;
            }
            count1++;
        }

        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        File file = new File("people");
        try {
            parseFileToStringList(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
