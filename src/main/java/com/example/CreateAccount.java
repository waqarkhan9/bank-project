package com.example;

import java.util.Scanner;

import java.util.ArrayList;

public class CreateAccount {
    ArrayList<Bankaccount> customers = new ArrayList<Bankaccount>();
    Scanner sc = new Scanner(System.in);

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

    public void createAccount(int acc_no, String name, double balance) {

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
        customers.add(newAccount);
        System.out.println("Back to main menu");
        
    }

    public void getAccountList() {
        if (customers.isEmpty()) {
            System.out.println("No Customers found");

        }
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).getAccountDetails();

        }

    }

    public void accountOperations(Bankaccount targetAccount) {
        int option = 0;
        while (option != 4) {
            System.out.println("please select an option");
            System.out.println("1. Change Name");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Back to main Menu");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    targetAccount.setName();
                    targetAccount.getAccountDetails();
                    break;
                case 2:
                    targetAccount.deposit();
                    targetAccount.getBalance();
                case 3:
                    targetAccount.withdraw();
                    targetAccount.getBalance();
                case 4:
                    return;

                default:
                    System.out.println("invalid option try again");
                    break;
            }

        }

    }

    public void searchAccount() {
        String searchName;
        boolean found = false;

        System.out.println("Please Enter the name");
        searchName = sc.nextLine();

        for (Bankaccount obj : customers) {
            if (obj.getName().equals(searchName)) {
                System.out.println("Account Found");
                found = true;
                obj.getAccountDetails();
                accountOperations(obj);

            }

        }
        if (found == false) {
            System.out.println("Account NOT FOUND");
        }

    }

}
