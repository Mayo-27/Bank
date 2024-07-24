package org.example;

import java.util.Scanner;

public class ComputeValues {
    public static void main() {
        BankAccount logIn = new BankAccount();
        logIn.displayMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cName, String cId) {
        customerName = cName;
        customerId = cId;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void identifyPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn " + Math.abs(previousTransaction));
        } else {
            System.out.println("No recent transaction recorded");
        }
    }

    void displayMenu() {

        char option = '\0';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {

            System.out.println("=====================================================================================");
            System.out.print("Enter an Option : ");
            option = scan.next().charAt(0);
            switch(option) {

                case 'A':

                    System.out.println("-----------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("-----------------------------");
                    System.out.println("\n");
                    break;

                case 'B':

                    System.out.println("-----------------------------");
                    System.out.println("Enter an Amount to Deposit: ");
                    System.out.println("-----------------------------");
                    int amount = scan.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------");
                    System.out.println("Amount to Withdraw: ");
                    System.out.println("-----------------------------");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':

                    System.out.println("-----------------------------");
                    identifyPreviousTransaction();
                    System.out.println("-----------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("************************************************");
                    break;

                default:
                    System.out.println("Invalid Option!!!! Please Try Again...");
                    break;

            }
        } while(option != 'E');

        System.out.println("Thank You For Using Our Services");
    }
}
