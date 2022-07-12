package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        File file = new File("src/main/java/day16/fi.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Файл file1 не удалось создать");
        }

        File file1 = new File("src/main/java/day16/fi2.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println("Файл file2 не удалось создать ");
        }

        PrintWriter pw = new PrintWriter(file);

        for (int i = 0; i<1000; i++) {
            pw.println(random.nextInt(100));

        }

        pw.close();

        Scanner scanner = new Scanner(file);
        PrintWriter pw2 = new PrintWriter(file1);
        int sum = 0;
        int counter = 0;

        while (scanner.hasNextLine()) {
            sum = sum + Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter ==20) {
                pw2.println(sum/20.0);
                counter = 0;
                sum = 0;
            }
        }

        pw2.close();

        Task2.printResult(file1);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;

        while (scanner.hasNextLine()) {
            sum = sum + Double.parseDouble(scanner.nextLine());
        }

        System.out.println((int)sum);
    }
}
