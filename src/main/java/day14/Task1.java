package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/day14/Doc1.txt");

        Task1.printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String numberList = scanner.nextLine();
            String[] numbersString = numberList.split(" ");

            if (numbersString.length != 10) {
                throw new IOException();
            }

            int counter = 0;
            int[] numbers = new int[10];
            int sum = 0;


            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }

            for (int i : numbers) {
                sum = sum + i;
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
