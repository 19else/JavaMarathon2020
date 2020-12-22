package day14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void printSumDigits(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        int count = 0;
        int sum = 0;
        String[] numbers = line.split(" ");
        int[] arrayNum = new int[(line.length() - 1) - numbers.length];
        for (String nums : numbers) {
            arrayNum[count++] = Integer.parseInt(nums);
        }
        for (int value : arrayNum) {
            sum = sum + value;
        }
        if (arrayNum.length != 10) {
            System.out.println("Invalid input file");
            throw new IOException();
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("test1");
        printSumDigits(file);
    }
}
