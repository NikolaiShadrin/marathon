package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите х");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        if (x>=5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println("y равен: "+ y);
        } else if(x>-3 && x<5) {
            y = (x+2)*(Math.pow(x, 2)-2);
            System.out.println("y равен: "+ y);
        }
        else {
            System.out.println("у равен: 420");
        }
    }

    }

