package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter user ID: ");
            String userId = scanner.nextLine().trim();

            System.out.print("Enter email: ");
            String userEmail = scanner.nextLine().trim();

            User user = new User(userId, userEmail);

            if (user.authenticate()) {
                System.out.println("Authentication successful. Welcome to Bank Malakas");
                BankSystem startbank = new BankSystem();
                startbank.main();
            }
            else {
                System.out.println("Authentication failed. User not found or invalid credentials.");
            }
            scanner.close();
        }
    }
