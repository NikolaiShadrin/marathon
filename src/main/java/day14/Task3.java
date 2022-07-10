package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people.txt");

        System.out.println(Task3.parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fieldName = line.split(" ");
                int fieldAge = Integer.parseInt(fieldName[1]);
                if (fieldAge < 0)
                    throw new IOException();

                Person person1 = new Person(fieldName[0],fieldAge);

                personList.add(person1);
            }

            return personList;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
