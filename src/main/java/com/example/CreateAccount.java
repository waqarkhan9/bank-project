package com.example;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateAccount {
    ArrayList<Bankaccount> customers = new ArrayList<Bankaccount>();

    public CreateAccount() {
        Bankaccount ba = new Bankaccount(1, "Waqar", 5000);
        Bankaccount bb = new Bankaccount(2, "pter", 5000);
        Bankaccount bc = new Bankaccount(3, "john", 5000);
        Bankaccount bd = new Bankaccount(4, "ali", 5000);
        Bankaccount be = new Bankaccount(5, "khan", 5000);
        Bankaccount bf = new Bankaccount(6, "eshan", 5000);
        Bankaccount bg = new Bankaccount(7, "asif", 5000);
        Bankaccount bh = new Bankaccount(8, "mohsin", 5000);
        Bankaccount bi = new Bankaccount(9, "malik", 5000);
        Bankaccount bj = new Bankaccount(10, "savas", 5000);

        customers.add(ba);
        customers.add(bb);
        customers.add(bc);
        customers.add(bd);
        customers.add(be);
        customers.add(bf);
        customers.add(bg);
        customers.add(bh);
        customers.add(bi);
        customers.add(bj);

    }

    /*
     * public Bankaccount createAccount(int acc_no, String name, double balance) {
     * 
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Create an account");
     * System.out.println("please enter the account number");
     * acc_no = sc.nextInt();
     * System.out.println("please enter account holder name");
     * name = sc.next();
     * System.out.println("please enter initial balance for the account");
     * balance = sc.nextDouble();
     * 
     * Bankaccount newAccount = new Bankaccount(acc_no, name, balance);
     * System.out.println("New account created successfully");
     * newAccount.getAccountDetails();
     * customers.add(newAccount);
     * return newAccount;
     * }
     */
    public void getAccountList() {
        if (customers.isEmpty()) {
            System.out.println("No Customers found");

        }
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).getAccountDetails();

        }

    }

    public void searchAccount() {
        String searchName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name");
        searchName = sc.nextLine();

        if (customers.isEmpty()) {
            System.out.println("No Customers found");

        }
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().contains(searchName)) {
                getAccountList();
            }

        }
        sc.close();

    }

}
