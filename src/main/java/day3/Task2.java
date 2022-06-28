package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое и делитель");

        while (true) {
             double x = scanner.nextDouble();
             double y = scanner.nextDouble();
             double sum;

             if (y == 0)
                 break;

             sum = x/y;
            System.out.println(sum);


        }

    }
}
