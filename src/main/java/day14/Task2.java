package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people.txt");

        System.out.println(Task2.parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        int minusCheck = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] yearSeparated = line.split(" ");
                int check = Integer.parseInt(yearSeparated[1]);

                if (check < 0)
                    throw new IOException();

                people.add(line);
            }

            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}

