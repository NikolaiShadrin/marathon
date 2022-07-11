package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Task1.findEndedShoes();

    }

    public static void findEndedShoes() {
        File file = new File("src/main/resources/shoes.csv");
        File fileFinish = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fileFinish);
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи не найден");;
        }

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String lines = scanner.nextLine();
                String[] fieldName = lines.split(";");
                int countShoes = Integer.parseInt(fieldName[2]);

                if (fieldName.length !=3)
                    throw new IOException();

                if (countShoes==0) {
                    pw.println(fieldName[0]+ "; " + fieldName[1] + "; " + fieldName[2]);
                }
            }

            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("В файле есть строки с незаполненными полями, либо лишние поля, проверьте" +
                    " таблицу еще раз");
        }
    }
}
