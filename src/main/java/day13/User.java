package day13;


import java.util.*;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();

    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);

    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            return true;
        } else
            return false;

    }

    public void sendMessage(User user, String text) {

        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }


}
