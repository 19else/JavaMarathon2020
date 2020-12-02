package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
      while (count < 5) {
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();
            if (divider != 0) {
                System.out.println(dividend / divider);
                count++;
            }
            if (divider == 0) {
                System.out.println("Деление на 0");
            }
          //  System.out.println("count = " + count);
        }
    }
}
