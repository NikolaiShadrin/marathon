package day7;

public class Player {
    private int stamina;
    private String name;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    private static int countPlayers = 0;

    public Player(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers = countPlayers + 1;

    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }


    public void info() {
        int freePlaces = 6 - countPlayers;

        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободное место");
        } else if (countPlayers < 5) {
            System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных места");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
