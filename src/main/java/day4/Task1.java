package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int countNumber8 = 0;
        int countNumber1 = 0;
        int countEvenNumber = 0;
        int countOddNumber = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        for (int value : array) {
            if (value > 8) {
                countNumber8++;
            }
            if (value == 1) {
                countNumber1++;
            }
            if (value % 2 == 0) {
                countEvenNumber++;
            }
            if (value % 2 != 0) {
                countOddNumber++;
            }
            sum += value;
        }
        System.out.println("Количество значений больше 8: " + countNumber8);
        System.out.println("Количество значений равное 1: " + countNumber1);
        System.out.println("Количество четных значений: " + countEvenNumber);
        System.out.println("Количество нечетных значений: " + countOddNumber);
        System.out.println("Cумма всех элементов массива: " + sum);
    }
}
