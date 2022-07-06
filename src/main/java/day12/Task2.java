package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> arrayHelp = new ArrayList<>();

        for (int i=2; i<=30; i++) {
            if (i%2==0) {
                array.add(i);
            } else { }
        }
        System.out.println(array);

        for (int i=300; i<=350; i++) {
            if (i%2==0) {
                array.add(i);
            } else { }
        }

        array.addAll(14,arrayHelp);

        System.out.println(array);







    }
}
