package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while (true) {

           int x = scanner.nextInt();
           int moreThan8 = 0;
           int ravno1 = 0;
           int chetnoe = 0;
           int neChetnoe = 0;
           int sum = 0;

           if(x <= 0) {
               break;
           }

           int [] array = new int [x];
           for (int i=0; i<array.length; i++) {
               array[i] = (int) (Math.random()*10);
           }
           System.out.println(Arrays.toString(array));
           System.out.println("Длинна массива: " + array.length);


           for (int y: array) {
               if (y>8) {
                    moreThan8 = moreThan8 +1;
               }
           }
           System.out.println("Количество чисел больше 8: " + moreThan8);

           for (int y: array) {
               if (y==1) {
                   ravno1 = ravno1 +1;
               }
           }
           System.out.println("Количество чисел равных 1: " + ravno1);

           for (int y: array) {
               if (y%2 == 0) {
                   chetnoe = chetnoe +1;
               }
           }
           System.out.println("Количество четных чисел: " + chetnoe);

           for (int y: array) {
               if (y%2 != 0) {
                   neChetnoe = neChetnoe +1;
               }
           }
           System.out.println("Количество нечетных чисел: " + neChetnoe);

           for (int y: array) {
               sum = sum + y;
           }
           System.out.println("Сумма всех элементов массива: " + sum);







       }








    }
}
