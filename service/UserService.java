package service;

import main.model.User;
import java.util.ArrayList;

public class UserService {
    private ArrayList<main.model.User> users = new ArrayList<>();
    private main.model.User currentUser = null;

    public void registerUser(int userID, String name, String email) {
        main.model.User user = new User(userID, name, email);
        users.add(user);
        System.out.println("✅ Registered Successfully!");
    }

    public boolean loginUser(int userID) {
        for (main.model.User user : users) {
            if (user.getUserID() == userID) {
                currentUser = user;
                System.out.println("✅ Logged in Successfully!");
                return true;
            }
        }
        System.out.println("❌ User not found.");
        return false;
    }

    public main.model.User getCurrentUser() {
        return currentUser;
    }

    public void listUsers() {
        for (main.model.User user : users) {
            System.out.println(user.getUserID() + ": " + user.getName());
        }
    }
}
