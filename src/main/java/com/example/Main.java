package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankoperations bo = new Bankoperations();

        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("***********************");
            System.out.println("Welcome to the Bank");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    bo.getBalance();
                    break;
                case 2:
                    bo.deposit();
                    break;
                case 3:
                    bo.withdraw();
                    break;
                case 4:
                    bo.exit();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

    }
}