package org.example;

import java.util.Scanner;

public class Authenticate {
    String username = "cchua@gmail.com";
    String password = "password";
    boolean correctLogin = false;

    Scanner scan = new Scanner(System.in);

    void setCorrectLogin() {
        do {
            System.out.print("Enter Username: ");
            username = scan.nextLine();

            System.out.print("Enter Password: ");
            password = scan.nextLine();

            if (username.equals(username) && password.equals(password)) {
                correctLogin = true;
                System.out.println("You have entered the correct login info");
                break;
            } else {
                System.out.println("Your login info was incorrect, please try again");
            }
        } while (correctLogin);

        System.out.println("You are now logged in");
    }
}
