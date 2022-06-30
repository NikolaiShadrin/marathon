package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player("Парфенов", random.nextInt(10) + 90);
        System.out.println(player1.getStamina());
        player1.run();
        System.out.println(player1.getStamina());

        Player player2 = new Player("Кофтун", random.nextInt(10) + 90);
        Player player3 = new Player("Бузникин", random.nextInt(10) + 90);
        Player player4 = new Player("Онопко", random.nextInt(10) + 90);
        Player player5 = new Player("Титов", random.nextInt(10) + 90);
        player5.info();
        Player player6 = new Player("Оленичев", random.nextInt(10) + 90);
        player6.info();

        Player player7 = new Player("Вечно лишний чел", random.nextInt(10) + 90);
        System.out.println(player7.getCountPlayers());


        for(int i=0;i<=100; i++) {
            player1.run();
            System.out.println(player1.getStamina());
        }







    }
}
