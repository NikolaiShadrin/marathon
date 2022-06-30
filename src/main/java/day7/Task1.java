package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("G6", 2015, 400, 500, 50);
        Airplane airplane2 = new Airplane("G7", 2020, 600, 450, 100);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}