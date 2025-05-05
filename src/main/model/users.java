package main.model;

import java.util.LinkedList;

public class users{
    private int userID;
    private String name;
    private String email;
    private LinkedList<String> history;

    public users(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.history = new LinkedList<>();
    }

    // ➡️ Add to history
    public void addHistory(String record) {
        history.add(record);
    }

    // ➡️ Getters
    public int getUserID() { return userID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public LinkedList<String> getHistory() { return history; }
}
