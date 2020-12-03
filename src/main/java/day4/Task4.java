package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int sum = 0;
        System.out.println(Arrays.toString(array));
        int start = 1;
        int end = 3;
        System.out.println("length = " + array.length);
        for (int i = 0; i < array.length; i++) {
        sum += array[i];
        if (start == 3) {
            System.out.println("sum = " +sum);
            sum = 0;
            start = 1;
        }
         //   System.out.println("start = " + start);
        start++;

       //     for (int j = start; j < end ; j++) {
       //         sum += array[j];
        //    }
         //   start += 3;
         //   end += 3;
          //  System.out.println("sum = " + sum);
           // sum = 0;
        }
    }

    }

