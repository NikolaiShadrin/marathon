package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Mercedes");
        cars.add("KIA");
        cars.add("Genesis");
        cars.add("BMW");
        cars.add("Renault");

        System.out.println(cars);
        cars.add(3,"Cadillac");

        cars.remove(0);

        System.out.println(cars);

    }
}
