package day1;

public class Task4 {
    public static void main(String[] args) {
        int value = 0;
        int year = 1980;

        while (value < 11) {
            System.out.println("Олимпиада " + year + " года");
            value++;
            year = year + 4;
        }

    }
}
