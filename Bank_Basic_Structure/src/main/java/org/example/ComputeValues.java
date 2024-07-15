package org.example;

public class ComputeValues {
    public static void main(String[] args) {

    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount) {
        if (amount > balance) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    void identifyPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        }
    }   else if (previousTransaction < 0) {
        System.out.println("Withdrawn " + Math.abs(previousTransaction));
    }   else {
        System.out.println("No recent transaction recorded");
    }
}
void displayMenu () {
    
}