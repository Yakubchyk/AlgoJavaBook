package com.yk1;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transferTo(BankAccount destination, double amount) {

        this.balance -= amount;
        destination.deposit(amount);
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }
}
