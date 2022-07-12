package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day16/Doc1.txt");

        Task1.printResult(file);


    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String str = scanner.nextLine();
            String[] array = str.split(" ");

            int sum = 0;
            double result = 0;

            for (String number : array) {
                sum = sum + Integer.parseInt(number);
            }

            result = (double)sum/array.length;

            System.out.println(String.format(result + " --> %.3f",result));


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

