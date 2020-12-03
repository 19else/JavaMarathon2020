package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        int min = array[0];
        int max = array[0];
        int count = 0;
        int sum = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            if (value % 10 == 0) {
                count++;
                sum += value;
            }

        }
        System.out.println("Наибольший элемент в массиве: " + max);
        System.out.println("Наименьший элемент в массиве: " + min);
        System.out.println("Количество элементов оканчивающих на 0 : " + count);
        System.out.println("Сумма элементов оканчивающихся на 0 : " + sum);
        /**    Arrays.sort(array);
         System.out.println(Arrays.toString(array));
         int max = (array[array.length - 1]);
         System.out.println("Максимальное значение в массиве: " + max);
         System.out.println("Минимальное значение в массиве: " + array[0]); **/
    }
}
