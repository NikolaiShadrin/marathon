package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737", 2009, 200, 4000, 500);

        airplane1.setYear(2015);
        airplane1.setLength(450);

        airplane1.fillUp(30);
        airplane1.fillUp(50);

        airplane1.info();

    }
}
