package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10000);
        }
        System.out.println(Arrays.toString(array));

        for (int y: array) {
            if (y>max) {
                max = y;
            }
        }

        System.out.println("Наибольшее значение числа: " + max);

        for (int y: array) {
            if (y<min) {
                min = y;
            }
        }
        System.out.println("Наименьшее значение числа: " + max);


    }
}