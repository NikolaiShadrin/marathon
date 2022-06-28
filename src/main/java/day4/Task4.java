package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random rdm = new Random();

        for (int i=0; i< array.length; i++) {
            array[i] = rdm.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIn = 0;
        for (int k=0; k< array.length; k++) {
            int sumFirstThree = 0;
            for (int i=k; i<k+3; i++) {
                sumFirstThree = sumFirstThree + array[i];
            }

            if (sumFirstThree>maxSum) {
                maxSumIn = maxSum;
                maxSumIn = k;
            }

            }


    }
}
