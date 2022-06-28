package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] [] array = new int[12][8];

        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            for (int k=0; k<array[i].length; k++) {
                array[i][k] = random.nextInt(50);

            }
        }

        int maxZnach = 0;
        for (int i=0; i< array.length; i++) {
            int sum = 0;

            for(int k=0; k<array[i].length; k++) {
                sum = sum + array[i][k];
            }

            if (sum>maxZnach) {
                maxZnach = sum;
            }
        }

        System.out.println(maxZnach);



    }
}
