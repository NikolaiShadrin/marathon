package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Tatiana");
        User user2 = new User("Nikolai");
        User user3 = new User("Ilya");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "Ты пойдешь гулять?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Да, конечно пойду погулять");
        user2.sendMessage(user1, "Во сколько?");

        user3.sendMessage(user1, "Привет, предложил Папе погулять");
        user3.sendMessage(user1, "Ты пойдешь с нами?");
        user3.sendMessage(user1, "Нужно определиться со временем");

        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Мы как раз обсуждали это");
        user1.sendMessage(user3, "Пойдем через час");

        user3.sendMessage(user1, "Отлично!");

        user1.sendMessage(user3, "Илюша, классный");


        MessageDatabase.showDialog(user1,user3);

        MessageDatabase.showDialog(user1, user3);

    }
}
