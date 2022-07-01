package day8;

public class Task1 {
    public static void main(String[] args) {

       String num = "";
       StringBuilder stringBuilder = new StringBuilder("");

        /*for(int i = 0; i<=20000; i++) {
            String str = Integer.toString(i);
            System.out.print(str + " ");
        } */

        long startTime = System.currentTimeMillis();

        for (int i = 0; i<=20000; i++) {
            num = num + i + " ";
        }

        long stopTime = System.currentTimeMillis();

        System.out.println(num);
        System.out.println("Время выполнения цикла: " + (stopTime - startTime));

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i<=20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        long stopTime1 = System.currentTimeMillis();

        System.out.println(stringBuilder);
        System.out.println("Время выполнения цикла: " + (stopTime1 - startTime1));

    }
}
