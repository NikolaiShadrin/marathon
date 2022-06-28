package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите делимое и делитель");

        for (int i=0; i<=5; i++) {

            double a = scanner.nextInt();
            double b = scanner.nextInt();

            System.out.println(a/b);

            if (b == 0) {
                System.out.println("Делить на ноль нельзя");
                continue;
            }

            System.out.println(a/b);





        }

    }
}
