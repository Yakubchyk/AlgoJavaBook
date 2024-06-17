package com.yk1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount ba1 = new BankAccount(100.00);

        System.out.printf("Befor: %.2f%n", ba1.getBalance());
        ba1.deposit(75.50);
        ba1.withdraw(20.35);
        System.out.printf("After: %.2f%n", ba1.getBalance());
        ba1.display();
    }
}
