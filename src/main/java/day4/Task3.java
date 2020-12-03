package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        int sum = 0;
        int different = 0;
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum = sum + array[i][j];
            }
            System.out.print(" // " + sum);
            if ( sum > different) {
                different = sum;
                System.out.print(" // different = " + different);
                index = i;
            }
            sum = 0;
            System.out.println();
        }
        System.out.println("index = " + index);
    }
}
