package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreateAccount ca = new CreateAccount();

        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("***********************");
            System.out.println("Welcome to the Bank");
            System.out.println("1. Get customer list");
            System.out.println("2. Create a Bank Account");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    ca.getAccountList();
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

    }
}
