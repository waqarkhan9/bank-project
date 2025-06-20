package com.example;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateAccount {
    ArrayList<Bankaccount> customers = new ArrayList<Bankaccount>();

    public static Bankaccount createAccount(int acc_no, String name, double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create an account");
        System.out.println("please enter the account number");
        acc_no = sc.nextInt();
        System.out.println("please enter account holder name");
        name = sc.next();
        System.out.println("please enter initial balance for the account");
        balance = sc.nextDouble();
        Bankaccount newAccount = new Bankaccount(acc_no, name, balance);
        System.out.println("New account created successfully");
        newAccount.getAccountDetails();
        return newAccount;
    }

    public static void main(String[] args) {

        createAccount(0, null, 0);

    }

}
