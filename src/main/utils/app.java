package main.utils;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    Welcome to RealityCheck 🚀");
        System.out.println("====================================");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear the newline character

            switch (choice) {
                case 1:
                    System.out.println("🔒 Register functionality here (to be implemented)");
                    break;
                case 2:
                    System.out.println("🔑 Login functionality here (to be implemented)");
                    break;
                case 3:
                    System.out.println("👋 Exiting... Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

