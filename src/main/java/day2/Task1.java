package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Введите количество этажей");
        int floors = scanner.nextInt();
        if (floors > 0 && floors < 5) {
            System.out.println("Малоэтажный дом");
        }
        if (floors <= 0) {
            System.out.println("Ошибка ввода");
        }
        if (floors > 4 && floors < 9) {
            System.out.println("Среднеэтажный дом");
        }
        if (floors > 8) {
            System.out.println("Многоэтажный дом");
        }
    }
}
